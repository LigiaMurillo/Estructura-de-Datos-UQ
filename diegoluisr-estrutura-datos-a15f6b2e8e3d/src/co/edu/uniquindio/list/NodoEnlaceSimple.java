package co.edu.uniquindio.list;

public class NodoEnlaceSimple<T> {

    protected NodoEnlaceSimple<T> siguente;
    protected T t;

    public NodoEnlaceSimple(T t) {
        this.t = t;
    }

    public NodoEnlaceSimple getSiguiente() {
        return siguente;
    }

    protected void setSiguente(NodoEnlaceSimple<T> item) {
        this.siguente = item;
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
