/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.
 */
package guia3;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
       int limite;
       int suma = 0;
       int num;
       
        System.out.println("Ingrese un limite: ");
        limite = leer.nextInt();
        
        do {
          System.out.println("Ingrese numeros que se sumaran hasta superar el limite: ");
          num = leer.nextInt();
          suma = suma + num;
        } while (suma<limite);
        
        System.out.println("La suma total es: "+suma);
        
    }
    
}
