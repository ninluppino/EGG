/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package guia2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        double gradosC = leer.nextDouble();
        double gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Su equivalente en grados Fahrenheit es: "+gradosF + " grados Fahrenheit.");
    }
    
}
