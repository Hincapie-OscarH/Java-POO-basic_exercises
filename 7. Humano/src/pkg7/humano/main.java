/*
 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
    sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
    atributo, puede hacerlo. Los métodos que se implementarán son:
     Un constructor por defecto.
     Un constructor con todos los atributos como parámetro.
     Métodos getters y setters de cada atributo.
     Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    O. Si no es correcto se deberá mostrar un mensaje
     Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
     Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.
    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
    los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
    tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
    persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
    distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
    cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
    también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package pkg7.humano;

import Servicio.PersonaServicio;
import Entidad.Persona;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        //try (Scanner leer = new Scanner(System.in)){   
          //  PersonaServicio servicio = new PersonaServicio();
       // }
       Scanner leer = new Scanner(System.in);
       PersonaServicio servicio = new PersonaServicio();
        
        for (int i = 1; i <= 4; i++) {   
            System.out.println("Ingresando datos de persona " + i);
            System.out.print("Ingrese nombre de la persona: ");   
            String nombre = leer.nextLine();    
            System.out.print("Ingrese edad de la persona: ");   
            int edad = leer.nextInt();      
            leer.nextLine(); 
            System.out.print("Ingrese sexo de la persona (H, M, O): "); 
            char sexo = leer.nextLine().charAt(0); 
            while (sexo != 'H' && sexo != 'M' && sexo != 'O') {   
                System.out.print("Sexo ingresado incorrecto, por favor ingrese sexo válido (H, M, O): ");
                sexo = leer.nextLine().charAt(0);        
            }
            
            System.out.print("Ingrese peso de la persona en kg: ");   
            double peso = leer.nextDouble();
            leer.nextLine();     
            System.out.print("Ingrese altura de la persona en metros: ");  
            double altura = leer.nextDouble();          
            leer.nextLine();         
            Persona persona = new Persona(nombre, edad, sexo, peso, altura);      
            int imc = servicio.calcularIMC(persona); 
            System.out.println("IMC de la persona: " + imc);  
            switch (imc) { 
                case -1: 
                    if (!persona.esMayorDeEdad()) {    
                        System.out.println("La persona es menor de edad y está por debajo de su peso ideal");   
                    } else {  
                     System.out.println("La persona es mayor de edad y está por debajo de su peso ideal");    
                    }         
                    break;    
                case 0:      
                    if (!persona.esMayorDeEdad()) {     
                        System.out.println("La persona es menor de edad y tiene un peso ideal");      
                    } else {    
                        System.out.println("La persona es mayor de edad y tiene un peso ideal");       
                    }   
                    break; 
                case 1:      
                    if (!persona.esMayorDeEdad()) {   
                        System.out.println("La persona es menor de edad y tiene sobrepeso"); 
                    } else {      
                        System.out.println("La persona es mayor de edad y tiene sobrepeso");     
                    }       
                    break; 
                default: System.out.println("IMC no válido"); 
                break;
            }    
        }       
        leer.close();  
    }
}