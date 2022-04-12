package co.edu.uniquindio.estructura.LinkedList.listas;

public class NodoIntegerDoble {
	
	private int valor;
	private NodoIntegerDoble nodoSiguiente;
	private NodoIntegerDoble nodoAnterior;
	
	public NodoIntegerDoble(int valor) {
		super();
		this.valor = valor;
		this.nodoSiguiente = null;
		this.nodoAnterior = null;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public NodoIntegerDoble getNodoSiguiente() {
		return nodoSiguiente;
	}
	public void setNodoSiguiente(NodoIntegerDoble nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}
	public NodoIntegerDoble getNodoAnterior() {
		return nodoAnterior;
	}
	public void setNodoAnterior(NodoIntegerDoble nodoAnterior) {
		this.nodoAnterior = nodoAnterior;
	}
	
	
}
