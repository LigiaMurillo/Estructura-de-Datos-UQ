package co.edu.uniquindio.estructura.LinkedList.listas;

public class NodoInteger {
	
//	Atributos y relaciones
	
	private int valor = 0;
	private NodoInteger nodoSiguiente;
	
//	Constructor
	
	public NodoInteger(int valor) {
		super();
		this.valor = valor;
		this.nodoSiguiente = null;
	}
	
//	Metodos set/get
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public NodoInteger getNodoSiguiente() {
		return nodoSiguiente;
	}
	public void setNodoSiguiente(NodoInteger nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}
}