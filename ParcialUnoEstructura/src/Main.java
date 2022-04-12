
public class Main {

	public static void main(String[] args) {
		
		
		ListaDoble<Integer> listaEnteros = new ListaDoble<>();
		listaEnteros.agregarInicio(24);
		listaEnteros.agregarfinal(80);
		listaEnteros.agregarfinal(99);
		listaEnteros.agregarfinal(19);
		listaEnteros.agregarfinal(2);
		listaEnteros.agregarfinal(74);
		listaEnteros.agregarfinal(34);
		listaEnteros.agregarfinal(45);
		
		
		System.out.println("Esta es l lista ingresada");
		listaEnteros.imprimirLista();
		
		listaEnteros.shell(listaEnteros);
		
		
		
		
		
	}
	

	

}
