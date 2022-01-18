/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el tamaño del vector: ");
        int nro = leer.nextInt();
        String[] vector = new String[nro];
        cargaVector(vector);
        visualizarVector(vector);
        cantidadCifras(vector);
    }
    
    public static void cargaVector(String[] vector){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i=0; i < vector.length; i++){
            System.out.print("Ingrese valor en ["+i+"]: ");
            vector[i]= leer.next();
        }
    }
    
    public static void visualizarVector(String[] vector){
        System.out.println("Vector: ");
        for (int i=0; i < vector.length; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }

    public static void cantidadCifras(String[] vector){
        int digitos1=0,digitos2=0,digitos3=0,digitos4=0,digitos5=0;
        for(int i=0; i < vector.length; i++){
            switch (vector[i].length()){
                case 1:
                    digitos1++;
                    break;
                case 2:
                    digitos2++;
                    break;
                case 3:
                    digitos3++;
                    break;
                case 4:
                    digitos4++;
                    break;
                case 5:
                    digitos5++;
                    break;
                default:
                    System.out.println("cantidad de digitos mayor a 5");
            }
        }
        System.out.println("Numero con 1 digito: "+digitos1);
        System.out.println("Numero con 2 digito: "+digitos2);
        System.out.println("Numero con 3 digito: "+digitos3);
        System.out.println("Numero con 4 digito: "+digitos4);
        System.out.println("Numero con 5 digito: "+digitos5);
    }
}
