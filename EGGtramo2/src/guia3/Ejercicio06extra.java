/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia3;

import java.util.Scanner;


public class Ejercicio06extra {
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas de las cuales va a ingresar la altura: ");
        int num = leer.nextInt();
        int contador = 0;
        int contadorBaja = 0;
        double estaturaBaja = 0;
        double estaturaPromedio = 0;
       
        
        do {
            contador++;
            System.out.println("Ingrese estatura (en metros sin coma ni punto): ");
            double estatura = leer.nextDouble();
            if (estatura<160) {
                estaturaBaja = estaturaBaja + estatura;
                contadorBaja++;
            }else{
               estaturaPromedio = estaturaPromedio + estatura;
            }
        } while (contador != num);
        
        System.out.println("El promedio de estaturas por debajo de 1,60m es de: "+(estaturaBaja/contadorBaja));
        System.out.println("El promedio de estaturas general es de: "+(estaturaBaja+estaturaPromedio)/contador);
    }
    
}
