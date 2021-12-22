package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {

    /*
    Escribir un programa que pida tu nombre, lo guarde en una variable 
    y lo muestre por pantalla.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.print("Ingrese su nombre: ");
        String frase = leer.nextLine();
        
        System.out.println("El nombre ingresado fue: " + frase);
    }
    
}
