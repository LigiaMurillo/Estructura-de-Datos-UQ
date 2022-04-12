package co.edu.uniquindio.estructura.taller.punto3;

import co.edu.uniquindio.estructura.taller.modelo.Pila;

public class Main {

	public static void main(String[] args) {
		
		Pila<Integer> pila1 = new Pila<>();
		pila1.apilar(2);
		pila1.apilar(4);
		Pila<Integer> pila2 = new Pila<>();
		pila2.apilar(9);
		pila2.apilar(5);
		Pila<Integer> pilaConcatenada = concatenarPilas(pila1, pila2);
		pilaConcatenada.obtenerInfoPila();
		System.out.println(pilaConcatenada.obtenerInfoPila());
	}

	private static Pila<Integer> concatenarPilas(Pila<Integer> pila1, Pila<Integer> pila2) {
		
		while (!pila2.comprobarPilaVacia()) pila1.apilar(pila2.obtenerTope());
		return pila1;
	}
}
