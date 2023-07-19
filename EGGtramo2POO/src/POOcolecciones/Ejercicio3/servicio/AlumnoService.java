/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la 
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario
si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo 
busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la 
lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package POOcolecciones.Ejercicio3.servicio;

import POOcolecciones.Ejercicio3.entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class AlumnoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //bucle que crea objeto alumno:
    
    public ArrayList<Alumno> crearListaAlumnos(){
       
       ArrayList<Alumno> alumnos = new ArrayList();
       
       boolean confirmacion = true;
       
       do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.next());
            System.out.println("Ingrese las notas del alumno: ");
            
            ArrayList<Integer> notas = new ArrayList();
            //limito la cantidad de notas a 3.
            for (int i = 0; i < 3; i++) {
               notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno? s/n");
            if (leer.next().equalsIgnoreCase("n")) {
               confirmacion = false;
           }
        } while (confirmacion);
       
        return alumnos;
    }
    
  //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo 
  //busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la 
  //lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.  
  
    public double buscarAlumno(ArrayList<Alumno>alumnos){
        
        System.out.println("Ingrese el nombre del alumno del cual desea saber la nota final.");
        String nombreNota = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
     
        while (it.hasNext()) {
           
            Alumno alumnoAux = it.next();
            
            if (alumnoAux.getNombre().equalsIgnoreCase(nombreNota)) {
               return promedioNotas(alumnoAux);
               
 
            }
        }
        System.out.println("No se encontro el alumno ingresado.");
       return 0; 
    }
    
    public double promedioNotas(Alumno alumno){
        
        double sumaNotas = 0;
        for (Integer nota: alumno.getNotas()) {
           sumaNotas += nota; 
        }
        return sumaNotas/alumno.getNotas().size();
    }
}
