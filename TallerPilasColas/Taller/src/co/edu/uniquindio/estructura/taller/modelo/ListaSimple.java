package co.edu.uniquindio.estructura.taller.modelo;

import java.util.Iterator;

public class ListaSimple <T> implements Iterable<Nodo<T>>{
	
	Nodo<T> primero;
	int tamanio;
	
	public ListaSimple() {
		super();
		primero = null;
		tamanio = 0;
	}
	
	
	
	public int getTamanio() {
		return tamanio;
	}



	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}



	public void agregarNodo (T Dato){
		
		Nodo<T> nuevoNodo = new Nodo<T>(Dato);
		
		if (this.primero == null)
			primero = nuevoNodo;
		else{
			nuevoNodo.setSiguiente(primero);
			primero = nuevoNodo;
		}
		tamanio++;
	}
	
	public void listar(){
		
		for (Nodo<T> nodo : this) {
			System.out.print("[" + nodo.getInfo() + "]->");
		}
		System.out.println();
	}

	@Override
	public Iterator<Nodo<T>> iterator() {
		
		return new Iterador();
	}
	
	public class Iterador implements Iterator<Nodo<T>>{
		
		Nodo<T> nodoAux;
		
		public Iterador() {
			super();
			this.nodoAux = primero;
		}

		@Override
		public boolean hasNext() {
			
			return nodoAux != null;
		}

		@Override
		public Nodo<T> next() {
			
			Nodo<T> temp = nodoAux;
			nodoAux = nodoAux.getSiguiente();
			return temp;
		}
	}
}