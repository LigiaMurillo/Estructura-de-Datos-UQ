package co.edu.uniquindio.estructura.taller.punto2;

import co.edu.uniquindio.estructura.taller.modelo.ListaSimple;
import co.edu.uniquindio.estructura.taller.modelo.Pila;

public class Main {

	public static void main(String[] args) {
		
		ListaSimple<Integer> listaNumeros = new ListaSimple<>();
		Pila<Integer> pilaNumeros = new Pila<>();
		
		while (listaNumeros.getTamanio() < 10) listaNumeros.agregarNodo((int) (Math.random()*(10-1)+1));
		pilaNumeros.apilarLista(listaNumeros);
		listaNumeros.listar();
		System.out.println(pilaNumeros.obtenerInfoPila());
	}
}