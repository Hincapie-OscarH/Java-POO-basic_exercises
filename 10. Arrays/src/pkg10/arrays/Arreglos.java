/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
*/


package pkg10.arrays;
import java.util.Arrays;

public class Arreglos {

   
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        rellenarArreglo(arregloA);
        ordenarArreglo(arregloA);
        llenarArreglo(arregloA, arregloB);

    }

    public static void rellenarArreglo(double[] arregloA){
        System.out.println("Rellenar arreglo principal");
        for (int i = 0; i < 50; i++) {
            arregloA[i] =  (Math.random());
            System.out.println(arregloA[i]);
        }
    }
    
    public static void ordenarArreglo(double[] arregloA){
        System.out.println("Arreglo ordenado");
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
    }
    
    public static void llenarArreglo(double[] arregloA, double[] arregloB){
        System.out.println("Mostrar segundo arreglo");
        for (int i = 0; i < 20; i++) {
            if(i < 10){
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.5;
            }
            System.out.println(arregloB[i]);
        }

    }
    
}