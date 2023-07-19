/*
 * 
 * 
 */
package servicio;

import entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner enter = new Scanner(System.in);

    public Curso cargarAlumnos() {

        Curso curso = new Curso();

        for (int i = 0; i < curso.getAlumnos().length; i++) {

            System.out.println("Ingres el nombre del alumno " + (i + 1));
            curso.getAlumnos()[i] = enter.nextLine();
        }

        return curso;
    }

    public Curso crearCurso(Curso curso) {

        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(enter.nextLine());
        System.out.println("Ingrese el turno mañana/tarde");
        curso.setTurno(enter.nextLine());
        System.out.println("Ingrese la cantidad de horas por día");
        curso.setCantidadHorasPorDia(enter.nextInt());
        System.out.println("Ingrese la cantidad de días por semana");
        curso.setCantidadDiasPorSemana(enter.nextInt());
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioPorHora(enter.nextInt());

        return curso;
    }

    public void calcularGananciaSemanal(Curso curso) {

        double ganacia = curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora();

        System.out.println("La clase " + curso.getNombreCurso() + " del turno de " + curso.getTurno() + " tiene 5 alumnos");

        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println((i + 1) + ") " + curso.getAlumnos()[i]);
        }

        System.out.println("Por " + curso.getAlumnos().length + " alumnos, " + curso.getCantidadHorasPorDia()
                + " horas por dia " + curso.getCantidadDiasPorSemana() + " tendras una ganacia de " + ganacia);
    }

}
