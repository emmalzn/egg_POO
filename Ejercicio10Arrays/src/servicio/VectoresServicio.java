/*
 * 
 * 
 */
package servicio;

import entidad.Vectores;
import java.util.Arrays;
import java.util.Random;

public class VectoresServicio {

    Random random = new Random();

    public void rellenarVector(Vectores vec) {

        for (int i = 0; i < vec.getArregloA().length; i++) {
            vec.getArregloA()[i] = random.nextInt(75) + 1;

        }

    }

    public void mostrarVector(Vectores vec) {

        for (int i = 0; i < vec.getArregloA().length; i++) {
            System.out.print(vec.getArregloA()[i] + ", ");
        }
        System.out.println("");
    }

    public void ordenarArreglo(Vectores vec) {

        Arrays.sort(vec.getArregloA());

        for (int i = 0; i < vec.getArregloA().length; i++) {
            System.out.print(vec.getArregloA()[i] + ", ");
        }
        System.out.println("");

    }

    public void copiarArreglo(Vectores vec) {
        int[] arregloCopia = Arrays.copyOf(vec.getArregloA(), vec.getArregloB().length);
        vec.setArregloB(arregloCopia);

        Arrays.fill(vec.getArregloB(), 10, 20, 5);

        for (int i = 0; i < vec.getArregloB().length; i++) {
            System.out.print(vec.getArregloB()[i] + ", ");
        }
        System.out.println("");
    }

}

