
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera() {
	System.out.println("Ingresa la cantidad maxima de la cafetera: ");
	int cantidadMaxima = leer.nextInt();

	System.out.println("Ingresa la cantidad actual de la cafetera: ");
	int cantidadActual = leer.nextInt();
		
	return new Cafetera(cantidadMaxima, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera cafetera) {
	cafetera.setCantidadActual(cafetera.getCantidadMaxima());
	System.out.println("Se lleno por completo la cafetera.");
    }
    
    public void servirTaza(Cafetera cafetera) {
	System.out.println("Ingrese el tamaño de la taza:");
	int tamanoTaza = leer.nextInt();
	int canActual = cafetera.getCantidadActual();
	int calculo = canActual - tamanoTaza;

	// validamos la cantidad a servir
	if (canActual < tamanoTaza) {
            System.out.println("No se pudo llenar la taza de cafe, ya que la cantidad de cafe que quedaba era: " + canActual);
            System.out.println("Faltaron " + Math.abs(calculo) + " mililitros para llenar la taza");
            // seteamos la cantidad en 0
            cafetera.setCantidadActual(0);

	} else if (canActual == tamanoTaza) {
            System.out.println("Se lleno la taza");
            System.out.println("La cafetera quedó vacia!");

            // seteamos la cantidad en 0
            cafetera.setCantidadActual(0);

	} else {
            System.out.println("La taza se lleno completamente");
            System.out.println("La cafetera quedo con una cantidad actual de " + calculo);

            // seteamos la cantidad restando la taza servida
            cafetera.setCantidadActual(calculo);
	}
    }
    
    public void vaciarCafetera(Cafetera cafetera) {
	cafetera.setCantidadActual(0);
	System.out.println("Se vacio por completo la cafetera");
    }
    
    public void agregarCafe(Cafetera cafetera) {
	System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
	int cantidad = leer.nextInt();
		
	int cantActual = cafetera.getCantidadActual(); // traemos la cantidad actual de la cafetera
	int carga = cantActual + cantidad;

	// validamos que la carga no supere la cantidad maxima
	if (carga < cafetera.getCantidadMaxima()) {
            // seteamos la carga a la cantidad a la cantidad actual
            cafetera.setCantidadActual(carga);
            System.out.println("Se han cargado " + cantidad + " mililitros a la cafetera.");
            System.out.println("La cantidad actual es: " + cafetera.getCantidadActual());
	} else {
            System.out.println("[ERROR] La cantidad que desea cargar supera la cantidad maxima.");
            System.out.println("La cantidad actual es: " + cafetera.getCantidadActual());
            System.out.println("La cantidad maxima es: " + cafetera.getCantidadMaxima());
	}

    }
}