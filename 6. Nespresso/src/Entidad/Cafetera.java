
package Entidad;


public class Cafetera {
    
    private int cantidadMaxima;
    private int cantidadActual;

    // constructor vacio
    public Cafetera() {
    }

    // Constructor con parametros
    public Cafetera(int cantidadMaxima, int cantidadActual) {
            this.cantidadMaxima = cantidadMaxima;
            this.cantidadActual = cantidadActual;
    }

    // Getters y Setters
    public int getCantidadMaxima() {
            return cantidadMaxima;
    }

    public void setCantidadMaxima(int capacidadMaxima) {
            this.cantidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
            return cantidadActual;
    }

    public void setCantidadActual(int capacidadActual) {
            this.cantidadActual = capacidadActual;
    }
}