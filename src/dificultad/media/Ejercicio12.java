/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro;
        do{
            System.out.print("Ingrese un numero: ");
            nro = leer.nextInt();
        } while(nro<0 || nro>10);

    }
    
}
