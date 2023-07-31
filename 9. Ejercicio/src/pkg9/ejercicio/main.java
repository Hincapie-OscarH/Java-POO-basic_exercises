/*
9.   Realizar una clase llamada Matemática que tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set. Deberá además implementar los siguientes métodos:

    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package pkg9.ejercicio;

import Entidad.Matematica;
import Servicio.ServicioMat;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ServicioMat servicio = new ServicioMat();
        Matematica matematica = servicio.crearNumero();
        
        int opcion = 0; 
        while (opcion != 4) {   
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Mostrar mayor");  
            System.out.println("2. Calcular potencia"); 
            System.out.println("3. Calcular raíz");          
            System.out.println("4. Salir");      
            System.out.print("Ingrese una opción: ");   
            opcion = leer.nextInt();switch (opcion) {   
                case 1: servicio.devolverMayor(matematica);
                    break;  
                case 2: servicio.calcularPotencia(matematica);
                    break; 
                case 3: servicio.calculaRaiz(matematica);
                    break;                
                default: System.out.println("Opción inválida. Intente de nuevo.");  
                }     
            System.out.println();   
        }  
    }
}