package co.edu.uniquindio.estructura.taller.modelo;

import java.util.Iterator;
import java.util.ListIterator;

public class ListaDobleEnlazada <T> implements Iterable<Nodo<T>>{

	private Nodo<T> primerNodo;
	private Nodo<T> ultimoNodo;
	private int tamanio;

	public ListaDobleEnlazada() {
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

	public void agregarNodo(T dato){

		Nodo<T> nuevoNodo = new Nodo<T>(dato);
		if (primerNodo == null){
			primerNodo = nuevoNodo;
			ultimoNodo = nuevoNodo;
		}
		else{
			nuevoNodo.setSiguiente(primerNodo);
			primerNodo.setAnterior(nuevoNodo);
			primerNodo = nuevoNodo;
		}
		tamanio ++;
	}

	public void mostrarNodos(){

		for (Nodo<T> nodo : this) {
			System.out.print("<-[" + nodo.getInfo() + "]->");
		}
		System.out.println();
	}

	public void mostrarNodosInversos (){

		Nodo<T> nodoAux = ultimoNodo;

		for (Nodo<T> nodo : this) {
			System.out.println();
		}
		System.out.println();
	}

	@Override
	public Iterator<Nodo<T>> iterator() {
		return new Iterador();
	}

	public class Iterador implements Iterator<Nodo<T>>{

		private Nodo<T> nodo;

		public Iterador() {
			super();
			this.nodo = primerNodo;
		}

		@Override
		public boolean hasNext() {
			return nodo != null;
		}

		@Override
		public Nodo<T> next() {
			Nodo<T> nodoAux = nodo;
			nodo = nodo.getSiguiente();
			return nodoAux;
		}
	}
}