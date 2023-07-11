/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, una 
usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia3;

import java.util.Scanner;

public class Ejercicio07extra {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros que quiere ingresar: ");
        double cantidad = leer.nextDouble();
        
        int contador = 0;
        double suma = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        
        do {
            contador++;
            System.out.println("Ingrese un numero: ");
            double num = leer.nextDouble();
            suma = suma + num;
            
            max = Math.max(max, num);
            min = Math.min(min, num);
            
        } while (cantidad != contador);
        
        double promedio = suma / contador;
        System.out.println("El promedio de los numeros ingresados es de: "+promedio);
        System.out.println("El minimo numero ingresado es: "+min);
        System.out.println("El maximo numero ingresado es: "+max);
    }
    
}
