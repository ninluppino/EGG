/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un libro 
pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
 */
package POOintro.entidad;

import java.util.Scanner;

public class Libro {
Scanner leer = new Scanner(System.in);
    
public int ISBN;
public String titulo;
public String autor;
public int paginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "leer=" + leer + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }



//Crear un método para cargar un libro 
//pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
//el título, el autor del libro y el número de páginas.
 
public void cargarLibro(){
    
    System.out.println("Ingrese el numero de ISBN: ");
    //como estamos dentro de la clase No uso get ni set, uso this
    this.ISBN = leer.nextInt();
    System.out.println("Ingrese el titulo: ");
    this.titulo = leer.next();
    System.out.println("Ingrese el autor: ");
    this.autor = leer.next();
    System.out.println("Ingrese el numero de paginas: ");
    this.paginas = leer.nextInt();
    
}

public void mostarLibro(){
    System.out.println("El ISBN es: ");
    System.out.println(this.ISBN);
    System.out.println("El titulo es: ");
    System.out.println(this.titulo);
    System.out.println("El autor es: ");
    System.out.println(this.autor);
    System.out.println("El numero de paginas es: ");
    System.out.println(this.paginas);
    
}

}
