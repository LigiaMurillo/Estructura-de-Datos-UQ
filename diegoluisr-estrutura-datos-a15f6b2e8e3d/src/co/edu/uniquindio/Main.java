package co.edu.uniquindio;

import co.edu.uniquindio.list.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccion una opcion:\n 1. Lista Simple Enlazada\n 2. Lista Doble Enlazada\n 3. Lista Simple Circular Enlazada\n 4. Lista Doble Circular Enlazada");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                sll();
                break;
            case 2:
                dll();
                break;
            case 3:
                csll();
                break;
            case 4:
                cdll();
                break;
        }
    }

    public static void sll() {
        ListaSimpleEnlazada<String> stringList = new ListaSimpleEnlazada<>(new NodoEnlaceSimple<>("Primer"));
        stringList.add(new NodoEnlaceSimple<>("Segundo"));
        stringList.add(new NodoEnlaceSimple<>("Tercero"));
        stringList.add(new NodoEnlaceSimple<>("Cuarto"));

        // System.out.println(stringList.remove("Primer"));
        System.out.println(stringList);

        for (NodoEnlaceSimple<String> item: stringList) {
            System.out.println(item);
        }
    }

    public static void dll() {
        ListaDobleEnlazada<String> stringList = new ListaDobleEnlazada<>(new NodoEnlaceDoble<>("Primer"));
        stringList.add(new NodoEnlaceDoble<>("Segundo"));
        stringList.add(new NodoEnlaceDoble<>("Tercero"));
        stringList.add(new NodoEnlaceDoble<>("Cuarto"));

        System.out.println(stringList.remove("Segundo"));
        System.out.println(stringList);

        for (NodoEnlaceDoble<String> item: stringList) {
            System.out.println(item);
        }
    }

    public static void csll() {
        ListaSimpleCircularEnlazada<String> stringList = new ListaSimpleCircularEnlazada<>();
        stringList.add(new NodoEnlaceSimple<>("Primero"));
        stringList.add(new NodoEnlaceSimple<>("Segundo"));
        stringList.add(new NodoEnlaceSimple<>("Tercero"));
        stringList.add(new NodoEnlaceSimple<>("Cuarto"));

        // System.out.println(stringList.remove("Segundo"));
        System.out.println(stringList);

        for (NodoEnlaceSimple<String> item: stringList) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la posicion en la que desea ingresar el nuevo nodo");
        int posicion = scanner.nextInt();


        stringList.addAnyPosition(new NodoEnlaceSimple<>("Ligia"),2);


        for (NodoEnlaceSimple<String> item: stringList) {
            System.out.println(item);
        }

    }

    public static void cdll() {
        ListaDobleCircularEnlazada<String> stringList = new ListaDobleCircularEnlazada<>();
        stringList.add(new NodoEnlaceDoble<>("Primero"));
        stringList.add(new NodoEnlaceDoble<>("Segundo"));
        stringList.add(new NodoEnlaceDoble<>("Tercero"));
        stringList.add(new NodoEnlaceDoble<>("Cuarto"));

        System.out.println(stringList.remove("Segundo"));
        System.out.println(stringList);

        for (NodoEnlaceDoble<String> item: stringList) {
            System.out.println(item);
        }
    }

}
