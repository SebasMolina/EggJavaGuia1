package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y
    después toda en minúsculas. Nota: investigar la función toUpperCase() y
    toLowerCase() en Java.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("La frase ingresada pasada a mayusculas:");
        System.out.println(frase.toUpperCase());
    }
    
}
