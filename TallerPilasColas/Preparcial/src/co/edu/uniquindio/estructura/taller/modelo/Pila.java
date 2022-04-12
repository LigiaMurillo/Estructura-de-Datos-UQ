package co.edu.uniquindio.estructura.taller.modelo;

public class Pila <T>{
	
	Nodo<T> tope;
	int tamanio;
	
	public Pila() {
		this.tope = null;
		this.tamanio = 0;
	}
	
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public boolean comprobarPilaVacia (){
		
		return tope == null;
	}
	
	public void apilar(T value){
		
		Nodo<T> nuevoNodo = new Nodo<T>(value);
		
		if (comprobarPilaVacia())
			tope = nuevoNodo;
		else{
			nuevoNodo.setSiguiente(tope);
			tope = nuevoNodo;
		}
		tamanio ++;
	}
	
	public T obtenerTope (){
		
		T aux = tope.getInfo();
		tope = tope.getSiguiente();
		tamanio --;
		return aux;
	}
	
	public T obtenerInfoTope (){
		
		return tope.getInfo();
	}
	
	public String obtenerInfoPila (){
		
		Nodo<T> nodoAux = tope;
		String content = "";
		
		while (nodoAux != null){
			content += nodoAux.getInfo() + "\n";
			nodoAux = nodoAux.getSiguiente();
		}
		return content;
	}
	
	public void eliminarNodo (T info){
		
		Pila<T> pilaTemp = new Pila<>();
		boolean eliminado = false;
		
		while (tope != null && eliminado == false){
			if (info == tope.getInfo()){
				tope = tope.getSiguiente();
				tamanio--;
				eliminado = true;
			}else{
				pilaTemp.apilar(this.obtenerTope());
			}
		}
		while (!pilaTemp.comprobarPilaVacia()) this.apilar(pilaTemp.obtenerTope());
	}

	public void apilarLista(ListaSimple<T> lista) {
		
		for (Nodo<T> nodo : lista) {
			apilar(nodo.getInfo());
		}
	}
}