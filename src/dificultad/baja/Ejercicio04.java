package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio04 {
    /*  
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en
    grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese la temperatura en ºC: ");
        double temp = leer.nextDouble();
        double tempF = 32 + (9* temp /5);
        System.out.println(temp+"ºC, en Fahrenheit es : "+ tempF+"ºF");
        
    }   
}