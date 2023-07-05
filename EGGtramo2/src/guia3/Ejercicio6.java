/*
 *Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package guia3;

import java.util.Scanner;

public class Ejercicio6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num2 = leer.nextInt();
        int opcion;
        String salir = "N";
        
        do{
            System.out.println("MENÚ");
            System.out.println(" 1. Sumar");
            System.out.println(" 2. Restar");
            System.out.println(" 3. Multiplicar");
            System.out.println(" 4. Dividir");
            System.out.println(" 5. Salir");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();
        
        
        
        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros es: "+ (num1+num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es: "+ (num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es: "+(num1*num2));
                break;
            case 4:
                System.out.println("La division de los numeros es: "+(num1/num2));
                break;
            case 5:
                System.out.println("Estas segura de que deseas salir? S/N");
                salir = leer.next();
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta.");
        }
        
        }while(!"S".equalsIgnoreCase(salir));
                
    }
    
}
