
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class ServicioPersona {
    
    private Scanner leer = new Scanner(System.in);


    public Persona crearPersona() {
	// Pedimos los datos al usuario para crear el Obj Persona
	System.out.println("\nIngrese nombre: ");
	String nombre = leer.nextLine();
	System.out.println("\nIngrese la fecha de nacimiento.");
	System.out.println("Año: ");
	int anio = Integer.parseInt(leer.nextLine());
	System.out.println("Mes: ");
	int mes = Integer.parseInt(leer.nextLine());

	System.out.println("Dia: ");
	int dia = Integer.parseInt(leer.nextLine());
	// Se crea la fecha para pasarla al Objeto Persona
	LocalDate fechaNaciemiento = LocalDate.of(anio, mes, dia);
	// Creamos el objeto directamente en el return
	// es igual a decir Persona p = new Persona(nombre, apellido, fechaNaciemiento);
	return new Persona(nombre, fechaNaciemiento);
    }

    public void mostrarPersona(Persona persona) {
	System.out.println(persona.toString());
    }

    public int calcularEdad(Persona persona) {
	LocalDate fechaNacimiento = persona.getFechaNacimiento();
	LocalDate fechaActual = LocalDate.now();
	int calcularEdad = (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
	return calcularEdad;
    }

    public void menorQue(Persona persona, int edad) {
	boolean esMenor = false; 
	int edadPersona = calcularEdad(persona); 
	if (edadPersona < edad) {
            System.out.println("La persona es menor a la edad ingresada");
	} else {
            System.out.println("La persona es mayor a la edad ingresada");
        }
    }
}