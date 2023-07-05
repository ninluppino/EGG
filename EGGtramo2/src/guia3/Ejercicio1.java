/*Crear un programa que dado un número determine si es par o impar.
*/
package guia3;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero y se determinara si es par o impar: ");
        num = leer.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El numero ingresado es PAR.");
        }else{
            System.out.println("El numero ingresado es IMPAR");
        }
    }
    
}
