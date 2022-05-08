package co.edu.uniquindio.arbol;

public class NodoNoGenerico {

    private String key;
    private Integer value;
    private NodoNoGenerico izquierda;
    private NodoNoGenerico derecha;

    public NodoNoGenerico(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public NodoNoGenerico getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoNoGenerico izquierda) {
        this.izquierda = izquierda;
    }

    public NodoNoGenerico getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoNoGenerico derecha) {
        this.derecha = derecha;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NodoNoGenerico buscar(String key) {
        int comparacion = this.key.compareTo(key);
        if (comparacion == 0) {
            return this;
        }
        else if (comparacion > 0 && izquierda != null) {
            return izquierda.buscar(key);
        }
        else if (comparacion < 0 && derecha != null) {
            return derecha.buscar(key);
        }
        return null;
    }

    public void insertar(String key, Integer value) {
        int comparacion = this.key.compareTo(key);
        if (comparacion > 0) {
            if (izquierda != null) {
                izquierda.insertar(key, value);
            }
            else {
                izquierda = new NodoNoGenerico(key, value);
            }
        }
        else if (comparacion < 0) {
            if (derecha != null) {
                derecha.insertar(key, value);
            }
            else {
                derecha = new NodoNoGenerico(key, value);
            }
        }
    }
}
