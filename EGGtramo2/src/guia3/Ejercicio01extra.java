/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia3;

import java.util.Scanner;

public class Ejercicio01extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dia = 0;
        int horas = 0;
        
        System.out.println("Ingrese un tiempo expresado en minutos para calcular su equivalente en dias y horas: ");
        
        int min = leer.nextInt();
        
        dia = min/1440;
        
       
    }
    
}
