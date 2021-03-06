package co.edu.uniquindio.estructura.taller.modelo;

public class Nodo <T>{
	
	private T info;
	private Nodo<T> siguiente;
	private Nodo<T> anterior;
	
	public Nodo(T info) {
		super();
		this.info = info;
		this.anterior = null;
		this.siguiente = null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}
}
