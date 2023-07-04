package guia2;

//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
//El programa deberá después mostrar el resultado de la suma.
import java.util.Scanner;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero para sumarle al primero: ");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: "+suma);
                
        }
    
}
