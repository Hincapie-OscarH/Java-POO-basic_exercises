
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;


public class OperacionServicio {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Ingrese el 1er número");
        int numero1 = leer.nextInt();
        
        System.out.println("Ingrese el 2do número");
        int numero2 = leer.nextInt();
        
        return new Operacion(numero1,numero2);

    }
    
    public void sumar(Operacion operacion){
        int suma = operacion.getNumero1() + operacion.getNumero2();
        System.out.println("La suma es: "+ suma);
    }
    
    public void restar(Operacion operacion){
        int resta = operacion.getNumero1() - operacion.getNumero2();
        System.out.println("La resta es: "+ resta);
    }
    
    public void multi(Operacion operacion){
        if(operacion.getNumero1() == 0 || operacion.getNumero2() == 0){
            System.out.println("Error");
        }else if(operacion.getNumero1() != 0 || operacion.getNumero2() != 0){
            int multi = operacion.getNumero1() * operacion.getNumero2();
        System.out.println("La multiplicación es: "+ multi);
        }
    }
    
    public void div(Operacion operacion){
        if(operacion.getNumero2() == 0){
            System.out.println("Error no se puede dividir por cero");
        }else if(operacion.getNumero2() != 0){
            int div = operacion.getNumero1() / operacion.getNumero2();
        System.out.println("La división es: "+ div);
        }
    }
    
}