/*
1) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 2) Continuando el ejercicio anterior, después de mostrar los perros, al usuario 
 se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el 
 perro en la lista. Si el perro está en la lista, se eliminará el perro 
 que ingresó el usuario y se mostrará la lista ordenada. Si el 
 perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
 */
package POOcolecciones.Ejercicio1y2.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        ArrayList<String> razas = new ArrayList();
        
        boolean confirmacion = true;
        
        do {
            System.out.println("Ingrese la raza del perro: ");
            razas.add(leer.next().toLowerCase());
            System.out.println("Desea agregar otro perro? s/n");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;
            }
        } while (confirmacion);
        
        for (String raza: razas) {
            System.out.println(raza);
        }
        
        System.out.println("Que raza de perro desea eliminar de la lista?");
        String razaEliminar = leer.next();
        
        Iterator it = razas.iterator();
        
        //importante, casi siempre va a ser asi con .hasNext para ir recorriendo la lista viendo si
        //tiene un elemento para iterar. it contiene los elementos de la lista.
        boolean noEncontrado = true;
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();
                noEncontrado = false;
                //break; (para que elimine uno solo)
            }
            
        }
        //hago un if x fuera del while
        
        if (noEncontrado) {
                System.out.println("No se encontro la raza ingresada en la lista.");
            }
        //ordeno la lista y la muestro
        Collections.sort(razas);
        for (String raza: razas) {
            System.out.println("---Lista ordenada---");
            System.out.println(raza);
        }
        
        
    }
    

    
    

}
