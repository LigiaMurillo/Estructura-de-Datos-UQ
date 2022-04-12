package co.edu.uniquindio.estructura.taller.modelo;

public class Cola<T> {
	
	Nodo<T> frente;
	Nodo<T> cola;
	int tam;
	
	public Cola() {
		frente = null;
		cola = null;
		tam = 0;
	}
	
	public boolean comprobarColaVacia (){
		
		return frente == null;
	}
	
	public void encolarElemento (T info){
		
		Nodo<T> nuevoNodo = new Nodo<>(info);
		
		if (comprobarColaVacia()){
			frente = nuevoNodo;
			cola = nuevoNodo;
		}else{
			cola.setSiguiente(nuevoNodo);
			cola = nuevoNodo;
		}
		tam++;
	}
	
	public T desencolarElemento (){
		
		if (frente == null) return null;
		if (frente == cola) cola = null;
		
		T aux = frente.getInfo();
		frente = frente.getSiguiente();
		tam--;
		return aux;
	}
	
	public String obtenerInfoCola (){
		
		String mensaje = "";
		Nodo<T> nodoAux = frente;
		
		while (nodoAux != null){
			mensaje+= nodoAux.getInfo() + "\n";
			nodoAux = nodoAux.getSiguiente();
		}
		return mensaje;
	}
}