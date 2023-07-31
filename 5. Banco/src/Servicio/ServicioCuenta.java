
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;


public class ServicioCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearCuenta(Cuenta cuenta) { 
        // Código para pedir datos al usuario y asignarlos a la cuenta 
    }
    
    public void ingresar(Cuenta cuenta, double cantidad) {  
        double saldoActual = cuenta.getSaldoActual(); 
        saldoActual += cantidad;    
        cuenta.setSaldoActual(saldoActual); 
    }
    
    public void retirar(Cuenta cuenta, double cantidad) { 
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
            cuenta.setSaldoActual(saldoActual);  
        }else {  
            System.out.println("No se puede retirar esa cantidad. El saldo actual es de " + saldoActual);
            System.out.println("Retirando el monto máximo posible: " + saldoActual);  
            cuenta.setSaldoActual(0);
        }
    }
    
    public void extraccionRapida(Cuenta cuenta) { 
        double saldoActual = cuenta.getSaldoActual(); 
        if (saldoActual == 0) {  
            System.out.println("No se puede realizar extracción rápida. El saldo actual es cero."); 
        }else { 
            double limite = saldoActual * 0.2; 
            saldoActual -= limite; 
            cuenta.setSaldoActual(saldoActual); 
        }
    }
    
    public double consultarSaldo(Cuenta cuenta) {   
        return cuenta.getSaldoActual();  
    }
    
    public void consultarDatos(Cuenta cuenta) {  
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());  
        System.out.println("DNI del cliente: " + cuenta.getDniCliente()); 
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());  
    }
}