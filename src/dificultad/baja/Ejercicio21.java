/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el tamaño del vector: ");
        int nro = leer.nextInt();
        int[] vector = new int[nro];
        cargaVector(vector);
        
        System.out.print("Ingrese el valor a buscar: ");
        nro = leer.nextInt();
        visualizarVector(vector);
        busquedaVector(vector, nro);
    }
    
    public static void cargaVector(int[] vector){
        for (int i=0; i < vector.length; i++){
            vector[i]= (int) (Math.random() * 100);;
        }
    }
    
    public static void visualizarVector(int[] vector){
        System.out.println("Vector: ");
        for (int i=0; i < vector.length; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
    
    public static void busquedaVector(int[] vector, int valor){
        
        for (int i=0; i < vector.length; i++){
            if (vector[i]==valor){
                System.out.println("El valor se encuentra en la posicion: "+(i+1));
            }
        }
    }
}
