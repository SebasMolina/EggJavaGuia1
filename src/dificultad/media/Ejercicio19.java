/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese la cantidad de euros a cambiar: ");
        double valor = leer.nextDouble();
        System.out.println("Ingrese 1 para LIBRAS | 2 para DOLAR | 3 para YENES");
        int moneda = leer.nextInt();
        cambioMoneda(valor, moneda);
    }
    
    public static void cambioMoneda(double valor, int moneda){
        final double libra= 0.86;
        final double dolar= 1.28611;
        final double yenes= 129.852;
        switch(moneda){
            case 1:
                //libras
                System.out.println(valor+"€ = "+(valor*libra)+" libras");
                break;
            case 2:
                //dolar
                System.out.println(valor+"€ = "+(valor*dolar)+" dolares");
                break;
            case 3:
                //yenes
                System.out.println(valor+"€ = "+(valor*yenes)+" yenes");
                break;
            default:
                System.out.println("Eligió una opción incorrecta!");
        }
    }
}
