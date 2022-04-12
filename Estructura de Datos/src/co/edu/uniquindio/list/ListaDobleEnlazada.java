package co.edu.uniquindio.list;

import java.util.Iterator;

public class ListaDobleEnlazada<T> implements Iterable<NodoEnlaceDoble<T>> {

    private NodoEnlaceDoble<T> cabeza;

    public ListaDobleEnlazada() {

    }

    public ListaDobleEnlazada(NodoEnlaceDoble<T> head) {
        this.add(head);
    }

    public void addAsHead(NodoEnlaceDoble<T> item) {
        if (this.cabeza == null) {
            this.add(item);
        }
        else {
            item.setSiguiente(this.cabeza);
            this.cabeza.setAnterior(item);
            this.cabeza = item;
        }
    }

    public void add(NodoEnlaceDoble<T> item) {
        if (this.cabeza == null) {
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
            next = next.getSiguiente();
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

    public NodoEnlaceDoble<T> removeFirst() {
        if (this.cabeza != null) {
            NodoEnlaceDoble<T> cabeza = this.cabeza;
            this.cabeza = cabeza.getSiguiente();
            this.cabeza.setAnterior(null);
            cabeza.setSiguiente(null);
            return cabeza;
        }
        return null;
    }

    public ListaDobleEnlazada<T> reverse() {
        ListaDobleEnlazada<T> lista = new ListaDobleEnlazada<>();

        for (Iterator<NodoEnlaceDoble<T>> it = this.iterator(); it.hasNext(); ) {
            NodoEnlaceDoble<T> nodo = it.next();
            lista.addAsHead(new NodoEnlaceDoble<>(nodo.get()));
        }

        return lista;
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
