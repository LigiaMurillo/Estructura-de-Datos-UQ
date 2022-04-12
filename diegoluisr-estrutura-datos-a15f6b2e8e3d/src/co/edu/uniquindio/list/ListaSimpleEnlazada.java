package co.edu.uniquindio.list;

import java.util.Iterator;

public class ListaSimpleEnlazada<T> implements Iterable<NodoEnlaceSimple<T>> {

    private NodoEnlaceSimple<T> cabeza;

    public ListaSimpleEnlazada() {
    }

    public ListaSimpleEnlazada(NodoEnlaceSimple<T> cabeza) {
        this.cabeza = cabeza;
    }

    public void add(NodoEnlaceSimple<T> item) {
        if (cabeza == null) {
            this.cabeza = item;
        }
        else {
            NodoEnlaceSimple<T> ultimo = obtenerUltimo();
            if (ultimo != null) {
                ultimo.setSiguente(item);
            }
        }
    }

    public NodoEnlaceSimple<T> obtenerUltimo() {
        NodoEnlaceSimple<T> next = this.cabeza;
        while (next != null) {
            if (next.getSiguiente() == null) {
                return next;
            }
        }
        return null;
    }


    public NodoEnlaceSimple<T> remove(T t) {
        if (cabeza == null) {
            return null;
        }
        NodoEnlaceSimple<T> previous = null;
        NodoEnlaceSimple<T> current = this.cabeza;
        NodoEnlaceSimple<T> next = this.cabeza.getSiguiente();

        // If the item is the first element.
        if (current.get().equals(t) && previous == null) {
            this.cabeza = next;
            return current;
        }

        while(next != null) {
            if (current.get().equals(t)) {
                previous.setSiguente(next);
                current.setSiguente(null);
                return current;
            }
            previous = current;
            current = next;
            next = next.getSiguiente();
        }

        // If the item is the last element.
        if (current.get().equals(t) && previous != null) {
            previous.setSiguente(null);
            current.setSiguente(null);
            return current;
        }

        return null;
    }

    @Override
    public String toString() {
        NodoEnlaceSimple<T> next = this.cabeza;
        String result = "";
        while (next != null) {
            result += ", " + next.get().toString();
            next = next.getSiguiente();
        }

        return result;
    }

    public NodoEnlaceSimple<T> buscar(T t) {
        NodoEnlaceSimple<T> next = this.cabeza;
        while (next != null) {
            if (next.get().equals(t)) {
                return next;
            }
            next = next.getSiguiente();
        }
        return null;
    }

    public boolean agregarDespuesDe(NodoEnlaceSimple<T> objeto, T t) {
        // Tarea agregar faltante del metodo.
        return false;
    }

    public Iterator<NodoEnlaceSimple<T>> iterator() {
        Iterator<NodoEnlaceSimple<T>> it = new Iterator<>() {

            private NodoEnlaceSimple<T> current = cabeza;

            @Override
            public boolean hasNext() {
                if (current != null) {
                    return true;
                }
                return false;
            }

            @Override
            public NodoEnlaceSimple<T> next() {
                NodoEnlaceSimple<T> current = this.current;
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
