package co.edu.uniquindio.list;

import java.util.Iterator;

public class IteradorNodoEnlaceSimple<T> implements Iterator<NodoEnlaceSimple<T>> {

    private NodoEnlaceSimple<T> actual;
    private NodoEnlaceSimple<T> cabeza;
    private boolean bandera = false;

    public IteradorNodoEnlaceSimple(NodoEnlaceSimple<T> cabeza) {
        this.cabeza = cabeza;
        this.actual = cabeza;
    }

    @Override
    public boolean hasNext() {
        if (this.actual != null) {
            if (this.bandera == false) {
                this.bandera = true;
            }
            else if (this.actual == this.cabeza) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public NodoEnlaceSimple<T> next() {
        NodoEnlaceSimple<T> current = this.actual;
        this.actual = this.actual.getSiguiente();
        return current;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
