/*
 * 
 * 
 */
package Servicio;

import entidad.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonaServicio {

    Scanner enter = new Scanner(System.in);

    public Persona crearPersona() {

        Persona persona = new Persona();

        System.out.println("Ingresa tu nombre");
        persona.setNombre(enter.nextLine());

        System.out.println("Ingresa tu fecha de nacimiento");
        String fechaNacimientoStr = enter.nextLine();
        persona.setFechaDeNacimiento(LocalDate.parse(fechaNacimientoStr));

        return persona;

    }

    public Persona calcularEdad(Persona persona) {
        
        LocalDate fechaActual = LocalDate.now();
        
        persona.setEdad(fechaActual.getYear() - persona.getFechaDeNacimiento().getYear());
        
        return persona;


    }

    public boolean menorQue(Persona persona) {
        
        calcularEdad(persona);

        System.out.println("Ingresa otra edad diferente a la tuya");
        int edad2 = enter.nextInt();
        enter.nextLine();

        return persona.getEdad() > edad2;
    }

    public void mostrarPersona(Persona persona) {
        
        calcularEdad(persona);

        System.out.println("Tu nombre es: " + persona.getNombre() + " y tienes " + persona.getEdad() + " años");

    }

}
