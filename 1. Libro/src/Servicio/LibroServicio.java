
package Servicio;

import Entidad.Libro;
import java.util.Scanner;


public class LibroServicio {
    
    public Libro crearLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN del libro");
        int ISBN = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingrese el título del libro");
        String titulo = leer.next();
        leer.nextLine();
        
        System.out.println("Ingrese el autor del libro");
        String autor = leer.next();
        leer.nextLine();
        
        System.out.println("Ingrese la cantidad de páginas del libro");
        int numeroPaginas = leer.nextInt();
        
        System.out.println("Libro creado");
        return new Libro(ISBN, titulo, autor, numeroPaginas);
    }

    public void impresion(Libro libro){
        System.out.println("Datos del libro");
        System.out.println("Título: "+ libro.getTitulo());
        System.out.println("Autor: "+ libro.getAutor());
        System.out.println("ISBN: "+ libro.getISBN());
        System.out.println("Número de páginas: "+libro.getNumeroPaginas());
    }
    
}