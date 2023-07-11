/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra
el numero y si se encuentra repetido
 */
package guia5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector: ");
        
        int d = leer.nextInt();
        int[] vector = new int[d];
        
         
        
        System.out.println("Ingrese un numero a buscar: ");
        int num = leer.nextInt();
        
        int contador = 0;
        int[] indicesRepetidos = new int[d];
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num) {
                indicesRepetidos[contador] = i;
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("El número se encuentra en la posicion: " + Arrays.toString(Arrays.copyOf(indicesRepetidos, contador)));
        }else if(contador > 1 ){
            System.out.println("El número se repite " + contador + " veces.");
        }else if(contador==2){
            System.out.println("El numero se repite una vez.");
        }else{
            System.out.println("El numero no se ecnuentra en el vector.");
        }
        
        
       
        llenarVector(vector);
        mostarVector(vector);
        
        
       
       
                
    }
    
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10);
        }
    }
    
    public static void mostarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");    
               
    }
    
}
