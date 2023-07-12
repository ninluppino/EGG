/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear 
los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado 
al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
se devuelve el resultado al main.

 */
package POOintro.entidad;

import java.util.Scanner;


public class Operacion {
    Scanner leer = new Scanner(System.in);
    
    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
  //Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    
    public void crearOperacion(){
        System.out.println("Ingrese el numero 1: ");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2: ");
        this.num2 = leer.nextInt();
    }
    
  //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public int sumar(){
        int suma;
        suma = this.num1 + this.num2;
        System.out.println("La suma de los numeros es: "+suma);
        return suma;
    }
  
  //Método restar(): calcular la resta de los números y devolver el resultado al main  
    
    public int restar(){
        int resta;
        resta = this.num1 - this.num2;
        System.out.println("La resta de los numeros es: "+resta);
        return resta;
    }
    
  //Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
  //el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado 
  //al main
    
    public int multiplicar(){
        int multiplicacion;
        if (this.num1==0 || this.num2==0) {
            multiplicacion = 0;
            System.out.println("ERROR: multiplicacion por 0.");
        }else{
            multiplicacion = this.num1 * this.num2;
            System.out.println("La multiplicacion de los numeros da: "+multiplicacion);
        }
        return multiplicacion;
    }
    
  //Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
  //el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
  //se devuelve el resultado al main.
    
    public int dividir(){
        int division;
        if (this.num1==0 || this.num2==0) {
            division = 0;
            System.out.println("ERROR: division por 0.");
        }else{
            division = this.num1/this.num2;
            System.out.println("La division de los numeros da: "+division);
        }
        
        return division;
    }
    
}
