/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
   Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
   constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
   luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
   numero de páginas.
*/


package pkg1.libro;

import Entidad.Libro;
import Servicio.LibroServicio;


public class main {

    public static void main(String[] args) {
        
        System.out.println("Comienzo...");
        
        LibroServicio lb = new LibroServicio();
        Libro libro = lb.crearLibro();
        
        lb.impresion(libro);
    }
    
}