
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    private Scanner scanner = new Scanner(System.in);  
    
    public Persona crearPersona() {   
        System.out.print("Ingrese nombre de la persona: ");
        String nombre = scanner.nextLine();   
        System.out.print("Ingrese edad de la persona: ");   
        int edad = scanner.nextInt(); 
        scanner.nextLine();   
        System.out.print("Ingrese sexo de la persona (H, M, O): "); 
        char sexo = scanner.nextLine().charAt(0);     
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') { 
            System.out.print("Sexo ingresado incorrecto, por favor ingrese sexo válido (H, M, O): ");
            sexo = scanner.nextLine().charAt(0); 
        }  
        System.out.print("Ingrese peso de la persona en kg: ");
        double peso = scanner.nextDouble();  
        System.out.print("Ingrese altura de la persona en metros: ");  
        double altura = scanner.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public boolean esMayorDeEdad(Persona persona) { 
        return persona.getEdad() >= 18; 
    }
    
    public int calcularIMC(Persona persona) {    
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {    
            return -1;
           // persona con peso inferior al ideal  
        }else if (imc >= 20 && imc <= 25) {  
            return 0;
            // persona con peso ideal  
        }else { 
            return 1;
            // persona con sobrepeso 
        } 
    }
}