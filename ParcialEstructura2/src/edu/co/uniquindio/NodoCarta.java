package edu.co.uniquindio;

public class NodoCarta {
	
	private NodoCarta siguiente;
	private NodoCarta anterior;
	private int pinta;
	private String valor;
	
	final static int PICAS = 1;
	final static int CORAZONES = 2;
	final static int DIAMANTES = 3;
	final static int TREBOLES = 4;
	
	
	public NodoCarta(int pinta, String valor) {
		super();
		this.pinta = pinta;
		this.valor = valor;
	}
	
	


	public NodoCarta getAnterior() {
		return anterior;
	}


	public void setAnterior(NodoCarta anterior) {
		this.anterior = anterior;
	}




	public NodoCarta getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(NodoCarta siguiente) {
		this.siguiente = siguiente;
	}


	public int getPinta() {
		return pinta;
	}


	public void setPinta(int pinta) {
		this.pinta = pinta;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public void insertar(int pinta, String valor) {
		 
		if(pinta < this.pinta) {
			if(anterior != null ) {
				anterior.insertar(pinta, valor);
			}
			else {
				anterior = new NodoCarta(pinta, valor);
			}
		}
		
		else if(pinta > this.pinta) {
			if(siguiente != null ) {
				siguiente.insertar(pinta, valor);
			}
			else {
				siguiente = new NodoCarta(pinta, valor);
			}
		}
		
		else if(pinta == this.pinta) {
			
			if(valor.compareTo(this.valor) < 0) {
				if(anterior != null ) {
					anterior.insertar(pinta, valor);
				}
				else {
					anterior = new NodoCarta(pinta, valor);
				}
			}
			
			else if(valor.compareTo(this.valor) > 0) {
				if(siguiente != null ) {
					siguiente.insertar(pinta, valor);
				}
				else {
					siguiente = new NodoCarta(pinta, valor);
				}
			}
			
		}
		
	}


	
	
	
	
	

}
