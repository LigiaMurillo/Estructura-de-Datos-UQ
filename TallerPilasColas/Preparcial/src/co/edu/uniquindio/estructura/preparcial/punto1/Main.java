package co.edu.uniquindio.estructura.preparcial.punto1;

import co.edu.uniquindio.estructura.taller.modelo.ListaSimple;
import co.edu.uniquindio.estructura.taller.modelo.Nodo;
import co.edu.uniquindio.estructura.taller.modelo.Pila;

public class Main {

	public static void main(String[] args) {
		
		ListaSimple<Integer> ls = new ListaSimple<>();
		ls.agregarNodo(3);
		ls.agregarNodo(2);
		ls.agregarNodo(1);
		ls.listar();
		invertirLista (ls);
	}

	private static void invertirLista(ListaSimple<Integer> ls) {
		
		Pila<Integer> pilaTemp = new Pila<>();
		
		for (Nodo<Integer> nodo : ls) {
			pilaTemp.apilar(nodo.getInfo());
		}
		ls.vaciar();
		
		while (!pilaTemp.comprobarPilaVacia()) ls.agregarNodoCola(pilaTemp.obtenerTope());
		
		ls.listar();
	}
}