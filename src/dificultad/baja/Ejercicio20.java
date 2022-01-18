/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/
package dificultad.baja;

public class Ejercicio20 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        cargaValores(vector);
        imprimirAscendente(vector);
        System.out.println("");
        imprimirDescendente(vector);
    }
    public static void cargaValores(int[] vector){
        for (int i=0; i < vector.length;i++){
            vector[i]= i;
        }
    }
    public static void imprimirAscendente(int[] vector){
        System.out.print("Lista de numero Ascendentes");
        
        for (int i=0; i < vector.length;i++){
            if (vector[i] % 20== 0){
                System.out.println("");
            }
            System.out.print(vector[i]+ " ");
        }
    }
    public static void imprimirDescendente(int[] vector){
        System.out.println("Lista de numero Descendentes");
        
        for (int i= vector.length-1; i >= 0;i--){
            System.out.print(vector[i]+ " ");
            if (vector[i] % 20 == 0){
                System.out.println("");
            }
        }    
    }
}
