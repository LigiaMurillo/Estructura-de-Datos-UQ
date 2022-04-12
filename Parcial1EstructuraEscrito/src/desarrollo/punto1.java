package desarrollo;


public class punto1 {

	public static void main(String[] args) {
		int alto = 4;
		int ancho =6;
		int aux = 1;
		
		imprimirCuadrado( alto, ancho, aux);
		
	}
	
	public static void imprimirCuadrado (int alto, int ancho, int aux) {
		
		while(aux <= alto) {
			
			if(aux == 1 || aux == alto) {
				for (int i = 0; i < ancho; i++) {
					System.out.print("*");
					
				}
					
				}else {
					for (int i = 0; i < ancho; i++) {
						
						if(i == 0 || i == ancho-1) {
							System.out.print("*");
						}
						
						System.out.print(" ");
					}
			
			
				}
			System.out.println(" ");
			aux ++;
		}
		
		System.out.println("No entro");
	}

}
