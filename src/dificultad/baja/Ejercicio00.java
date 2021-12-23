/* PRUEBAS:
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio00 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese primer numero: ");
        int numero1 = entrada.nextInt();        
        System.out.print("Ingrese segundo numero: ");
        int numero2 = entrada.nextInt();
        int suma;
        suma = numero1 + numero2;
        System.out.println("La suma es: "+suma);
        
    }   
}