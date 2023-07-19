/*
 * 
 * 
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    public Operacion crearOperacion() {

        Operacion numeros = new Operacion();

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        numeros.setNum1(in.nextInt());

        System.out.println("Ingresa el segundo número");
        numeros.setNum2(in.nextInt());

        return numeros;

    }

    public void sumar(Operacion numeros) {

        int suma = numeros.getNum1() + numeros.getNum2();

        System.out.println("La suma de los números es: " + suma);

    }

    public void restar(Operacion numeros) {

        int resta = numeros.getNum1() - numeros.getNum2();
        System.out.println("La resta de los números es: " + resta);
    }

    public void multiplicar(Operacion numeros) {
        
        int multiplica;

        if (numeros.getNum1() == 0 || numeros.getNum2() == 0) {
            System.out.println("No se puede Multiplicar por 0");
        } else {
            multiplica = numeros.getNum1() - numeros.getNum2();
            System.out.println("La multiplicacion de los números es: " + multiplica);
 
        }
    }
    

    public void dividir(Operacion numeros) {
       
        int division;

        if (numeros.getNum1() == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            division = numeros.getNum1() - numeros.getNum2();
            System.out.println("La division de los números es: " + division);
 
        }

    }

}
