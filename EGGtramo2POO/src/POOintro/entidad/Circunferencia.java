/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package POOintro.entidad;

import java.util.Scanner;

public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio). 
  
    public void crearCircunferencia(){
        
        System.out.println("Ingrese el radio: ");
        this.radio = leer.nextDouble();
        
    }
    
    public void area(){
        double area = Math.PI*(Math.pow(this.radio,2));
        System.out.println("El area del circulo es: "+area);
    }
    
    public void perimetro(){
        double perimetro = 2*(Math.PI)*radio;
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
    
}
