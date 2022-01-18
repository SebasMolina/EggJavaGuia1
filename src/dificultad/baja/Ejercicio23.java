/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
*/
package dificultad.baja;

public class Ejercicio23 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];
        cargaMatriz(matriz);
        System.out.println("Matriz");
        visualizarMatriz(matriz);
        transponerMatriz(matriz, transpuesta);
        System.out.println("Transpuesta");
        visualizarMatriz(transpuesta);
    }
    
    public static void cargaMatriz(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j]= (int) (Math.random() * 100);;
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
    
    public static void transponerMatriz(int[][] matriz, int[][] transpuesta){
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                transpuesta[j][i]= matriz[i][j];
            }
        }
    }
}
