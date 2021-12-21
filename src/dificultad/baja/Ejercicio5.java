/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese un numero: ");
        int nro = leer.nextInt();
        System.out.println("El numero ingresado fue: " + nro);
        System.out.println("El doble del numero es: " + nro*2);
        System.out.println("El triple del numero es: " + nro*3);
        System.out.println("La raiz cuadrada es: "+ Math.sqrt(nro));
    }
    
}
