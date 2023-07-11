/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números 
pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 */
package guia3;

import java.util.Scanner;

public class Ejercicio08extra {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int contador = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        do {
             contador++;
             System.out.println("Ingrese un numero: ");
             num = leer.nextInt();
             if ((num%2)==0) {
                contadorPares++;
            }else{
                 contadorImpares++;
             }
        } while (num % 5 !=0);
        
        System.out.println("La cantidad de numeros ingresados es de: "+contador);
        System.out.println("De esos, "+contadorPares+" fueron pares y "+contadorImpares+" impares.");
    }
    
}
