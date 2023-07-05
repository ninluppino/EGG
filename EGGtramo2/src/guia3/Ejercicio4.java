/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package guia3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("Ingrese una palabra o frase que empiece con la letra 'A'");
        palabra = leer.nextLine();
         if ("A".equalsIgnoreCase(palabra.substring(0, 1))) {
             System.out.println("Correcto :)");
        }else{
             System.out.println("Incorrecto.");
         }
    }
    
}
