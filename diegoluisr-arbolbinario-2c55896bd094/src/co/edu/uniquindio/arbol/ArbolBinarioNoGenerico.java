package co.edu.uniquindio.arbol;

public class ArbolBinarioNoGenerico {

    private NodoNoGenerico raiz;

    public ArbolBinarioNoGenerico() {
    }

    public void insertar(String key, Integer value) {
        if (raiz != null) {
            raiz.insertar(key, value);
        }
        else {
            raiz = new NodoNoGenerico(key, value);
        }
    }

    public NodoNoGenerico buscar(String key) {
        if (raiz != null) {
            return raiz.buscar(key);
        }
        return null;
    }
}
