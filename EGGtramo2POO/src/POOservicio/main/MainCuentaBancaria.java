
package POOservicio.main;

import POOservicio.entidad.CuentaBancaria;
import POOservicio.servicio.CuentaBancariaServicio;
import java.util.Scanner;


public class MainCuentaBancaria {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = cbs.crearCuenta();
        
        String rta;
        
        
        do {
            
            System.out.println("Que desea hacer?");
            System.out.println("1-❦ Ingresar dinero.");
            System.out.println("2-❦ Retirar dinero.");
            System.out.println("3-❦ Extraccion rapida.");
            System.out.println("4-❦ Consultar saldo.");
            System.out.println("5-❦ Consultar datos de la cuenta.");
            
            int op = leer.nextInt();
            
            switch (op) {
                case 1:
                    cbs.ingresar(cuenta1);
                    break;
                case 2:
                    cbs.retirar(cuenta1);
                    break;
                case 3:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cbs.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cbs.consultarDatos(cuenta1);
                    break;
                default:
                    System.out.println("ERROR: La opcion ingresada no es correcta.");
            }
            
            System.out.println("Desea salir? s/n");
            rta = leer.next();
            
        } while (!rta.equalsIgnoreCase("si"));
        
    }
    
}
