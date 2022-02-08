/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 0  2  4    0  2 -4
 2  0  2   -2  0 -2
-4 -2  0    4  2  0
En este caso la matriz es anti simétrica.
 */
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el tamaño de la matriz cuadrada (por ej. 3 si es 3x3): ");
        int tam = leer.nextInt();
        int[][] matriz = new int[tam][tam];
        int[][] transpuesta = new int[tam][tam];
        System.out.println("Bien.");
        cargaMatriz(matriz);
        visualizarMatriz(matriz);
        transponerMatriz(matriz, transpuesta);
        visualizarMatriz(transpuesta);
        boolean anti = matrizAntisimetrica(matriz, transpuesta);
        System.out.println("La matriz en antisimetrica? "+ anti);
    }
    
        public static void cargaMatriz(int[][] matriz){
            Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
            System.out.println("Carga de matriz: ");
            for (int i=0; i < matriz.length; i++){
                for (int j=0; j < matriz[i].length; j++){
                    System.out.print("Matriz ["+i+"]["+j+"]: ");
                    matriz[i][j]= leer.nextInt();
                }
            }
        }
    
    public static void visualizarMatriz(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }

    
    public static void transponerMatriz(int[][] matriz, int[][] transpuesta) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[i][j] *= -1;
            }
        }
    }
    
    public static boolean matrizAntisimetrica(int[][] matriz, int[][] transpuesta){
        int contador= matriz.length * transpuesta.length;
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == transpuesta[i][j]){
                    
                    contador--;
                    
                }
            }
        }
        if (contador == 0){
            return true;
        } else {
            return false;
        }
    }
}
