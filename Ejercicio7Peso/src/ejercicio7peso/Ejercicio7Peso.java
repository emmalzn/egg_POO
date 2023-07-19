/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
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
package ejercicio7peso;

import entidad.Persona;
import servicio.PersonaServicio;

public class Ejercicio7Peso {

    public static void main(String[] args) {

        PersonaServicio opc = new PersonaServicio();

        Persona persona1 = new Persona("Juan", 25, "H", 75.5, 1.75);
        Persona persona2 = new Persona("María", 32, "M", 63.2, 1.60);
        Persona persona3 = new Persona("Carlos", 19, "H", 82.1, 1.80);
        Persona persona4 = opc.crearPersona();

        int imcPersona1 = opc.calcularIMC(persona1);
        boolean mayorEdadPersona1 = opc.esMayorDeEdad(persona1);

        int imcPersona2 = opc.calcularIMC(persona2);
        boolean mayorEdadPersona2 = opc.esMayorDeEdad(persona1);

        int imcPersona3 = opc.calcularIMC(persona3);
        boolean mayorEdadPersona3 = opc.esMayorDeEdad(persona1);

        int imcPersona4 = opc.calcularIMC(persona4);
        boolean mayorEdadPersona4 = opc.esMayorDeEdad(persona1);

        int totalPersonas = 4;
        int porDebajoPesoIdeal = 0;
        int enPesoIdeal = 0;
        int porEncimaPesoIdeal = 0;

        if (imcPersona1 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona1 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        if (imcPersona2 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona2 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        if (imcPersona3 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona3 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        if (imcPersona4 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona4 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }
        double porcentajeDebajoPesoIdeal = (porDebajoPesoIdeal / (double) totalPersonas) * 100;
        double porcentajeEnPesoIdeal = (enPesoIdeal / (double) totalPersonas) * 100;
        double porcentajeEncimaPesoIdeal = (porEncimaPesoIdeal / (double) totalPersonas) * 100;
        
        int mayoresEdad = 0;
        int menoresEdad = 0;

        if (mayorEdadPersona1) {
            mayoresEdad++;
        } else {
            menoresEdad++;
        }

        if (mayorEdadPersona2) {
            mayoresEdad++;
        } else {
            menoresEdad++;
        }

        if (mayorEdadPersona3) {
            mayoresEdad++;
        } else {
            menoresEdad++;
        }

        if (mayorEdadPersona4) {
            mayoresEdad++;
        } else {
            menoresEdad++;
        }

        double porcentajeMayoresEdad = (mayoresEdad / (double) totalPersonas) * 100;
        double porcentajeMenoresEdad = (menoresEdad / (double) totalPersonas) * 100;
        
        
        System.out.println("Resultados:");
        System.out.println("Persona 1 - IMC: " + imcPersona1 + ", Mayor de edad: " + mayorEdadPersona1);
        System.out.println("Persona 2 - IMC: " + imcPersona2 + ", Mayor de edad: " + mayorEdadPersona2);
        System.out.println("Persona 3 - IMC: " + imcPersona3 + ", Mayor de edad: " + mayorEdadPersona3);
        System.out.println("Persona 4 - IMC: " + imcPersona4 + ", Mayor de edad: " + mayorEdadPersona4);

        System.out.println("\nPorcentajes:");
        System.out.println("Por debajo del peso ideal: " + porcentajeDebajoPesoIdeal + "%");
        System.out.println("En peso ideal: " + porcentajeEnPesoIdeal + "%");
        System.out.println("Por encima del peso ideal: " + porcentajeEncimaPesoIdeal + "%");

        System.out.println("Mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Menores de edad: " + porcentajeMenoresEdad + "%");

    }

}
