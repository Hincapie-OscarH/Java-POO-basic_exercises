/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
    clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
    se puede conseguir instanciando un objeto Date con constructor vacío.
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pkg11.fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Fecha {

    private static SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        
        
        Scanner leer = new Scanner(System.in);
        
        
        
       System.out.println("Digite el día, mes y año en formato dd/mm/yyyy");
       String nuevafecha = leer.next();
        
       Date nuevaFecha = fecha.parse(nuevafecha);
       System.out.println(fecha.format(nuevaFecha));
        
       Date fechaActual = new Date();
       System.out.println(fecha.format(fechaActual));
       
       int diferencia = nuevaFecha.getYear() - fechaActual.getYear();
        System.out.println("La diferencia es de "+Math.abs(diferencia));
        
    }
    
}