package edu.co.uniquindio;

public class Main {

    public static void main(String[] args) {

        Pila<String> pila = new Pila<>();
        pila.insertar(new Nodo("Hola"));
        pila.insertar(new Nodo("Mundo"));
        pila.insertar(new Nodo("Elemento a quitar"));
        System.out.println(pila);
        System.out.println(pila.quitar());
        System.out.println(pila);

        Cola<String> cola = new Cola<>();
        cola.insertar(new Nodo("Elemento a quitar"));
        cola.insertar(new Nodo("Hola"));
        cola.insertar(new Nodo("Mundo"));
        System.out.println(cola);
        System.out.println(cola.quitar());
        System.out.println(cola);

    }
}
