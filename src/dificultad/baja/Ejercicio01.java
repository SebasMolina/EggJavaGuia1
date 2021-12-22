package dificultad.baja;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio01 {
/*
    Escribir un programa que pida dos números enteros por teclado y 
    calcule la suma de los dos. 
    El programa deberá después mostrar el resultado de la suma    
    
*/
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.print("Ingrese primer numero: ");
        int num1 = leer.nextInt();
        
        System.out.print("Ingrese segundo numero: ");
        int num2 = leer.nextInt();
        
        int suma = num1+num2;
        System.out.println("La suma es: "+ suma);
        
    }
    
}
