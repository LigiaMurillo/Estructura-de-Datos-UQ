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



	public Nodo<T> getPrimero() {
		return primero;
	}



	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}



	public int getTamanio() {
		return tamanio;
	}



	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public boolean estaVacia (){

		return this.primero == null;
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

	public void agregarNodoCola (T dato){

		Nodo<T> nuevoNodo = new Nodo<T>(dato);
		Nodo<T> nodoAux = primero;
		if (this.primero == null)
			primero = nuevoNodo;
		else{
			while (nodoAux.getSiguiente() != null) nodoAux = nodoAux.getSiguiente();
			nodoAux.setSiguiente(nuevoNodo);
		}
		tamanio++;
	}

	public void eliminarNodo (T dato){

		Nodo<T> nodoEliminar = primero;
		Nodo<T> previo = null;
		Nodo<T> siguiente = null;
		boolean encontrado = false;

		while (nodoEliminar != null && encontrado == false){

			if (nodoEliminar.getInfo() == dato){
				encontrado = true;
			}else{
				previo = nodoEliminar;
				nodoEliminar = nodoEliminar.getSiguiente();
			}
		}

		if (encontrado = true){

			siguiente = nodoEliminar.getSiguiente();

			if (nodoEliminar == primero){
				primero = siguiente; //El siguiente queda como primero
				nodoEliminar = null; //Nodo eliminado
			}else{
				previo.setSiguiente(siguiente); //El anterior apunta a la referencia del nodo a eliminar
				nodoEliminar = null; //Se elimina el nodo
			}
			tamanio--;
		}
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

	public void vaciar() {

		Nodo<T> nodoEliminar = primero;

		while (!estaVacia()){
			nodoEliminar = primero;
			primero = primero.getSiguiente();
			nodoEliminar = null;
		}
	}
}