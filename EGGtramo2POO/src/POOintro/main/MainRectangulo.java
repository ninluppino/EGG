/*
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package POOintro.main;

import POOintro.entidad.Rectangulo;

public class MainRectangulo {

    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.crearRectangulo();
        rectangulo1.perimetro();
        rectangulo1.superficie();
        
        
    }
    
}
