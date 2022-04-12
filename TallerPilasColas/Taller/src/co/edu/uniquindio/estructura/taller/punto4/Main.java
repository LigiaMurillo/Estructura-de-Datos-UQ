package co.edu.uniquindio.estructura.taller.punto4;

import co.edu.uniquindio.estructura.taller.modelo.Cola;
import co.edu.uniquindio.estructura.taller.modelo.Pila;

public class Main {

	public static void main(String[] args) {

		Pila<Integer> pila = new Pila<>();

		while (pila.getTamanio() < 10) pila.apilar((int) (Math.random()*(100-1)+1));

		Cola<Integer> cola = organizarParesImpares (pila);
		System.out.println("Pila:");
		System.out.println(pila.obtenerInfoPila());
		System.out.println("Cola:");
		System.out.println(cola.obtenerInfoCola());
	}

	private static Cola<Integer> organizarParesImpares(Pila<Integer> pila) {

		Cola<Integer> colaPares = new Cola<>();
		Cola<Integer> colaImpares = new Cola<>();
		int num;

		while (!pila.comprobarPilaVacia()){
			num = pila.obtenerTope();
			if (num % 2 == 0)
				colaPares.encolarElemento(num);
			else
				colaImpares.encolarElemento(num); //Cola temporal de impares
		}
		while (!colaImpares.comprobarColaVacia()) pila.apilar(colaImpares.desencolarElemento());
		return colaPares;
	}
}