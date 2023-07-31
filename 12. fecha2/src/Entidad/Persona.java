
package Entidad;

import java.time.LocalDate;

public class Persona {
    
    private String nombre;
    private LocalDate fechaNacimiento;
	
    // Constructor vacio
    public Persona() {
    	fechaNacimiento = LocalDate.now(); // Para que no se cree la fecha en null
    }

    // Constructor con parametros
    public Persona(String nombre,  LocalDate fechaNacimiento) {
	this.nombre = nombre;
	this.fechaNacimiento = fechaNacimiento;
    }

    // Getters & Setters
    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
    	return "[ Persona ] \nNombre = " + nombre + " \nFecha De Nacimiento = "+ fechaNacimiento;
    }
	
}