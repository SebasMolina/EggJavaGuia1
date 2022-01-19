/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
package dificultad.media;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        final String fde = "&&&&&";
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Bienvenido al sistema emulado de un dispositivo RS232");
        System.out.print("Ingrese los comandos que desea probar: ");
        int correcta=0, incorrecta=0;
        String valor = leer.next();
        while (!valor.equals(fde)){
            if (valor.length()== 5 && valor.toUpperCase().startsWith("X") && valor.toUpperCase().endsWith("O")){
                correcta++;
            } else {
                incorrecta++;
            }
            valor = leer.next();
        }
        System.out.println("COMANDOS CORRECTOS: "+correcta);
        System.out.println("COMANDOS INCORRECTOS: "+incorrecta);
    }
    
}
