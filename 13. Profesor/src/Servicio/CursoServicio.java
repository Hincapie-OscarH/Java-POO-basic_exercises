
package Servicio;

import Entidad.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CursoServicio {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private final Curso curso = new Curso();
    
    public void cargarAlumnos() {
        List<String> alumnos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            alumnos.add(leer.nextLine());
            if(i == 0){
                leer.nextLine();
            }
        }
        String[] alumnosArray = new String[alumnos.size()];
        alumnosArray = alumnos.toArray(alumnosArray);
        curso.setAlumnos(alumnosArray);
    }
    
    
    public void crearCurso() {
        System.out.print("Ingresar nombre del curso: ");
        String nombreCurso = leer.nextLine();
        System.out.print("Ingresar la cantidad de horas por día: ");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.print("Ingresar la cantidad de días por semana: ");
        int cantidadDiasPorSemana = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingresar el turno (mañana/tarde): ");
        String turno = leer.nextLine();
        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = leer.nextDouble();

        curso.setNombreCurso(nombreCurso);
        curso.setCantidadHorasPorDia(cantidadHorasPorDia);
        curso.setCantidadDiasPorSemana(cantidadDiasPorSemana);
        curso.setTurno(turno);
        curso.setPrecioPorHora(precioPorHora);

        cargarAlumnos();
    }
    
    public double calcularGananciaSemanal() {
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() *
                curso.getAlumnos().length * curso.getCantidadDiasPorSemana();
    }
}