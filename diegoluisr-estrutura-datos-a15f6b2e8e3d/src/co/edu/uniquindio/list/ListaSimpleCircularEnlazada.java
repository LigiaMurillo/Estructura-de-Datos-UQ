package co.edu.uniquindio.list;

import java.util.Iterator;

public class ListaSimpleCircularEnlazada<T> implements Iterable<NodoEnlaceSimple<T>> {

    private NodoEnlaceSimple<T> cabeza;

    public ListaSimpleCircularEnlazada() {
    }

    public ListaSimpleCircularEnlazada(NodoEnlaceSimple<T> head) {
        this.add(head);
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

    public void addAnyPosition (NodoEnlaceSimple<T> newNodo, int position){

        if (cabeza == null) {
            System.out.println("La lista no existe, por favor cmpruebe la información");
        }

        int aux = 0;
        NodoEnlaceSimple<T> previous = null;
        NodoEnlaceSimple<T> current = this.cabeza;
        NodoEnlaceSimple<T> next = this.cabeza.getSiguiente();

        // If the list have just one item.
        if (current == next) {
            this.cabeza = null;
        }

        while(next != this.cabeza) {
            aux ++;
            if (position == 1) {
                this.cabeza =newNodo;
                newNodo.setSiguente(current);
                System.out.println("Operacion exitosa");
            }

            if(position == aux){

                previous.setSiguente(newNodo);
                newNodo.setSiguente(current);

                System.out.println("Operacion exitosa");
            }

            previous = current;
            current = next;
            next = next.getSiguiente();
        }

        System.out.println("Operacion fallida, por favor revise el tamaño de la red");

    }


   /* public int countNodes(){

        NodoEnlaceSimple<T> next = this.cabeza;
        int contador = 0;

        while (next != null) {
            if (next.getSiguiente() == this.cabeza) {
                contador ++;
                return contador;
            }
            next = next.getSiguiente();
            contador ++;
        }

        return contador;

    }*/

    public NodoEnlaceSimple<T> obtenerUltimo() {
        NodoEnlaceSimple<T> next = this.cabeza;
        while (next != null) {
            if (next.getSiguiente() == this.cabeza) {
                return next;
            }
            next = next.getSiguiente();
        }
        return this.cabeza;
    }



    public NodoEnlaceSimple<T> remove(T t) {
        if (cabeza == null) {
            return null;
        }
        NodoEnlaceSimple<T> previous = null;
        NodoEnlaceSimple<T> current = this.cabeza;
        NodoEnlaceSimple<T> next = this.cabeza.getSiguiente();

        // If the list have just one item.
        if (current == next) {
            this.cabeza = null;
            return current;
        }

        while(next != this.cabeza) {
            if (current.get().equals(t)) {
                previous.setSiguente(next);
                current.setSiguente(null);
                return current;
            }
            previous = current;
            current = next;
            next = next.getSiguiente();
        }

        return null;
    }

    public String toString() {
        NodoEnlaceSimple<T> next = this.cabeza;
        String result = "";
        while (next != null) {
            result += ", " + next.get().toString();
            next = next.getSiguiente();
        }

        return result;
    }

    public Iterator<NodoEnlaceSimple<T>> iterator() {
      return new IteradorNodoEnlaceSimple<>(cabeza);
       /* Iterator<NodoEnlaceSimple<T>> it = new Iterator<>() {

            private NodoEnlaceSimple<T> current = head;
            private boolean currentIsHead = true;

            @Override
            public boolean hasNext() {
                if (this.current != null) {
                    if (!this.currentIsHead && this.current == head) {
                        return false;
                    }
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
        return it;*/
    }
}
