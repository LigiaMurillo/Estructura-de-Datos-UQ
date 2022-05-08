package edu.co.uniquindio;

public class Cola<T> {

    private Nodo<T> cabeza;

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
        Nodo<T> actual = cabeza;
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
        }
        return actual;
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
