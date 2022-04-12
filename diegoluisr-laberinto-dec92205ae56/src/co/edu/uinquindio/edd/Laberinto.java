package co.edu.uinquindio.edd;

import java.util.ArrayList;

public class Laberinto {
    private int[][] matrix;
    private int[][] backtrack;
    private int posX;
    private int posY;

    private int prevBacktrackX;
    private int prevBacktrackY;

    // https://theasciicode.com.ar/extended-ascii-code/box-drawings-double-line-horizontal-vertical-character-ascii-code-206.html
    private String doubleLines = "╦╣╩╠═║╚╔╗╝╨╡╥╞╬";

    public Laberinto(int[][] matrix) {
        this.matrix = matrix;
        this.backtrack = new int[matrix.length][matrix[0].length];
        this.posX = 0;
        this.posY = 0;
        this.prevBacktrackX = 0;
        this.prevBacktrackY = 0;
    }

    private boolean moverDerecha() {
        int[] valores = {1, 3, 4, 5, 7, 8, 14};
        if (this.inArray(matrix[posY][posX], valores)) {
            if (this.posX + 1 < matrix[posY].length) {
                System.out.println("Mueve valor:" + matrix[posY][posX]);
                this.posX++;
                return true;
            }
        }
        return false;
    }

    private boolean moverIzquierda() {
        int[] valores = {1, 2, 3, 5, 9, 10, 12};
        if (this.inArray(matrix[posY][posX], valores)) {
            if (this.posX - 1 >= 0) {
                System.out.println("Mueve valor:" + matrix[posY][posX]);
                this.posX--;
                return true;
            }
        }
        return false;
    }

    private boolean moverArriba() {
        int[] valores = {2, 3, 4, 6, 7, 10, 11};
        if (this.inArray(matrix[posY][posX], valores)) {
            System.out.println("Mueve valor:" + matrix[posY][posX]);
            this.posY--;
            return true;
        }
        return false;
    }

    private boolean moverAbajo() {
        int[] valores = {1, 2, 4, 6, 8, 9, 13};
        if (this.inArray(matrix[posY][posX], valores)) {
            System.out.println("Mueve valor:" + matrix[posY][posX]);
            this.posY++;
            return true;
        }
        return false;
    }

    private boolean inArray(int i, int[] arreglo) {
        for (int item: arreglo) {
            if (i == item) {
                return true;
            }
        }
        return false;
    }

    public void iniciar() {
        if (moverDerecha() == true) {

        }
        else if (moverIzquierda() == true) {

        }
        else if (moverArriba() == true) {

        }
        else if (moverAbajo() == true) {

        }
        System.out.println("Mueve a : x:" + this.posX + " y:" + this.posY);
        iniciar();
    }

    public String getString(){
        String lab = "";
        char[] chars = doubleLines.toCharArray();
        for (int[] line: this.matrix) {
            for (int cell: line) {
                if (cell - 1 < chars.length) {
                    lab += chars[cell - 1];
                }
            }
            lab += "\n";
        }
        return lab;
    }
}
