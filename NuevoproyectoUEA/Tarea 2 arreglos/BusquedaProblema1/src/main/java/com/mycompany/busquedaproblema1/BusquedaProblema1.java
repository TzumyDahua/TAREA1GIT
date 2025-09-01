

package com.mycompany.busquedaproblema1;


public class BusquedaProblema1 {

    public static void main(String[] args) {
       //Escribe un programa que incluya una matriz bidimensional 
       //(puede ser una matriz pequeña de 3x3) con valores numéricos.
       
       int [][] matriz={
       {5, 8, 12},
       {21, 15, 7},
       {3, 9, 32}
       };
     // 2. Valor que queremos buscar en la matriz
        int valorABuscar = 5;

        // 3. Llamamos a nuestra función de búsqueda
        buscarValor(matriz, valorABuscar);
    }

    /**
     * Función que busca un valor en una matriz bidimensional.
     * @param matriz La matriz en la que se buscará.
     * @param  valor El valor a encontrar.
     */
    public static void buscarValor(int[][] matriz, int valor) {
        boolean encontrado = false;
        int filaEncontrada = -1;
        int columnaEncontrada = -1;

        // Recorremos las filas de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Recorremos las columnas de cada fila
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    encontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    break; // Salimos del bucle interior si ya lo encontramos
                }
            }
            if (encontrado) {
                break; // Salimos del bucle exterior también
            }
        }

        // 4. Mostramos el resultado
        if (encontrado) {
            System.out.println("¡Valor encontrado!");
            System.out.println("El numero " + valor + " se encuentra en la posicion: Fila " + filaEncontrada + ", Columna " + columnaEncontrada + ".");
        } else {
            System.out.println("El numero " + valor + " no se encontro en la matriz.");
        }
    }
}

