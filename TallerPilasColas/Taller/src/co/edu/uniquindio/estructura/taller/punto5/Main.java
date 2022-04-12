package co.edu.uniquindio.estructura.taller.punto5;

import co.edu.uniquindio.estructura.taller.modelo.Pila;

public class Main {

	public static void main(String[] args) {
		
		Pila<Integer> pila = new Pila<>();
		pila.apilar(2);
		pila.apilar(5);
		pila.apilar(3);
		pila.apilar(8);
		pila.apilar(6);
		pila.apilar(10);
		pila.apilar(3);
		System.out.println(pila.obtenerInfoPila());
		
		pila.eliminarNodo(5);
		
		System.out.println(pila.obtenerInfoPila());
	}
}