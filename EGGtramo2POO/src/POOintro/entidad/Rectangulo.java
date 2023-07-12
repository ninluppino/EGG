/*
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. .
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package POOintro.entidad;

import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextDouble();
    }
    
    
    public double superficie(){
        double superficie = this.base * this.altura;
        System.out.println("La superficie del rectangulo es: "+superficie);
        return superficie; 
    }
    
    //Perímetro = (base + altura) * 2
    
    public double perimetro(){
        double perimetro = (this.base*this.altura) *2;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        return perimetro;       
    }
    
  
    
   
    
}
