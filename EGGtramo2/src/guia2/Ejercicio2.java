/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guia2;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre y sera mostrado por pantalla: ");
        nombre = leer.next();
        System.out.println("El nombre ingresado es: "+nombre);
        
    }
    
}
