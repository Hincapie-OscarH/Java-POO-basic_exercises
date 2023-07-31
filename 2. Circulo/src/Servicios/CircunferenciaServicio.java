
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el radio del circulo");
        double r = leer.nextDouble();
                
        return new Circunferencia(r);
    }
    
    public void area(Circunferencia c){
        double area = Math.PI * Math.pow(c.getR(), 2);
        System.out.println("El área es: "+area);
    }
    
    public void perimetro(Circunferencia c){
        double perimetro = Math.PI * c.getR() * 2;
        System.out.println("El perimetro es: "+perimetro);
    }
    
}