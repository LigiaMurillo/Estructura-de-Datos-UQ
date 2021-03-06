package co.edu.uniquindio.estructura.preparcial.punto5;

import co.edu.uniquindio.estructura.taller.modelo.ListaSimple;
import co.edu.uniquindio.estructura.taller.modelo.Nodo;
import javafx.scene.effect.Light.Distant;

public class Main <T>{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimple<Integer> listaSimple = new ListaSimple<>();
		listaSimple.agregarNodoCola(4);
		listaSimple.agregarNodoCola(4);
		listaSimple.agregarNodoCola(6);
		listaSimple.agregarNodoCola(8);
		listaSimple.agregarNodoCola(2);
		listaSimple.agregarNodoCola(4);
		listaSimple.agregarNodoCola(5);
		listaSimple.agregarNodoCola(4);
		listaSimple.agregarNodoCola(4);
		listaSimple.listar();
		int clave = 4;
		int distMaxima = buscarMD(listaSimple.getPrimero(), clave, 0,0);

		System.out.println(distMaxima);
	}

	private static int buscarMD(Nodo<Integer> nodo, int clave, int dist, int maxDist) {

		if (nodo == null)
			return maxDist;
		else{
			if (nodo.getInfo() == clave){
				if (maxDist < dist)
					maxDist = dist;
				dist = 0;
			}
			dist++;
			return buscarMD(nodo.getSiguiente(), clave, dist, maxDist);
		}
	}
}