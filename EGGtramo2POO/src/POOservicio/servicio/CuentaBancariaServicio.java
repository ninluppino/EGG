/*

Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la 
cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package POOservicio.servicio;

import POOservicio.entidad.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        
        //IMPORTANTE dentro de crear cuenta crear la cuenta asi no trabajo siempre con la misma
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese el numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente: ");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo actual: ");
        cuenta.setSaldoActual(leer.nextDouble());
        
        return cuenta;
    }
    
    //uso el void y no uso retorno pero paso cuenta aca para editarlo
    
    public void ingresar(CuentaBancaria cuenta){
        
        System.out.println("Ingrese el dinero que desea depositar: ");
        double ingreso = leer.nextDouble();
        if (ingreso>0) {
          cuenta.setSaldoActual(ingreso+cuenta.getSaldoActual()); 
          
        }else{
            System.out.println("ERROR: el numero ingresado es invalido.");
        }
        
    }
    
    
    public void retirar(CuentaBancaria cuenta){
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        double retiro = leer.nextDouble();
        if (retiro>cuenta.getSaldoActual()) {
            System.out.println("No tiene suficiente dinero en cuenta para retirar $"+retiro);
            cuenta.setSaldoActual(0);
            System.out.println("Se ha retirado el maximo posible y ahora su saldo es de: $"+cuenta.getSaldoActual());
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
            System.out.println("Su saldo actual luego de retirar $"+retiro+" es de: $"+cuenta.getSaldoActual());
        }
    }
    
    
    
    public void extraccionRapida(CuentaBancaria cuenta){
        
        System.out.println("Cuanto dinero desea retirar? Recuerde que por extraccion rapida solo puede extraer el 20% de su saldo.");
        double retiro = leer.nextDouble();
        if (retiro>(0.2*cuenta.getSaldoActual())) {
            System.out.println("ERROR: valor mayor al permitido.");
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
            System.out.println("Su saldo restante es de: $"+cuenta.getSaldoActual());
        }
    }
    
   
    
    public void consultarSaldo(CuentaBancaria cuenta){
        
        System.out.println("Su saldo actual es de: $"+cuenta.getSaldoActual());
    }
    
    
    
    public void consultarDatos(CuentaBancaria cuenta){
        
        System.out.println("Los datos de la cuenta son: ");
        System.out.println("Numero de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI: "+cuenta.getDniCliente());
        System.out.println("Saldo actual: "+cuenta.getSaldoActual());
    }
    
}
