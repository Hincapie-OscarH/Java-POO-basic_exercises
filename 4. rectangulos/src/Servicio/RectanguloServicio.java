
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;


public class RectanguloServicio {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la base del rectángulo");
        double base = leer.nextDouble();
   
        System.out.println("Ingrese la altura del rectángulo");
        double altura = leer.nextDouble();
        
        return new Rectangulo(base ,altura);
    }
    
    public void superficie(Rectangulo rectangulo){
        int superficie = (int) (rectangulo.getBase() * rectangulo.getAltura());
        System.out.println("La superficie es: "+ superficie);
    }
    
    public void perimetro(Rectangulo rectangulo){
        int perimetro = (int) ((rectangulo.getBase() + rectangulo.getAltura()) * 2);
        System.out.println("El perímetro es: "+ perimetro);
    }
    
    public void dibujo(Rectangulo rectangulo){
        for (int i = 1; i <= rectangulo.getAltura(); i++) {
            for (int j = 1; j <= rectangulo.getBase(); j++) {
                if(i == 1 || i == rectangulo.getAltura()|| j == 1 || j == rectangulo.getBase()){
                    System.out.print("*");
                }else{
                   System.out.print(" "); 
                }   
            }
            System.out.println(" ");
        }
    }
    
}