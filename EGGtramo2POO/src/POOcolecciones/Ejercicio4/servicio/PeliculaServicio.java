/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos 
en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package POOcolecciones.Ejercicio4.servicio;

import POOcolecciones.Ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class PeliculaServicio {
    private ArrayList<Pelicula> peliculas; // Atributo para almacenar la lista de películas

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPelicula() {
        peliculas = new ArrayList();
        boolean conf = true;

        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula.");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director.");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula. (en horas)");
            pelicula.setDuracion(leer.nextDouble());
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra pelicula? s/n");
            String rta = leer.next();
            if (rta.equalsIgnoreCase("n")) {
                break;
            }
        } while (conf);

        return peliculas;
    }

    public void mostrarPeliculas() {
        System.out.println("Lista de películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculasLargas() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarPeliculasPorDuracionDescendente() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenarPeliculasPorDuracionAscendente() {
    Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion));
    System.out.println("Películas ordenadas por duración (de menor a mayor):");
    for (Pelicula pelicula : peliculas) {
        System.out.println(pelicula);
    }
}

    public void ordenarPeliculasPorTitulo() {
    Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
    System.out.println("Películas ordenadas por título:");
    for (Pelicula pelicula : peliculas) {
        System.out.println(pelicula);
    }
}

    public void ordenarPeliculasPorDirector() {
    Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
    System.out.println("Películas ordenadas por director:");
    for (Pelicula pelicula : peliculas) {
        System.out.println(pelicula);
    }
}

}