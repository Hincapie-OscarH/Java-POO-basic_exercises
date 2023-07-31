/*
6.  Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
    métodos:
     Constructor predeterminado o vacío
     Constructor con la capacidad máxima y la cantidad actual

     Métodos getters y setters.
     Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    máxima.
     Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
     Método vaciarCafetera(): pone la cantidad de café actual en cero.
     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.
*/


package pkg6.nespresso;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // Creamos un servicio de cafetera     
        CafeteraServicio servicio = new CafeteraServicio();
        
        // Creamos una cafetera con capacidad máxima de 2000 ml  
        Cafetera cafetera = servicio.crearCafetera();
        

        // Menú principal
        
        int opcion = 0; 
        while (opcion != 5) {   
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Llenar cafetera");  
            System.out.println("2. Servir taza"); 
            System.out.println("3. Vaciar cafetera");  
            System.out.println("4. Agregar café a la cafetera");    
            System.out.println("5. Salir");      
            System.out.print("Ingrese una opción: ");   
            opcion = scanner.nextInt();switch (opcion) {   
                case 1: servicio.llenarCafetera(cafetera);
                    break;  
                case 2: servicio.servirTaza(cafetera);
                    break; 
                case 3: servicio.vaciarCafetera(cafetera);
                    break;       
                case 4: servicio.agregarCafe(cafetera);
                    break;         
                case 5: System.out.println("Saliendo del sistema...");
                    break; 
                default: System.out.println("Opción inválida. Intente de nuevo.");  
                }     
            System.out.println();   
        }  
    }
}