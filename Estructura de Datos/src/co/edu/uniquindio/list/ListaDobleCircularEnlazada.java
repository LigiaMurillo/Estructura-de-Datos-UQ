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
            // El primer elemento, se convierte en la cabeza
            this.cabeza = item;
            // Como no hay mas elementos, el anterior es la cabeza.
            this.cabeza.setAnterior(this.cabeza);
            // Como no hay mas elementos el siguiente es la cabeza.
            this.cabeza.setSiguiente(this.cabeza);
        }
        else {
            // Obtenemos el ultimo elemento de la lista.
            NodoEnlaceDoble<T> ultimo = this.cabeza.getAnterior();
            // Si es el segundo elementos anadido, el anterior de la cabeza es la misma cabeza.
            // De lo contrario el elemento anterior a la cabeza, es el ultimo
            // Ya traemos aqui la cabeza.
            item.setSiguiente(ultimo.getSiguiente());
            item.setAnterior(this.cabeza.getAnterior());
            ultimo.setSiguiente(item);
            this.cabeza.setAnterior(item);
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
