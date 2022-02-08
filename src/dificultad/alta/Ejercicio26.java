/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.



Como podemos observar nuestra submatriz P se encuentra en la matriz M en los
índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package dificultad.alta;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int[][] matrizM, matrizP;
        System.out.print("Ingrese la dimension de la matriz M: ");
        int dimension = leer.nextInt();
        matrizM = new int[dimension][dimension];
        System.out.print("Ingrese la dimension de la matriz P: ");
        dimension = leer.nextInt();
        matrizP = new int[dimension][dimension];
        char aleatorio;
        do {
            System.out.print("Desea cargar la matriz M Y/N? ");
            aleatorio = leer.next().toLowerCase().charAt(0);
        } while( aleatorio != 'y' && aleatorio != 'n');
        cargaMatriz(matrizM, aleatorio);
        do {
            System.out.print("Desea cargar la matriz P Y/N? ");
            aleatorio = leer.next().toLowerCase().charAt(0);
        } while( aleatorio != 'y' && aleatorio != 'n');
        cargaMatriz(matrizP, aleatorio);
        visualizarMatriz(matrizM);
        visualizarMatriz(matrizP);
        System.out.println("El programa buscara si se encuentra la matriz P en la matriz M");
        buscarSubmatriz(matrizM, matrizP);
        //System.out.println(buscarMatrizEnMatriz(matrizM, matrizP));
    }
//
    public static void cargaMatriz(int[][] matriz, char aleatorio) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("-----Carga de matriz-----");
        if(aleatorio == 'y'){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Matriz [" + i + "][" + j + "]: ");
                    matriz[i][j] = leer.nextInt();
                }
            }
        } else {
            for (int i=0; i < matriz.length; i++){
                for (int j=0; j < matriz[i].length; j++){
                    matriz[i][j]= (int) (Math.random()* 10);
                }
            }
        }
    }
//    
    public static void visualizarMatriz(int[][] matriz){
        System.out.println("---Visualizacion Matriz---");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    private static void buscarSubmatriz(int[][] m, int[][] p) {
        boolean encontrado = false;
        int fila = -1, columna = -1;
        for (int i = 0; i < m.length - 2; i++) {
            for (int j = 0; j < m[0].length - 2; j++) {
                if (!encontrado) {
                    if (m[i][j] == p[0][0]) {
                        int ip, jp;
                        ip = 0;
                        //encontre
                        encontrado = true;
                        fila = i;
                        columna = j;
                        for (int f = i; f < i + p.length; f++) {
                            jp = 0;
                            for (int c = j; c < j + p.length; c++) {
                                //comparo con cada elemento de p, si alguno es distinto, no encontro la subm
                                if (m[f][c] != p[ip][jp]) {
                                    encontrado = false;
                                    fila = -1;
                                    columna = -1;
                                }
                                jp++;
                            }
                            ip++;
                        }
                    }
                }
            }
        }
        if (encontrado) {
            System.out.println("La matriz fue encontrada en la posicion: [" + fila + "," + columna + "]");
        } else {
            System.out.println("La matriz no fue encontrada.");
        }
    }
}
