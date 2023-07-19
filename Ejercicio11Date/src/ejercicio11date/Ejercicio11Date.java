/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11date;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio11Date {

    public static void main(String[] args) {

        // realizado con LocalDate
        Scanner teclado = new Scanner(System.in);

        int dia, mes, anio;
        int diferencia = 0;

        System.out.print("Ingrese el día: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        anio = teclado.nextInt();

        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);

        LocalDate fechaActual = LocalDate.now();

        System.out.println("Fecha ingresada: " + fechaIngresada);

        if (fechaIngresada.isBefore(fechaActual)) {
            diferencia = fechaActual.getYear() - fechaIngresada.getYear();
            System.out.println("La diferencia en años es: " + diferencia);
        } else if (fechaIngresada.isAfter(fechaActual)) {
            diferencia = fechaIngresada.getYear() - fechaActual.getYear();
            System.out.println("La diferencia en años es: " + diferencia);
        }else if (fechaIngresada.isEqual(fechaActual)){
            System.out.println("La diferencia en años es igual");
            
        }

    }

}
