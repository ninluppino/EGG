/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package guia3;

import java.util.Scanner;

public class Ejercicio7 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int lecturasC = 0;
      int lecturasI = 0;
      int contador = 0;
      String ingreso;
      
      
        System.out.println("Programa de simulacion de dispositivo RS232");
        System.out.println("Ingresar una cadena de 5 caracteres, con 'X' de primer caracter y 'O' de ultimo caracter");
        System.out.println("Al ingresar '&&&&&' esta marcando el final de los envios.");
        
        
        do {
            contador++;
            
            System.out.println("Ingreso #"+contador+" :");
            
            ingreso = leer.next();
            
            if(!"&&&&&".equals(ingreso)){
            if (ingreso.length()==5 && "X".equalsIgnoreCase(ingreso.substring(0, 1)) && "O".equalsIgnoreCase(ingreso.substring(4, 5)) ) {
                lecturasC = lecturasC + 1;
            }else{
                lecturasI = lecturasI + 1;
            }
            }
            
        } while (!"&&&&&".equals(ingreso));
        
        System.out.println("La cantidad de lecturas correctas fueron: "+lecturasC);
        System.out.println("La cantidad de lecturas incorrectas fueron: "+lecturasI);
        
    }
    
}
