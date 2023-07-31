/*
5.  Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pkg5.banco;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;
import java.util.Scanner;


public class main {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        ServicioCuenta servicio = new ServicioCuenta();  
        
        System.out.println("Bienvenido al programa de cuentas bancarias");
        
        // Pedir datos para crear cuenta    
        System.out.println("Ingrese el número de cuenta:");
        
        int numeroCuenta = scanner.nextInt(); 
        System.out.println("Ingrese el DNI del cliente:");   
        long dniCliente = scanner.nextLong(); 
        System.out.println("Ingrese el saldo inicial de la cuenta:");    
        double saldoInicial = scanner.nextDouble(); 
        
        // Crear cuenta con los datos ingresados     
        Cuenta cuenta = new Cuenta(numeroCuenta, dniCliente, saldoInicial);   
        // Mostrar menú de opciones al usuario    
        int opcion = 0;    
        while (opcion != 6) {  
            System.out.println();
            System.out.println("Seleccione una opción:");  
            System.out.println("1. Consultar saldo");   
            System.out.println("2. Realizar depósito");  
            System.out.println("3. Realizar retiro");     
            System.out.println("4. Realizar extracción rápida"); 
            System.out.println("5. Consultar datos de la cuenta");    
            System.out.println("6. Salir");   
            opcion = scanner.nextInt();  
            switch (opcion) {   
                case 1: double saldoActual = servicio.consultarSaldo(cuenta);
                    System.out.println("El saldo actual de la cuenta es: " + saldoActual);   
                    break; 
                case 2: System.out.println("Ingrese la cantidad a depositar:");   
                    double cantidadDeposito = scanner.nextDouble(); 
                    servicio.ingresar(cuenta, cantidadDeposito); 
                    System.out.println("El depósito se ha realizado exitosamente");   
                    break;      
                case 3:  System.out.println("Ingrese la cantidad a retirar:");    
                    double cantidadRetiro = scanner.nextDouble();  
                    servicio.retirar(cuenta, cantidadRetiro); 
                    System.out.println("El retiro se ha realizado exitosamente");  
                    break;      
                case 4: if (cuenta.getSaldoActual() == 0) {   
                    System.out.println("No se puede realizar la extracción rápida. Elsaldo actual es cero.");
                }else { 
                    servicio.extraccionRapida(cuenta);
                    System.out.println("Se ha realizado una extracción rápida"); 
                }
                    break;
                case 5: servicio.consultarDatos(cuenta);  
                    break; 
                case 6:  System.out.println("Gracias por usar el programa");    
                    break;   
                default: System.out.println("Opción inválida, intente de nuevo"); 
                    break;    
            }     
        }  
    }
}    