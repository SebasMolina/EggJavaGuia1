/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese un numero: ");
        int nro1 = leer.nextInt();
        System.out.print("Ingrese otro numero: ");
        int nro2 = leer.nextInt();
        
        if (nro1 > nro2){
            System.out.println("El primer numero ("+nro1+") es mayor");
        } else {
            System.out.println("El segundo numero ("+nro2+") es mayor");
        }
        
    }
    
}
