/*
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es 
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package guia4;

import java.util.Scanner;

public class Ejercicio4 {

    
     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es primo o no: ");
        int num = leer.nextInt();
        
        System.out.println(numeroPrimo(num));
        
    }
    
    public static boolean numeroPrimo(int num){
        
        Scanner leer = new Scanner(System.in);
        boolean retorno = false;
        int contador = 0;
        int paso = 0;
        
        do {
            paso++;
            
            if (num%paso == 0) {
                contador++;
            }
                    
            
        } while (paso != num);
        
            if (contador ==2) {
            retorno = true;
        }
        
        return retorno;
    }
}
