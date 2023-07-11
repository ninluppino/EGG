/*
 *Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y determine 
el importe en efectivo a pagar por dicho socio.

 */
package guia3;

import java.util.Scanner;

public class Ejercicio05extra {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingrese el precio del tratamiento");
        double precio = leer.nextDouble();
        
        System.out.println("Ingrese que clase de socio es: 'A', 'B' o 'C'");
        String socio = leer.next();
        
        double descuento=0;
        
        switch (socio) {
            case "A":
                descuento = precio * 0.5;
                break;
            case "B":
                descuento = precio * 0.35;
                break;
            case "C":
                descuento = 0;
                break;
            default:
                System.out.println("El caracter ingresado no corresponde a un tipo de socio.");
        }
        System.out.println("El descuento aplicado es de $"+descuento);
        System.out.println("El precio final del tratamiento es de: $"+(precio-descuento));
    }
    
}
