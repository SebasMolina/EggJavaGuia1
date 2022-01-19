/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int i=0;
        while(i<4){
            System.out.print("Ingrese valor "+(i+1)+": ");
            int nro = leer.nextInt();
            if(nro>0 && nro<21){
                            for(int j=0; j<nro; j++){
                System.out.print("*");
            }
            System.out.println("");
            i++;
            } else {
                System.out.println("ERROR--Ingrese un numero entre 1 y 20");
            }
        }
        
    }
    
}