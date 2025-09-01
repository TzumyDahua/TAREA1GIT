
package com.mycompany.ordenacionmatriz;

import java.util.Arrays; // Importamos la utilidad para ordenar

public class OrdenacionMatriz {

    public static void main(String[] args) {
     // 1. Matriz bidimensional con valores numéricos
        int[][] matriz = {
            {9, 5, 1},
            {25, 11, 7},
            {4, 13, 2}
        };

        // 2. Fila que queremos ordenar (la fila 0 es la primera, la 1 la segunda, etc.)
        int filaAOrdenar = 0;

        // 3. Mostramos la matriz original
        System.out.println("--- Matriz Original ---");
        imprimirMatriz(matriz);

        // 4. Llamamos a la función para ordenar la fila
        ordenarFila(matriz, filaAOrdenar);

        // 5. Mostramos la matriz con la fila ya ordenada
        System.out.println("\n--- Matriz con Fila " + filaAOrdenar + " Ordenada ---");
        imprimirMatriz(matriz);
    }

    /**
     * Función que ordena una fila específica de una matriz.
     * @param matriz La matriz a modificar.
     * @param numeroFila El índice de la fila a ordenar.
     */
    public static void ordenarFila(int[][] matriz, int numeroFila) {
        // Usamos el método sort de la clase Arrays, que es muy eficiente.
        // Este método ordena el arreglo que le pasemos.
        Arrays.sort(matriz[numeroFila]);
    }

    /**
     * Función para imprimir la matriz de forma ordenada.
     * @param matriz La matriz a imprimir.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t es un tabulador para alinear
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
   
