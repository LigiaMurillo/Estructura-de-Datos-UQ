package co.edu.uniquindio.list;

import java.util.Iterator;

public class ListaSimpleEnlazada<T> implements Iterable<NodoEnlaceSimple<T>> {

    private NodoEnlaceSimple<T> cabeza;

    public ListaSimpleEnlazada() {
    }

    public ListaSimpleEnlazada(NodoEnlaceSimple<T> cabeza) {
        this.add(cabeza);
    }

    public void addAsHead(NodoEnlaceSimple<T> item) {
        if (this.cabeza == null) {
            this.add(item);
        }
        else {
            item.setSiguiente(this.cabeza);
            this.cabeza = item;
        }
    }

    public void add(NodoEnlaceSimple<T> item) {
        if (cabeza == null) {
            this.cabeza = item;
        }
        else {
            NodoEnlaceSimple<T> ultimo = obtenerUltimo();
            if (ultimo != null) {
                ultimo.setSiguiente(item);
            }
        }
    }

    public NodoEnlaceSimple<T> obtenerUltimo() {
        NodoEnlaceSimple<T> next = this.cabeza;
        while (next != null) {
            if (next.getSiguiente() == null) {
                return next;
            }
            next = next.getSiguiente();
        }
        return null;
    }

    public int lenght() {
        int resultado = 0;
        for (Iterator<NodoEnlaceSimple<T>> it = this.iterator(); it.hasNext(); ) {
            NodoEnlaceSimple<T> current = it.next();
            resultado ++;
        }
        return resultado;
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
                previous.setSiguiente(next);
                current.setSiguiente(null);
                return current;
            }
            previous = current;
            current = next;
            next = next.getSiguiente();
        }

        // If the item is the last element.
        if (current.get().equals(t) && previous != null) {
            previous.setSiguiente(null);
            current.setSiguiente(null);
            return current;
        }

        return null;
    }

    public NodoEnlaceSimple<T> removeFirst() {
        if (this.cabeza != null) {
            NodoEnlaceSimple<T> cabeza = this.cabeza;
            this.cabeza = cabeza.getSiguiente();
            cabeza.setSiguiente(null);
            return cabeza;
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
