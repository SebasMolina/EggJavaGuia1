/*
Crear un programa que dado un numero determine si es par o impar.
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese un numero: ");
        int nro = leer.nextInt();
        if(nro % 2 == 0){
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }
    }
    
}
