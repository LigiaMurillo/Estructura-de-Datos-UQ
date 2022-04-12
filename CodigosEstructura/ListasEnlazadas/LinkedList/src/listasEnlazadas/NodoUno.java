package listasEnlazadas;

/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 */
public class NodoUno {
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private NodoUno siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // M�todos get y set para los atributos.
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoUno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUno siguiente) {
        this.siguiente = siguiente;
    }

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + ", siguiente=" + siguiente + "]";
	}
}