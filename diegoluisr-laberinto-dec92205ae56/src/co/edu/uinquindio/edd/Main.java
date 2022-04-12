package co.edu.uinquindio.edd;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
            {8, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 9},
            {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2},
            {11, 8, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10},
            {8, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 12},
            {6, 14, 5, 5, 5, 5, 1, 1, 5, 5, 5, 5, 12, 13},
            {4, 5, 5, 12, 14, 5, 10, 7, 5, 5, 5, 5, 5, 2},
            {4, 5, 5, 5, 5, 5, 5, 5, 5, 1, 12, 14, 1, 2},
            {7, 5, 5, 5, 5, 5, 5, 5, 5, 3, 5, 5, 10, 11}
        };

        Laberinto laberinto = new Laberinto(matrix);

        laberinto.iniciar();

        //System.out.print(laberinto.getString());
    }
}
