/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro=0;
        System.out.print("Ingrese un valor de limite superior: ");
        int limite = leer.nextInt();
        System.out.println("Se ira sumando los numeros que ira poniendo");
        do{
            System.out.print("Ingrese un numero: ");
            nro = nro + leer.nextInt();
            System.out.println(nro + " | " + limite);
        } while (nro <= limite);
    }
}
