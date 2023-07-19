/*
 * 
 * 
 */
package entidad;

import java.time.LocalDate;



public class Persona {
    
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaDeNacimiento, int edad) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    

}
