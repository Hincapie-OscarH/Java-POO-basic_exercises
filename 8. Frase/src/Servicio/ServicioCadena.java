
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;


public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in);
    public Cadena crearfrase() {
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        int longitud = frase.length();
        
        return new Cadena(frase, longitud);
    }
    
    public void mostrarVocales(Cadena cadena){
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(cadena.getFrase().substring(i, i+1).equals("a") || cadena.getFrase().substring(i, i+1).equals("e") || 
                    cadena.getFrase().substring(i, i+1).equals("i") || cadena.getFrase().substring(i, i+1).equals("o") || cadena.getFrase().substring(i, i+1).equals("u") ){
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " +contador);
    }
    
    public void invertirFrase(Cadena cadena){
        String invertida = "";
	// Recorremos la original del final al inicio
	for (int indice = cadena.getLongitud() - 1; indice >= 0; indice--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            //invertida += cadena.getFrase().charAt(indice);
            System.out.print(cadena.getFrase().substring(indice, indice + 1));
	}
    }
    
    public void vecesRepetido(Cadena cadena){
        System.out.println("Digite una letra a buscar");
        String caracter = leer.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(cadena.getFrase().substring(i, i+1).equals(caracter)){
                contador++;
            }
        }
        System.out.println("El carácter " +caracter+" se repite "+contador+" veces.");
    }
    
    public void compararLongitud(Cadena cadena){
        System.out.println("Digite otra frase");
        String caracter = leer.nextLine();
        int longitud2 = caracter.length();
        
        if(cadena.getLongitud() == caracter.length()){
            System.out.println("La longitud de ambas frases es igual");
        }else if(cadena.getLongitud() < caracter.length()){
            System.out.println("La longitud de la frase original es menor");
        }else{
            System.out.println("La longitud de la frase original es mayor");
        }
    }
    
    public void unirFrases(Cadena cadena){
        System.out.println("Digite otra frase");
        String caracter = leer.nextLine();
        System.out.println("la frase combinada es: "+cadena.getFrase().concat(caracter));
    }
    
    public void reemplazar(Cadena cadena){
        System.out.println("Digite un caracter");
        String caracter = leer.nextLine();
        String frase2 = "";
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(cadena.getFrase().substring(i, i+1).equals("a")){
                frase2 += caracter;
            }else{
                frase2 += cadena.getFrase().substring(i, i+1);
            }
        }
        System.out.println(frase2);
        
    }
    
    public void contiene(Cadena cadena){
        boolean contiene = false;
        System.out.println("Digite una letra");
        String caracter = leer.nextLine();
        contiene = cadena.getFrase().contains(caracter);
        System.out.println(contiene);
    }
    
}