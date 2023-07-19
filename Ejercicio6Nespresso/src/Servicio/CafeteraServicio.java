/*
 * 
 * 
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner entrada = new Scanner(System.in);
    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[4;36m";

    public Cafetera crearCafetera() {

        Cafetera usar = new Cafetera();
        int opc;

        do {
            System.out.println(BLUE + "╔════════════╗");
            System.out.println(BLUE + "║      Menú         ║");
            System.out.println(BLUE + "╠════════════╣");
            System.out.println(BLUE + "║1.Llenar Cafetera  ║");
            System.out.println(BLUE + "║2.Servir Taza      ║");
            System.out.println(BLUE + "║3.Vaciar Cafetera  ║");
            System.out.println(BLUE + "║4.Agregar Café     ║");
            System.out.println(BLUE + "║5.Salir            ║");
            System.out.println(BLUE + "╚════════════╝" + RESET);
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    usar = llenarCafetera(usar);
                    break;
                case 2:
                    usar = servirTaza(usar);
                    break;
                case 3:
                    usar = vaciarCafetera(usar);
                    break;
                case 4:
                    usar = agregarCafe(usar);
                    break;
                case 5:
                    System.out.println("Gracias, vuelve pronto!");
                    break;
                default:
                    System.out.println("Ingresa una opción correcta");

            }

        } while (opc != 5);

        return usar;
    }

    public Cafetera llenarCafetera(Cafetera usar) {

        usar.setCapacidadMaxima(85);
        System.out.println("La cafetera esta llena con su capacidad maxima de: " + usar.getCapacidadMaxima() + "ml");
        return usar;
    }

    public Cafetera servirTaza(Cafetera usar) {

        System.out.println("¿Cuantas tazas deseas?");
        int cantidad = entrada.nextInt();
        int taza = 30 * cantidad;

        if (usar.getCapacidadMaxima() > taza) {
            usar.setCantidadActual(usar.getCapacidadMaxima() - taza);
            System.out.println("La cafetera tiene: " + usar.getCantidadActual() + "ml");
        } else {
            usar.setCantidadActual(usar.getCapacidadMaxima());
            System.out.println("No hay café suficiente en la cafetera asi que solo se lleno con:  " + usar.getCantidadActual() + "ml");
        }

        return usar;
    }

    public Cafetera vaciarCafetera(Cafetera usar) {

        usar.setCantidadActual(0);
        System.out.println("La cafetera tiene: " + usar.getCantidadActual() + "ml");
        return usar;
    }

    public Cafetera agregarCafe(Cafetera usar) {

        System.out.println("¿Cuantos ml deseas agregar?");
        int ml = entrada.nextInt();

        usar.setCantidadActual(ml);
        System.out.println("La cafetera tiene: " + usar.getCantidadActual() + "ml");
        return usar;
    }

}
