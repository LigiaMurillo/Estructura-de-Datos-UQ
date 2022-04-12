package co.edu.uniquindio.estructura.LinkedList.listas;

public class ListaGenerica <V>{
	
	private NodoGenericSimple<V> nodoPrimero;
	private NodoGenericSimple<V> nodoFinal;
	private int tamanio;
	
	public ListaGenerica(int tamanio) {
		super();
		this.nodoPrimero = null;
		this.nodoFinal = null;
		this.tamanio = tamanio;
	}
	
	public NodoGenericSimple<V> getNodoPrimero() {
		return nodoPrimero;
	}

	public void setNodoPrimero(NodoGenericSimple<V> nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}

	public NodoGenericSimple<V> getNodoFinal() {
		return nodoFinal;
	}

	public void setNodoFinal(NodoGenericSimple<V> nodoFinal) {
		this.nodoFinal = nodoFinal;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public void agregarNodo(NodoGenericSimple<V> nuevoNodo){
		
		if (nodoPrimero == null){
			nodoPrimero = nuevoNodo;
			nodoFinal = nuevoNodo;
		}else{
			nuevoNodo.setNodoSiguiente(nodoPrimero);
			nodoPrimero = nuevoNodo;
		}
		tamanio ++;
	}
}