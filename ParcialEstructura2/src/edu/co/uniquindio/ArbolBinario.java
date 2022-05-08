package edu.co.uniquindio;

public class ArbolBinario {
	
	private NodoCarta raiz;
	
	public ArbolBinario() {
		
	}
	
	public ArbolBinario(NodoCarta raiz) {
		this.raiz = raiz;
	}
	
	
	public void insertar(int pinta, String valor) {
		if (raiz != null) {
			raiz.insertar(pinta , valor);
		}
		
		else {
			raiz = new NodoCarta(pinta, valor);
		}
	}

}
