package edu.co.uniquindio;

public class Nodo<T> {
    private Nodo<T> siguiente;
    private T t;

    public Nodo(T t) {
        this.t = t;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
