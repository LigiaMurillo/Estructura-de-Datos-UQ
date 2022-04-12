package Taller1;

import java.util.Iterator;

import co.edu.uniquindio.estructura.LinkedList.listas.ListaSimpleEnteros;
import co.edu.uniquindio.estructura.LinkedList.listas.NodoInteger;

public class Main {

	public static void main(String[] args) {
		
		ListaSimpleEnteros lsEnteros = new ListaSimpleEnteros();
		lsEnteros.agregarNodo(new NodoInteger(4));
		lsEnteros.agregarNodo(new NodoInteger(3));
		lsEnteros.agregarNodo(new NodoInteger(1));
		lsEnteros.agregarNodo(new NodoInteger(2));
		lsEnteros.agregarNodo(new NodoInteger(7));
		lsEnteros.agregarNodo(new NodoInteger(8));
		
		lsEnteros.mostrarNodos();
		
		ListaSimpleEnteros lsEnterosImpares = buscarNodosImpares (lsEnteros);
		
		lsEnterosImpares.mostrarNodos();
		
		lsEnteros.mostrarNodos();
	}

	private static ListaSimpleEnteros buscarNodosImpares(ListaSimpleEnteros lsEnteros) {
		
		Iterator<NodoInteger> iterador = lsEnteros.iterator();
		ListaSimpleEnteros lsEnterosImpares = new ListaSimpleEnteros(); //Lista para retornar
		for (NodoInteger nodoInteger : lsEnteros) {
			if(nodoInteger.getValor() % 2 != 0){
				lsEnterosImpares.agregarNodo(new NodoInteger(nodoInteger.getValor()));
			}
		}
		return lsEnterosImpares;
	}
}