/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package dificultad.alta;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el tamaño de la matriz cuadrada (por ej. 3 si es 3x3): ");
        int tam = leer.nextInt();
        int[][] matriz = new int[tam][tam];
        cargaMatriz(matriz);
        visualizarMatriz(matriz);
        String nuevo;
        if(cuboMagico(matriz)){
            System.out.println("ES CUBO MAGICO");
        } else {
            System.out.println("CUBO COMUN");
        }
        
        
    }

    public static void cargaMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Carga de matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
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

    public static boolean cuboMagico(int[][] matriz){
        boolean cubo=false;
        int tamanio,resultado=0, suma=0,principal=0,secundaria=0,contador=0;
        int[] filas,columnas;
        tamanio= matriz.length;
        contador = tamanio*2+2;
        filas = new int[tamanio];
        columnas = new int[tamanio];
        for (int i=0; i <= (tamanio*tamanio); i++){
            resultado+= i;
        }
        resultado /= tamanio;
        //
        for (int i=0; i < tamanio; i++){
            for (int j=0; j < tamanio; j++){
                suma+= matriz[i][j];
            }
        }
        suma /= tamanio;
        //
        if (suma==resultado){            
            for (int i=0; i < tamanio; i++){
                for (int j=0; j < tamanio; j++){
                    filas[i] +=  matriz[i][j];
                    columnas[i] +=  matriz[j][i];
                    if(i==j){
                        principal+= matriz[i][j];
                    }
                    if(i+j==tamanio-1){
                        secundaria+= matriz[i][j];
                    }
                }
            }
            if(principal == resultado){
                contador--;
            }
            if(secundaria == resultado){
                contador--;
            }
            for (int i=0; i < tamanio; i++){
                if(filas[i] == resultado){
                    contador--;
                }
                if(columnas[i] == resultado){
                    contador--;
                }
            }
            if (contador==0){
                cubo=true;
            }
            
        }
        return cubo;
    }
    
}