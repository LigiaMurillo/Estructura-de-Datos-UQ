package edu.co.uniquindio;

public class Pila<T> {

    private Nodo<T> cabeza;

    public Pila() {
    }

    public void insertar(Nodo<T> nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
        }
        else {
            Nodo<T> actual = cabeza;

            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Nodo<T> quitar() {
        Nodo<T> anterior = null;
        Nodo<T> actual = cabeza;

        if (cabeza.getSiguiente() == null) {
            cabeza = null;
            return actual;
        }

        while(actual.getSiguiente() != null) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        anterior.setSiguiente(null);
        return actual;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void limpiar() {
        cabeza = null;
    }

    public int size() {
        int valor = 0;
        if (cabeza != null) {
            Nodo<T> actual = cabeza;
            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
                valor ++;
            }
        }
        return valor;
    }

}








