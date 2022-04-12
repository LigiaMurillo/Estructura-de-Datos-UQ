package co.edu.uniquindio.estructura.LinkedList.listas;

import java.util.Iterator;

public class ListaSimpleEnteros implements Iterable<NodoInteger>{

//	Atributos y relaciones

	private NodoInteger nodoPrimero;
	private int tamanio;

//	Constructor

	public ListaSimpleEnteros() {
		super();
		this.nodoPrimero = null;
		this.tamanio = 0;
	}

//	Metodos set/get

	public NodoInteger getNodoPrimero() {
		return nodoPrimero;
	}

	public void setNodoPrimero(NodoInteger nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void agregarNodo (NodoInteger nuevoNodo){

		if(nodoPrimero == null)
			nodoPrimero = nuevoNodo;
		else{
			nuevoNodo.setNodoSiguiente(nodoPrimero);
			nodoPrimero = nuevoNodo;
		}
		tamanio++;
	}

	public void agregarNodoAlFinal (NodoInteger nuevoNodo){

		if (nodoPrimero == null){
			nodoPrimero = nuevoNodo;
		}
		NodoInteger nodoAux = nodoPrimero;
		while (nodoAux.getNodoSiguiente() != null) nodoAux = nodoAux.getNodoSiguiente();
		nodoAux.setNodoSiguiente(nuevoNodo);
		tamanio++;
	}

	public void mostrarNodos (){

		NodoInteger nodoAux = nodoPrimero;

		while (nodoAux!= null){
			System.out.print("[" + nodoAux.getValor() + "]-->");
			nodoAux = nodoAux.getNodoSiguiente();
		}
		System.out.println("\n");
	}

	public void eliminarNodoCabeza() {

		if (nodoPrimero != null){
			if(nodoPrimero.getNodoSiguiente() == null)
				nodoPrimero = null;
			else{
				NodoInteger nodoTemp = nodoPrimero.getNodoSiguiente();
				nodoPrimero.setNodoSiguiente(null);
				nodoPrimero = nodoTemp;
				tamanio--;
			}
		}
	}

	@Override
	public Iterator<NodoInteger> iterator() {
		
		return new Iterador();
	}
	
	public class Iterador implements Iterator<NodoInteger>{
		
		private NodoInteger nodo;
		
		
		public Iterador() {
			super();
			this.nodo = nodoPrimero;
		}

		@Override
		public boolean hasNext() {
			
			return nodo!=null;
		}

		@Override
		public NodoInteger next() {
			NodoInteger nodoActual = nodo;
			nodo = nodo.getNodoSiguiente();
			return nodoActual;
		}
	}
}