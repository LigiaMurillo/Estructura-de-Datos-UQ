package co.edu.uniquindio.estructura.taller.modelo;

public class ListaSimpleCircular <T>{

	Nodo<T> primerNodo;
	Nodo<T> ultimoNodo;
	int tamanio;

	public ListaSimpleCircular() {
		super();
		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamanio = 0;
	}

	public Nodo<T> getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(Nodo<T> primerNodo) {
		this.primerNodo = primerNodo;
	}

	public Nodo<T> getUltimoNodo() {
		return ultimoNodo;
	}

	public void setUltimoNodo(Nodo<T> ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void agregarNoodCabeza (T dato){

		Nodo<T> nuevoNodo = new Nodo<T>(dato);
		if (primerNodo == null){
			primerNodo = nuevoNodo;
			ultimoNodo = nuevoNodo;
			ultimoNodo.setSiguiente(primerNodo);
		}
		else{
			nuevoNodo.setSiguiente(primerNodo);
			primerNodo = nuevoNodo;
			ultimoNodo.setSiguiente(primerNodo);
		}
		tamanio++;
	}

//	public void agregarNodoFinal (NodoInteger nuevoNodo){
//
//		if (primerNodo == null){
//			primerNodo = nuevoNodo;
//			ultimoNodo = nuevoNodo;
//			ultimoNodo.setNodoSiguiente(primerNodo);
//		}else{
//
//		}
//	}

	public void mostrarNodos (){

		Nodo<T> nodoAux = primerNodo;
		int i = 0;
		while (i <= tamanio){
			System.out.print("[" + nodoAux.getInfo() + "]-->");
			nodoAux = nodoAux.getSiguiente();
			i++;
		}
	}
}