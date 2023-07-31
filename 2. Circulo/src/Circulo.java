
import Servicios.CircunferenciaServicio;
import Entidad.Circunferencia;

/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
   tipo real. A continuación, se deben crear los siguientes métodos:
   a) Método constructor que inicialice el radio pasado como parámetro.
   b) Métodos get y set para el atributo radio de la clase Circunferencia.
   c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
   objeto.
   d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
   e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
   package pkg2.circulo;
*/

public class Circulo {


    public static void main(String[] args) {
        System.out.println("Comienzo...");
        
        CircunferenciaServicio SV = new CircunferenciaServicio();
        Circunferencia circunferencia = SV.crearCircunferencia();
        
        SV.area(circunferencia);
        SV.perimetro(circunferencia);
    }
    
}