package edu.co.uniquindio;

public class Pila {

	private NodoCarta cabeza;
	
	public Pila() {
		
	}
	
	 public void insertar(NodoCarta nuevo) {
		 
	        if (cabeza == null) {
	            cabeza = nuevo;
	        }
	        else {
	        	
	        	NodoCarta actual = cabeza;

	            while(actual.getSiguiente() != null) {
	                actual = actual.getSiguiente();
	            }
	            actual.setSiguiente(nuevo);
	        }
	 }
	 
	 /*public boolean buscar (int pinta, String valor) {
		 
		 NodoCarta actual = cabeza;
		 if (cabeza == null) {
	            return false;
	     }
	 
	    	 	
	            if(actual!= null) {
	                actual = actual.getSiguiente();
	            }

	            if(actual.getPinta() == pinta && actual.getValor() == valor) {
	            	return true;
	            }
	            
	            buscar(pinta , valor);
	      
		 
		 return false;
	 }*/

	 
	 public boolean buscar (int pinta, String valor) {
		 NodoCarta actual = this.cabeza;
	        while (actual != null) {
	        	 if(actual.getPinta() == pinta && actual.getValor() == valor) {
		            	return true;
		            }
	            actual = actual.getSiguiente();
	        }
	        return false;
	    }

}
