/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package guia3;

import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        int filas;
        int columnas;
        
        System.out.println("Ingrese la dimension del cuadrado: ");
        num = leer.nextInt();
        
        for (columnas = 1; columnas <= num; columnas++) {
            for (filas = 0; filas <= num; filas++) {
                if ((columnas>1) && (columnas<num) && (filas>1) && (filas<num)) {
                    System.out.println(" ");
                }else{
                    System.out.println("*");
                }
            }
            
            System.out.println("");
                
            
        }
        
    }
    
}
