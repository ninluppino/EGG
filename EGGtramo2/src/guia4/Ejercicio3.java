/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        cambio();
    }
    
    public static void cambio(){
        Scanner leer = new Scanner(System.in);
        double euros;
        String moneda;
        
        System.out.println("Ingrese una cantidad de euros a converir: ");
        euros = leer.nextDouble();
        System.out.println("A que moneda desea convertir? Escriba 'yenes' o 'libras' ");
        moneda = leer.next();
        
        if ("yenes".equalsIgnoreCase(moneda)) {
            System.out.println("La cantidad ingresada de euros es igual a "+(euros*157)+" yenes.");
        }else if ("libras".equalsIgnoreCase(moneda)) {
            System.out.println("La cantidad ingresada de euros es igual a "+(euros*0.85)+" libras.");
        }else{
            System.out.println("La moneda ingresada no es valida.");
        }
        
    }
}
