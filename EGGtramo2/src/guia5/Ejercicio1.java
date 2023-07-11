/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
 */
package guia5;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int vector[] = new int[100];
        
        //lleno vector
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 100 - i;
        }
        
        //muestro vector
        
        for (int i = 0; i < vector.length ; i++) {
            System.out.print("["+vector[i]+"]");
        }
        
    }

   
    
}
