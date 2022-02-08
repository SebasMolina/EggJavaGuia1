/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de N: ");
        int n = leer.nextInt();
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i== 0 || i== n - 1 || j== 0 || j== n-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
