package co.edu.uniquindio.estructura.LinkedList.listas;

public class ListaSimpleCircular <T>{

	NodoInteger primerNodo;
	NodoInteger ultimoNodo;
	int tamanio;

	public ListaSimpleCircular() {
		super();
		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamanio = 0;
	}

	public NodoInteger getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(NodoInteger primerNodo) {
		this.primerNodo = primerNodo;
	}

	public NodoInteger getUltimoNodo() {
		return ultimoNodo;
	}

	public void setUltimoNodo(NodoInteger ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void agregarNoodCabeza (NodoInteger nuevoNodo){

		if (primerNodo == null){
			primerNodo = nuevoNodo;
			ultimoNodo = nuevoNodo;
			ultimoNodo.setNodoSiguiente(primerNodo);
		}
		else{
			nuevoNodo.setNodoSiguiente(primerNodo);
			primerNodo = nuevoNodo;
			ultimoNodo.setNodoSiguiente(primerNodo);
		}
		tamanio++;
	}

	public void agregarNodoFinal (NodoInteger nuevoNodo){

		if (primerNodo == null){
			primerNodo = nuevoNodo;
			ultimoNodo = nuevoNodo;
			ultimoNodo.setNodoSiguiente(primerNodo);
		}else{

		}
	}

	public void mostrarNodos (){

		NodoInteger nodoAux = primerNodo;
		int i = 0;
		while (i <= tamanio){
			System.out.print("[" + nodoAux.getValor() + "]-->");
			nodoAux = nodoAux.getNodoSiguiente();
			i++;
		}
	}
}