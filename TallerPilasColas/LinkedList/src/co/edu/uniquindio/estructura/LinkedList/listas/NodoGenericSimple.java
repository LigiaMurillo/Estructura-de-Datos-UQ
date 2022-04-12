package co.edu.uniquindio.estructura.LinkedList.listas;

public class NodoGenericSimple<V> {
	
	private NodoGenericSimple<V> nodoSiguiente;
	private V coef;
	private V expo;
	
	public NodoGenericSimple(V coef, V expo) {
		super();
		this.nodoSiguiente = null;
		this.coef = coef;
		this.expo = expo;
	}

	public NodoGenericSimple<V> getNodoSiguiente() {
		return nodoSiguiente;
	}

	public void setNodoSiguiente(NodoGenericSimple<V> nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}

	public V getCoef() {
		return coef;
	}

	public void setCoef(V coef) {
		this.coef = coef;
	}

	public V getExpo() {
		return expo;
	}

	public void setExpo(V expo) {
		this.expo = expo;
	}
	
	
}
