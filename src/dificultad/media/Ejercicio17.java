/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package dificultad.media;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        int fila=0;
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if ((i!=1 || j!=1)&&(i!=1 || j!=2)&&(i!=2 || j!=1)&&(i!=2 || j!=2)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
