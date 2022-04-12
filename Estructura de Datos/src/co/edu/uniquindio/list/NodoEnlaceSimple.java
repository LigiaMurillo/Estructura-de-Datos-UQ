package co.edu.uniquindio.list;

import java.lang.reflect.Array;

public class NodoEnlaceSimple<T> implements Comparable<T> {

    protected NodoEnlaceSimple<T> siguiente;
    protected T t;

    public NodoEnlaceSimple(T t) {
        this.t = t;
    }

    public NodoEnlaceSimple getSiguiente() {
        return siguiente;
    }

    protected void setSiguiente(NodoEnlaceSimple<T> item) {
        this.siguiente = item;
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    @Override
    public int compareTo(T t) {
        if (this.t instanceof Comparable<?>) {
            Comparable<T> comparable = (Comparable<T>) this.t;
            return comparable.compareTo(t);
        } else {
            if (this.t == t) {
                return 0;
            }
            return 1;
        }
    }

    public void revertirContenidoNodo(){

        Array<T> cadena= t.getCharArray;
        int longitudCadena=cadena.length-1;
        Funtions.revertirPalabra(cadena, longitudCadena);
    }
    public class Funtions {

        public static void revertirPalabra(char[] cadena, int longitudCadena) {

            if(longitudCadena>=0) {
                System.out.print(cadena[longitudCadena]);
                revertirPalabra(cadena, longitudCadena-1);
            }
        }
    }
}
