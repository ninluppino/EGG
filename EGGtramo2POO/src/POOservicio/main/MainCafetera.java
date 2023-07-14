
/*
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. 
Crear clase CafeteraServicio en el paquete Servicios con los
siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la 
acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera 
la cantidad de café indicada.
*/
 
package POOservicio.main;

import POOservicio.entidad.Cafetera;
import POOservicio.servicio.CafeteraServicio;
import java.util.Scanner;


public class MainCafetera {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafetera1 = cs.crearCafetera();
        
        String rta;
        
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1-☕ Llenar cafetera.");
            System.out.println("2-☕ Servir taza.");
            System.out.println("3-☕ Vaciar cafetera.");
            System.out.println("4-☕ Agregar cafe. ");
            
            int op = leer.nextInt();
            
            switch (op) {
                case 1:
                    cs.llenarCafetera(cafetera1);
                    break;
                case 2:
                    cs.servirTaza(cafetera1);
                    break;
                case 3:
                    cs.vaciarCafetera(cafetera1);
                    break;
                case 4:
                    cs.agregarCafe(cafetera1);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida...");
            }
            
            System.out.println("Desea salir? s/n");
            rta = leer.next();
            
        } while (!rta.equalsIgnoreCase("s"));
        
        
    }
    
}
