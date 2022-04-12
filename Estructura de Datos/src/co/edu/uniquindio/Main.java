package co.edu.uniquindio;

import co.edu.uniquindio.list.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccion una opcion:\n 1. Lista Simple Enlazada\n 2. Lista Doble Enlazada\n 3. Lista Simple Circular Enlazada\n 4. Lista Doble Circular Enlazada\n 5. Triangulo");
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
            case 5:
                String result = getTriangulo(6, 6);
                System.out.println(result);
        }
    }

    public static void sll() {
        ListaSimpleEnlazada<Integer> stringList = new ListaSimpleEnlazada<>(new NodoEnlaceSimple<>(1));
        stringList.add(new NodoEnlaceSimple<>(2));
        stringList.add(new NodoEnlaceSimple<>(3));
        stringList.add(new NodoEnlaceSimple<>(4));
        // stringList.add(new NodoEnlaceSimple<>("Quinto"));

        // System.out.println(stringList.remove("Primer"));
        System.out.println(stringList.lenght());

//        for (NodoEnlaceSimple<String> item: stringList) {
//            System.out.println(item);
//        }
    }

    public static void dll() {
        ListaDobleEnlazada<String> stringList = new ListaDobleEnlazada<>(new NodoEnlaceDoble<>("Primer"));
        stringList.add(new NodoEnlaceDoble<>("Segundo"));
        stringList.add(new NodoEnlaceDoble<>("Tercero"));
        stringList.add(new NodoEnlaceDoble<>("Cuarto"));

        System.out.println(stringList.remove("Segundo"));
        System.out.println(stringList);

        ListaDobleEnlazada<String> stringListReverse = stringList.reverse();
        System.out.println(stringListReverse);
    }

    public static void csll() {
        ListaSimpleCircularEnlazada<String> stringList = new ListaSimpleCircularEnlazada<>();
        stringList.add(new NodoEnlaceSimple<>("Primero"));
        stringList.add(new NodoEnlaceSimple<>("Segundo"));
        stringList.add(new NodoEnlaceSimple<>("Tercero"));
        stringList.add(new NodoEnlaceSimple<>("Cuarto"));
        // stringList.add(new NodoEnlaceSimple<>("Segundo-y-Medio"), 1);

        // System.out.println(stringList.remove("Segundo"));
        System.out.println(stringList);

        /* for (NodoEnlaceSimple<String> item: stringList) {
            System.out.println(item);
        } */
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

    public static String getTriangulo(int base, int altura) {
        return getTriangulo(base, altura, altura);
    }

    public static String getTriangulo(int base, int altura, int alturaActual) {
        String result = "";
        if (alturaActual < 1) {
            return result;
        }
        String baseString = "";
        for (int i = 0; i < base; i++) {
            baseString += "*";
        }

        result += getTriangulo((int) Math.ceil((double) base * ( (double) alturaActual) / (double) altura), altura, alturaActual - 1) + "\n" + baseString;
        return result;
    }

}
