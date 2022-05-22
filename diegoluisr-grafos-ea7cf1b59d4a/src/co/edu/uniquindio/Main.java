package co.edu.uniquindio;

public class Main {

    public static void main(String args[]) {

        Grafo<String> matriz = new Grafo<>();

        matriz.agregarVertice("Centro1", "Contenido generico del vertice");
        matriz.agregarVertice("Centro2", "Contenido generico del vertice");
        matriz.agregarVertice("Centro3", "Contenido generico del vertice");
        matriz.agregarVertice("Centro4", "Contenido generico del vertice");
        matriz.agregarVertice("Centro5", "Contenido generico del vertice");
        matriz.agregarVertice("Centro6", "Contenido generico del vertice");

        matriz.nuevoArco("Centro1", "Centro2", 1.0);
        matriz.nuevoArco("Centro2", "Centro3", 1.0);
        matriz.nuevoArco("Centro3", "Centro4", 1.0);
        matriz.nuevoArco("Centro4", "Centro5", 1.0);
        matriz.nuevoArco("Centro5", "Centro6", 1.0);
        matriz.nuevoArco("Centro6", "Centro1", 1.0);

        System.out.println(matriz);

        System.out.println(matriz.rutaMasCorta(matriz.buscarVertice("Centro1"), matriz.buscarVertice("Centro3")));

    }
}
