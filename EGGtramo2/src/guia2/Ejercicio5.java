/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 

 */
package guia2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        System.out.println("Su doble es: "+num*2+". Su triple es: "+num*3+". Su raiz cuadrada es: "+ Math.sqrt(num));
    }
    
}
