package co.edu.uniquindio.arbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nodo<T> implements Comparable<T> {

    private T t;
    private Nodo<T> izquierda;
    private Nodo<T> derecha;

    public Nodo(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Nodo<T> getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo<T> izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo<T> getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo<T> derecha) {
        this.derecha = derecha;
    }

    public int getAltura() {
        int alturaIzquierda = 1;
        int alturaDerecha = 1;
        if (izquierda != null) {
            alturaIzquierda = izquierda.getAltura() + 1;
        }
        if (derecha != null) {
            alturaDerecha = derecha.getAltura() + 1;
        }
        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda;
        }
        return alturaDerecha;
    }

    public int getDiferenciaAlturas() {
        int alturaIzquierda = 0;
        int alturaDerecha = 0;

        if (izquierda != null) {
            alturaIzquierda = izquierda.getAltura();
        }
        if (derecha != null) {
            alturaDerecha = derecha.getAltura();
        }
        return alturaDerecha - alturaIzquierda;
    }

    public boolean esEquilibrado() {
        int diferencia = Math.abs(getDiferenciaAlturas());
        return diferencia == 0 || diferencia == 1;
    }

    public boolean esPerfectamenteEquilibrado() {
        int diferenciaIzquieda = 0;
        int diferenciaDerecha = 0;

        if (izquierda != null) {
            diferenciaIzquieda = Math.abs(izquierda.getDiferenciaAlturas());
        }
        if (derecha != null) {
            diferenciaDerecha = Math.abs(derecha.getDiferenciaAlturas());
        }
        return esEquilibrado() && (diferenciaIzquieda == 0 || diferenciaIzquieda == 1) && (diferenciaDerecha == 0 || diferenciaDerecha == 1);
    }

    public String preorden() {
        String resultado = this.t.toString();
        if (izquierda != null) {
            resultado += izquierda.preorden();
        }
        if (derecha != null) {
            resultado += derecha.preorden();
        }
        return resultado;
    }

    public String orden() {
        String resultado = "";
        if (izquierda != null) {
            resultado += izquierda.orden();
        }
        resultado += this.t.toString();
        if (derecha != null) {
            resultado += derecha.orden();
        }
        return resultado;
    }

    public String postorden() {
        String resultado = "";
        if (izquierda != null) {
            resultado += izquierda.postorden();
        }
        if (derecha != null) {
            resultado += derecha.postorden();
        }
        resultado += this.t.toString();
        return resultado;
    }

    protected ArrayList<Nodo<T>> camino(T t) {
        ArrayList<Nodo<T>> subcamino = new ArrayList<>();
        int comparacion = this.compareTo(t);
        if (comparacion == 0) {
            subcamino.add(this);
        }
        else if (comparacion > 0 && izquierda != null) {
            subcamino = izquierda.camino(t);
            subcamino.add(this);
        }
        else if (comparacion < 0 && derecha != null) {
            subcamino = derecha.camino(t);
            subcamino.add(this);
        }
        return subcamino;
    }

    public Nodo<T> buscar(T t) {
        int comparacion = this.compareTo(t);
        if (comparacion == 0) {
            return this;
        }
        else if (comparacion > 0 && izquierda != null) {
            return izquierda.buscar(t);
        }
        else if (comparacion < 0 && derecha != null) {
            return derecha.buscar(t);
        }
        return null;
    }

    public void insertar(T t) {
        int comparacion = this.compareTo(t);
        if (comparacion > 0) {
            if (izquierda != null) {
                izquierda.insertar(t);
            }
            else {
                izquierda = new Nodo<>(t);
            }
        }
        else if (comparacion < 0) {
            if (derecha != null) {
                derecha.insertar(t);
            }
            else {
                derecha = new Nodo<>(t);
            }
        }
    }

    protected void eliminar(Nodo<T> antecesor) {
        // Validamos si el elemento a eliminar realmente tiene el antecesor indicado.
        if (antecesor.getIzquierda() == null && !antecesor.getIzquierda().equals(this) &&
                antecesor.getDerecha() == null && !antecesor.getDerecha().equals(this)) {
            // Tambien podriamos lanzar una excepcion.
            return;
        }
    }

    @Override
    public int compareTo(T t) {
        if (this.t instanceof Map.Entry<?,?>) {
            return ((Map.Entry) this.t).getKey().toString().compareTo(((Map.Entry) t).getKey().toString());
        }
        else if (this.t instanceof Comparable<?>) {
            return ((Comparable<T>) this.t).compareTo(t);
        }
        return 0;
    }
}
