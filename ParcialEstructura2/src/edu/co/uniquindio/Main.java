package edu.co.uniquindio;

public class Main {

	public static void main(String[] args) {
		
		/*NodoCarta carta1 = new NodoCarta(1, "4");
		NodoCarta carta2 = new NodoCarta(2, "7");
		NodoCarta carta3 = new NodoCarta(1, "5");
		NodoCarta carta4 = new NodoCarta(4, "2");
		
		Pila pila = new Pila();
		
		pila.insertar(carta1);
		pila.insertar(carta2);
		pila.insertar(carta3);
		pila.insertar(carta4);
		
		System.out.println(pila);
	
		System.out.println(pila.buscar(1,"5"));*/
		
		ArbolBinario arbol = new ArbolBinario();
		
		arbol.insertar(1, "5");
		arbol.insertar(2, "7");
		arbol.insertar(1, "3");
		arbol.insertar(1, "4");
		arbol.insertar(3, "3");
		
		System.out.println(arbol);

	}

}
