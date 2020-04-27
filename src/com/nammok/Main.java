package com.nammok;

import java.util.Scanner;

public class Main {


    static final void matrixPrint(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println();
        System.out.print("¿Cuántos años tienes? ");
        Integer edad = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("\n " + nombre + "  es " + (edad >= 18 ? "mayor de edad" : "menor de edad"));










        int[][] scores = { { 20, 18, 22, 20, 16 },
                { 18, 20, 18, 21, 20 },
                { 16, 18, 16, 20, 24 },
                {  25, 24, 22, 24, 25 }
        };
        matrixPrint(scores);
    }
}
