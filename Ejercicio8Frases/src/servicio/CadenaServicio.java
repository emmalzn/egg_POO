/*
 * 
 * 
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner in = new Scanner(System.in);

    public void mostrarVocales(Cadena cadena) {

        System.out.println("La frase o palabra tiene: " + cadena.getLongitud() + " letras");
    }

    public void invertirFrase(Cadena cadena) {

        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {

            System.out.print(cadena.getFrase().substring(i, i + 1));

        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cadena) {

        int vLetra = 0;

        System.out.println("Ingresa una letra");
        String letra = in.nextLine();

        for (int i = 0; i < cadena.getLongitud() - 1; i++) {

            if (letra.equals(cadena.getFrase().substring(i, i + 1))) {
                vLetra++;
            }
        }

        System.out.println("La letra " + letra + " se repite " + vLetra + " veces");

    }

    public void compararLongitud(Cadena cadena) {

        System.out.println("Ingresa una nueva frase o palabra");
        cadena.setFrase2(in.nextLine());

        if (cadena.getFrase2().length() == cadena.getFrase().length()) {

            System.out.println("La primera y la segunda frase tienen el mismo número de caracteres");
        } else {
            System.out.println("La primera y la segunda frase no tienen el mismo número de caracteres");
        }

    }

    public void unirFrases(Cadena cadena) {

        System.out.println(cadena.getFrase().concat(cadena.getFrase2()));

    }

    public void reemplazar(Cadena cadena) {

        System.out.println("Ingresa una letra para remplazar la letra a");
        char letra = in.next().charAt(0);

        System.out.println(cadena.getFrase().replace('a', letra));

    }

    public void contiene(Cadena cadena) {

        int nLetras = 0;

        System.out.println("Ingresa una letra");
        String letra = in.nextLine();

        for (int i = 0; i < cadena.getLongitud() - 1; i++) {

            if (letra.equals(cadena.getFrase().substring(i, i + 1))) {
                nLetras++;
            }
        }

        boolean siLetra = nLetras > 0;

        System.out.println(siLetra);
    }

}
