/*
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
package POOservicio.servicio;

import POOservicio.entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
      Cafetera cafetera = new Cafetera();
      cafetera.setCapacidadMaxima(100);
      return cafetera;
    }
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se lleno la cafetera ☕");
    }
    
    public void servirTaza(Cafetera cafetera){
        
        System.out.println("Que temaño tiene la taza que desea llenar? (En ml)");
        double tamano = leer.nextDouble();
        System.out.println("---☕ sirviendo ☕---");
        if (cafetera.getCantidadActual()<tamano) {
            System.out.println("La cafetera no tiene suficiente cafe :(");
            System.out.println("Se ha servido lo que quedaba, la taza no se ha llenado.");
            System.out.println("En la taza han quedado "+cafetera.getCantidadActual()+"ml");
        }else{
            System.out.println("La taza se ha llenado con exito!!! :)");
        }
        
    }
    
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera.");
    }
    
    
    public void agregarCafe(Cafetera cafetera){
        
        System.out.println("Ingrese la cantidad de cafe que desea agregar.");
        double agregar = leer.nextDouble();
        if (agregar>cafetera.getCapacidadMaxima()||agregar>cafetera.getCantidadActual()+agregar) {
            System.out.println("La cafetera se revalso!! Pero llego a su maximo ;)");
            System.out.println("La cantidad actual es de "+cafetera.getCapacidadMaxima());
        }else{
            System.out.println("Se agrego cafe con exito. La cantidad actual es de "+(cafetera.getCantidadActual()+agregar));
        }
    }
}
