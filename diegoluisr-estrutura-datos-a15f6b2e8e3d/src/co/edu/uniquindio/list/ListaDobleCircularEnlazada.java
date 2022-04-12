package co.edu.uniquindio.list;

import java.util.Iterator;

public class ListaDobleCircularEnlazada<T> implements Iterable<NodoEnlaceDoble<T>> {

    private NodoEnlaceDoble<T> cabeza;

    public ListaDobleCircularEnlazada() {

    }

    public ListaDobleCircularEnlazada(NodoEnlaceDoble<T> head) {
        this.add(head);
    }

    public void add(NodoEnlaceDoble<T> item) {
        if (cabeza == null) {
            this.cabeza = item;
            this.cabeza.setAnterior(this.cabeza);
            this.cabeza.setSiguiente(this.cabeza);
        }
        else {
            NodoEnlaceDoble<T> ultimo = this.cabeza.getAnterior();
            item.setSiguiente(ultimo.getSiguiente());
            item.setAnterior(this.cabeza.getAnterior());
            ultimo.setSiguiente(item);
        }
    }

    public NodoEnlaceDoble<T> remove(T t) {
        if (this.cabeza == null) {
            return null;
        }
        NodoEnlaceDoble<T> previous = this.cabeza.getAnterior();
        NodoEnlaceDoble<T> current = this.cabeza;
        NodoEnlaceDoble<T> next = this.cabeza.getSiguiente();

        // If the item is the first element.
        if (current.get().equals(t) && previous == null) {
            if (this.cabeza.getSiguiente() != null) {
                ((NodoEnlaceDoble<?>) this.cabeza.getSiguiente()).setAnterior(null);
            }
            this.cabeza = next;
            return current;
        }

        while(next != null) {
            if (current.get().equals(t)) {
                previous.setSiguiente((NodoEnlaceDoble<T>) next);
                if (next != null) {
                    next.setAnterior(previous);
                }
                current.setSiguiente(null);
                current.setAnterior(null);
                return current;
            }
            previous = current;
            current = next;
            next = (NodoEnlaceDoble<T>) next.getSiguiente();
        }

        // If the item is the last element.
        if (current.get().equals(t) && previous != null) {
            previous.setSiguiente(null);
            current.setSiguiente(null);
            current.setAnterior(null);
            return current;
        }

        return null;
    }

    @Override
    public Iterator<NodoEnlaceDoble<T>> iterator() {
        Iterator<NodoEnlaceDoble<T>> it = new Iterator<>() {

            private NodoEnlaceDoble<T> current = cabeza;
            private boolean currentIsHead = true;

            @Override
            public boolean hasNext() {
                if (this.current != null) {
                    if (!this.currentIsHead && this.current == cabeza) {
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override
            public NodoEnlaceDoble<T> next() {
                NodoEnlaceDoble<T> current = this.current;
                this.current = this.current.getSiguiente();
                return current;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
