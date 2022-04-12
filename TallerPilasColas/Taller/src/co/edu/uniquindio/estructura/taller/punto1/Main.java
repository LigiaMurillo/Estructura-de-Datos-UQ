package co.edu.uniquindio.estructura.taller.punto1;

import java.lang.reflect.Array;

import co.edu.uniquindio.estructura.taller.modelo.Pila;

public class Main {

	public static <T> void main(String[] args) {
		
		Pila<Character> pila1 = new Pila<>();
		Pila<Character> pila2 = new Pila<>();
		String palabra = "maicraxd";
		
		if (comprobarPal(palabra, pila1, pila2))
			System.out.println("La palabra : " + palabra + " es palindromo.");
		else
			System.out.println("La palabra : " + palabra + " no es palindromo.");
	}

	private static boolean comprobarPal(String palabra, Pila<Character> pila1, Pila<Character> pila2) {
		char[] array = palabra.toCharArray();
		int i = 0;
		char c1;
		char c2;
		while (i < array.length){
			pila1.apilar(array[i]); //Apila al derecho
			i++;
		}
		i--;
		while (i >= 0){
			pila2.apilar(array[i]); //Apila al revez
			i--;
		}
		while (!pila1.comprobarPilaVacia() && !pila2.comprobarPilaVacia()){
			c1 = pila1.obtenerTope(); //Toma el tope de la pila1
			c2 = pila2.obtenerTope(); //Toma el tope de la pila2
			if (c1 != c2)
				return false; //Si los topes son diferentes retorna false
		}
		return true; //Si no encontro diferencias en los topes retorna true
	}
}