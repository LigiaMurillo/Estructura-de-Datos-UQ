package co.edu.uniquindio.estructura.LinkedList.listas;

import java.util.Iterator;
import java.util.ListIterator;

public class ListaDobleEnlazada <T> implements Iterable<NodoIntegerDoble>{

	private NodoIntegerDoble primerNodo;
	private NodoIntegerDoble ultimoNodo;
	private int tamanio;

	public ListaDobleEnlazada() {
		super();
		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamanio = 0;
	}

	public NodoIntegerDoble getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(NodoIntegerDoble primerNodo) {
		this.primerNodo = primerNodo;
	}

	public NodoIntegerDoble getUltimoNodo() {
		return ultimoNodo;
	}

	public void setUltimoNodo(NodoIntegerDoble ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void agregarNodo(NodoIntegerDoble nuevoNodo){

		if (primerNodo == null){
			primerNodo = nuevoNodo;
			ultimoNodo = nuevoNodo;
		}
		else{
			nuevoNodo.setNodoSiguiente(primerNodo);
			primerNodo.setNodoAnterior(nuevoNodo);
			primerNodo = nuevoNodo;
		}
		tamanio ++;
	}

	public void mostrarNodos(){

		NodoIntegerDoble nodoAux = primerNodo;

		while (nodoAux != null){
			System.out.print("<-[" + nodoAux.getValor() + "]->");
			nodoAux = nodoAux.getNodoSiguiente();
		}
		System.out.println();
	}

	public void mostrarNodosInversos (){

		NodoIntegerDoble nodoAux = ultimoNodo;

		while (nodoAux != null){
			System.out.print("<-[" + nodoAux.getValor() + "]->");
			nodoAux = nodoAux.getNodoAnterior();
		}
		System.out.println();
	}

	@Override
	public Iterator<NodoIntegerDoble> iterator() {
		return new Iterador();
	}

	public class Iterador implements Iterator<NodoIntegerDoble>{

		private NodoIntegerDoble nodo;

		public Iterador() {
			super();
			this.nodo = primerNodo;
		}

		@Override
		public boolean hasNext() {
			return nodo != null;
		}

		@Override
		public NodoIntegerDoble next() {
			NodoIntegerDoble nodoAux = nodo;
			nodo = nodo.getNodoSiguiente();
			return nodoAux;
		}
	}
}