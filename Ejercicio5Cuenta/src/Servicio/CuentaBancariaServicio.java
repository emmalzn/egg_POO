package Servicio;

import Entidad.CuentaBancaria;
import java.util.Random;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner entrada = new Scanner(System.in);
    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[4;36m";

    public CuentaBancaria cuentaMenu() {
        

        CuentaBancaria info = new CuentaBancaria();
        int opc;

        System.out.println("Ingresa tu DNI");
        info.setDniCliente(entrada.nextLong());

        do {
            System.out.println(BLUE +"╔════════════╗");
            System.out.println(BLUE +"║      Menú         ║");
            System.out.println(BLUE +"╠════════════╣");
            System.out.println(BLUE +"║1.Ingresar         ║");
            System.out.println(BLUE +"║2.Retirar          ║");
            System.out.println(BLUE +"║3.Retiro Rápido    ║");
            System.out.println(BLUE +"║4.Consultar Saldo  ║");
            System.out.println(BLUE +"║5.Consultar Datos  ║");
            System.out.println(BLUE +"║6.Salir            ║");
            System.out.println(BLUE +"╚════════════╝" + RESET);
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    info = ingresar(info);
                    break;
                case 2:
                    info = retirar(info);
                    break;
                case 3:
                    info = retirarRapido(info);
                    break;
                case 4:
                    consultarSaldo(info);
                    break;
                case 5:
                    consultarDatos(info);
                    break;
                case 6:
                    System.out.println("Gracias, vuelve pronto!");
                    break;
                default:
                    System.out.println("Ingresa una opción correcta");

            }

        } while (opc != 6);

        return info;

    }

    public CuentaBancaria ingresar(CuentaBancaria info) {

        System.out.println("Ingresa la cantidad ");
        double ingreso = entrada.nextDouble();

        info.setSaldoActual(info.getSaldoActual() + ingreso);

        return info;
    }

    public CuentaBancaria retirar(CuentaBancaria info) {

        System.out.println("Cantidad a retirar ");
        double retiro = entrada.nextDouble();

        if (info.getSaldoActual() > retiro) {
            info.setSaldoActual(info.getSaldoActual() - retiro);
            System.out.println("Retiro por: $" + retiro);
        } else {
            System.out.println("Saldo insuficiente");
        }

        return info;
    }

    public CuentaBancaria retirarRapido(CuentaBancaria info) {

        if (info.getSaldoActual() > 0) {
            info.setSaldoActual(info.getSaldoActual() - (info.getSaldoActual() * 0.20));
            System.out.println("Retiro por: $" + (info.getSaldoActual() * 0.20));
        } else {
            System.out.println("Saldo insuficiente");
        }

        return info;
    }

    public void consultarSaldo(CuentaBancaria info) {

        System.out.println("Tu saldo actual es: " + info.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria info) {
        Random random = new Random();

        info.setNumeroCuenta((int) (Math.random() * 1000000 + 1));

        System.out.println("DNI asociado a la cuenta: " + info.getDniCliente());
        System.out.println("Tu número de cuenta es: " + info.getNumeroCuenta());
        System.out.println("Intereses asociados a la cuenta: " + info.getIntereses());

    }

}
