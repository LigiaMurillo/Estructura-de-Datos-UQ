package co.edu.uniquindio.list;

public class NodoEnlaceDoble<T> {

    protected NodoEnlaceDoble<T> anterior;
    protected NodoEnlaceDoble<T> siguiente;
    protected T t;

    public NodoEnlaceDoble(T t) {
        this.t = t;
    }

    public NodoEnlaceDoble getSiguiente() {
        return siguiente;
    }

    protected void setSiguiente(NodoEnlaceDoble<T> item) {
        this.siguiente = item;
    }

    protected void setAnterior(NodoEnlaceDoble<T> item) {
        this.anterior = item;
    }

    public NodoEnlaceDoble getAnterior() {
        return anterior;
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
}
