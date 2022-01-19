/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro=1, suma=0;
        int[] numeros = new int[20];
        for (int i= 0; i< 20; i++){
            System.out.print("Ingrese un valor: ");
            nro = leer.nextInt();
            numeros[i]=nro;
            if (nro==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (nro > 0){
                suma += nro;
            }
        }
        for (int i=0; i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        System.out.println("El resultado de la suma es : "+suma);
        
        
    }
    
}
