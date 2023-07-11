/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.
 */
package guia4;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        datos();
        
    }
    
    public static void datos(){
        
        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in);
        String rta;
        do {
            
            System.out.println("Ingrese el nombre de la persona: ");
        nombre = leer.next();
        System.out.println("Ingrese la edad de la persona: ");
        edad = leer.nextInt();
        
        
            if (edad>=18) {
                System.out.println("La persona es mayor de edad.");
            }else{
                System.out.println("La persona es menor de edad");
            }
            
            System.out.println("Desdea continuar? 'si' o 'no'");
            rta = leer.next();
        
        } while (!"no".equalsIgnoreCase(rta));
        
        
        
    }
}
