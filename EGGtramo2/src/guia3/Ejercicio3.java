/*
 * Realizar un programa que solo permita introducir frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package guia3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String c;
        System.out.println("Ingrese una contraseña de 8 caracteres de largo: ");
        c = leer.nextLine();
        if (c.length() == 8) {
            System.out.println("Correcto :)");
        }else{
            System.out.println("Incorrecto, ingrese una contraseña valida.");
        }
    }
    
}
