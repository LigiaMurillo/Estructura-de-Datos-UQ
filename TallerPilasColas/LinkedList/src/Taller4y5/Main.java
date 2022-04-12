package Taller4y5;

import co.edu.uniquindio.estructura.LinkedList.listas.ListaDobleEnlazada;
import co.edu.uniquindio.estructura.LinkedList.listas.NodoIntegerDoble;

public class Main {

	public static void main(String[] args) {
		
		ListaDobleEnlazada ldEnteros = new ListaDobleEnlazada();
		
		ldEnteros.agregarNodo(new NodoIntegerDoble(2));
		ldEnteros.agregarNodo(new NodoIntegerDoble(1));
		ldEnteros.agregarNodo(new NodoIntegerDoble(6));
		
		ldEnteros.mostrarNodos();
		ldEnteros.mostrarNodosInversos();
	}
}