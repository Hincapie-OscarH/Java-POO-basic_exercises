
package Entidad;


public class Libro {
    
    private int ISBN;
    private String titulo;
    private String Autor;
    private int numeroPaginas;

    public Libro() {
    }
    
    public Libro(int ISBN, String titulo, String Autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
  
}