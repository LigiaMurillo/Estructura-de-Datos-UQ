package co.edu.uniquindio.list;

import java.util.Iterator;

public class ListaDobleEnlazada<T> implements Iterable<NodoEnlaceDoble<T>> {

    private NodoEnlaceDoble<T> cabeza;

    public ListaDobleEnlazada() {

    }

    public ListaDobleEnlazada(NodoEnlaceDoble<T> head) {
        this.cabeza = head;
    }

    public void add(NodoEnlaceDoble<T> item) {
        if (cabeza == null) {
            this.cabeza = item;
        }
        else {
            NodoEnlaceDoble<T> ultimo = obtenerUltimo();
            if (ultimo != null) {
                ultimo.setSiguiente(item);
                item.setAnterior(ultimo);
            }
        }
    }

    public NodoEnlaceDoble<T> obtenerUltimo() {
        NodoEnlaceDoble<T> next = this.cabeza;
        while (next != null) {
            if (next.getSiguiente() == null) {
                return next;
            }
        }
        return null;
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

    public ListaDobleEnlazada<T> reverse() {
        // @todo Uncompleted function
        return this;
    }

    public Iterator<NodoEnlaceDoble<T>> iterator() {
        Iterator<NodoEnlaceDoble<T>> it = new Iterator<>() {

            private NodoEnlaceDoble<T> current = cabeza;

            @Override
            public boolean hasNext() {
                if (current != null) {
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
