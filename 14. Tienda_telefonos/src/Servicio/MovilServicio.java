
package Servicio;

import Entidad.Movil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MovilServicio {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private final Movil movil = new Movil();
    
    public StringBuilder ingresarCodigo() {
        StringBuilder codigomovil = new StringBuilder();
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el dígito " + (i + 1));
            codigo[i] = leer.nextInt();
            codigomovil.append(codigo[i]);
        }
        return codigomovil;
    }
    
    public void cargarCelular() {
        System.out.println("Ingresar marca del celular: ");
        movil.setMarca(leer.nextLine());
        System.out.println("Ingresar el modelo del celular: ");
        movil.setModelo(leer.nextLine());
        System.out.println("Ingrese la cantidad de memoria RAM: ");
        movil.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento del celular: ");
        movil.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el valor (precio) del celular: ");
        movil.setPrecio(leer.nextDouble());
        System.out.println("Ingresar los dígitos del código del celular: ");
        movil.setCodigo(ingresarCodigo());
    }
    
    public Movil getMovil() {
        return movil;
    }
    
}
