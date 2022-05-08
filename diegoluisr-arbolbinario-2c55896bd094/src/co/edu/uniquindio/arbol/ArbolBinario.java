package co.edu.uniquindio.arbol;

import java.util.ArrayList;
import java.util.Collections;

public class ArbolBinario<T> {

    private Nodo<T> raiz;

    /*
    • Determinar su número de elementos.
    • Hacer una copia.
    • Visualizar el árbol binario en pantalla o en impresora.
    • Determinar si dos árboles binarios son idénticos.
    • Borrar (eliminar el árbol).
    • Si es un árbol de expresión, evaluar la expresión.
    */

    public ArbolBinario() {
    }

    public ArbolBinario(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public Nodo<T> agregarNuevoArbol(T t, Nodo<T> izquiedo, Nodo<T> derecho) {
        Nodo<T> nodo = new Nodo<>(t);
        nodo.setIzquierda(izquiedo);
        nodo.setDerecha(derecho);
        return nodo;
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public int getAltura() {
        if (raiz != null) {
            return raiz.getAltura();
        }
        return 0;
    }

    public boolean esEquilibrado() {
        if (raiz != null) {
            return raiz.esEquilibrado();
        }
        return true;
    }

    public void insertar(T t) {
        if (raiz != null) {
            raiz.insertar(t);
        }
        else {
            raiz = new Nodo<>(t);
        }
    }

    public void eliminar(T t) {
        ArrayList<Nodo<T>> camino = raiz.camino(t);
        Collections.reverse(camino);

        if (camino.size() == 0) {
            // Tambien podriamos lanzar una excepcion.
            return;
        }

        Nodo<T> objetivo = camino.get(camino.size() - 1);
        // Como ya validamos la longitud del camino, no necesitamos validar el ultimo nodo.
        /*if (objetivo == null) {
            return;
        }*/



    }

    public Nodo<T> buscar(T t) {
        if (raiz != null) {
            return raiz.buscar(t);
        }
        return null;
    }

    public boolean esPerfectamenteEquilibrado() {
        if (raiz != null) {
            return raiz.esPerfectamenteEquilibrado();
        }
        return true;
    }

    public String obtenerPreorden() {
        if (raiz != null) {
            return raiz.preorden();
        }
        return "";
    }

    public String obtenerOrden() {
        if (raiz != null) {
            return raiz.orden();
        }
        return "";
    }

    public String obtenerPostorden() {
        if (raiz != null) {
            return raiz.postorden();
        }
        return "";
    }
}
