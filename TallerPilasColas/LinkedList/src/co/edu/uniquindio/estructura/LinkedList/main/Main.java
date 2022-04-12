package co.edu.uniquindio.estructura.LinkedList.main;

import co.edu.uniquindio.estructura.LinkedList.listas.ListaSimpleCircular;
import co.edu.uniquindio.estructura.LinkedList.listas.ListaSimpleEnteros;
import co.edu.uniquindio.estructura.LinkedList.listas.NodoInteger;

public class Main {

	public static void main(String[] args) {
		
//		ListaSimpleEnteros lsEnteros = new ListaSimpleEnteros();
//		
//		lsEnteros.agregarNodo(new NodoInteger(3));
//		lsEnteros.agregarNodo(new NodoInteger(5));
//		lsEnteros.agregarNodo(new NodoInteger(0));
//		lsEnteros.agregarNodo(new NodoInteger(9));
//		lsEnteros.agregarNodoAlFinal(new NodoInteger(10));
//		lsEnteros.mostrarNodos();
//		
//		lsEnteros.eliminarNodoCabeza();
//		
//		lsEnteros.mostrarNodos();
		
		ListaSimpleCircular lsCircularEnteros = new ListaSimpleCircular();
		
		lsCircularEnteros.agregarNoodCabeza(new NodoInteger(1));
		lsCircularEnteros.agregarNoodCabeza(new NodoInteger(4));
		lsCircularEnteros.agregarNoodCabeza(new NodoInteger(9));
		lsCircularEnteros.mostrarNodos();
	}
}