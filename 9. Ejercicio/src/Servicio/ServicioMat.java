
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;
import java.util.Random;


public class ServicioMat {
    
    
    Scanner leer = new Scanner(System.in);
    public Matematica crearNumero() {
        
        double numero1 = Math.random()*10;
        double numero2 = Math.random()*10;
         
        return new Matematica(numero1, numero2);
    }
    
    public void devolverMayor(Matematica matematica){
        if(matematica.getNumero1() < matematica.getNumero2()){
            System.out.println("El número mayor es: "+matematica.getNumero2());
        }else{
            System.out.println("El número mayor es: "+matematica.getNumero1());
        }
    }
    
    public void calcularPotencia(Matematica matematica){
        double n1 = Math.round(matematica.getNumero1() * 100.0) / 100.0;
        double n2 = Math.round(matematica.getNumero2() * 100.0) / 100.0;
        if(n1 < n2){
            System.out.println(n2+" elebado a "+n1+" es: "+Math.pow(n2, n1));
        }else{
            System.out.println(n1+" elebado a "+n2+" es: "+Math.pow(n1, n2));
        }
        
    }
    
    public void calculaRaiz(Matematica matematica){
        if(matematica.getNumero1() < matematica.getNumero2()){
            System.out.println("Raiz cuadrada de "+ matematica.getNumero2()+" es: "+Math.sqrt(Math.abs(matematica.getNumero2())));
        }else{
            System.out.println("Raiz cuadrada de "+ matematica.getNumero1()+" es: "+Math.sqrt(Math.abs(matematica.getNumero1())));
        }
    }
}