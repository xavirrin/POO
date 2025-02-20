package org.example.ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {

    private static final Scanner teclado = new Scanner(System.in);

    public static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }

    public static void iniciarPago() {
        Scanner teclado = new Scanner(System.in);
        MetodoPago metodoPago = null;

        System.out.println("Seleccione el método de pago:");
        System.out.println("\t1. Tarjeta de crédito");
        System.out.println("\t2. PayPal");
        System.out.println("\t3. Bizum");
        System.out.print("\tOpción: ");

        try {
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    metodoPago = crearTarjeta();
                    break;
                case 2:
                    metodoPago = crearPayPal();
                    break;
                case 3:
                    metodoPago = crearBizum();
                    break;
                default:
                    System.out.println("Opción no válida. Pago cancelado.");
                    return;
            }
        }catch (InputMismatchException e){
                System.out.println("Opción no válida. Pago cancelado.");
        }

            System.out.print("Ingrese el importe a pagar: ");
            try {
                double importe = teclado.nextDouble();
                realizarPago(metodoPago, importe);
            }catch (InputMismatchException e){
                System.out.println("Caracteres incorrectos. Pago cancelado.");
            }

    }

    private static TarjetaCredito crearTarjeta() {
        System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
        String numeroTarjeta = teclado.nextLine();

        System.out.print("Ingrese el tipo de tarjeta (VISA/MASTERCARD/MAESTRO): ");
        String tipoTarjeta = teclado.nextLine().toUpperCase();

        if (validarTarjeta(numeroTarjeta, tipoTarjeta)) {
            return new TarjetaCredito(numeroTarjeta, tipoTarjeta);
        } else {
            System.out.println("Datos de tarjeta inválidos. Intente de nuevo.");
            return null;
        }
    }

    private static PayPal crearPayPal() {
        System.out.print("Ingrese su cuenta de PayPal (email): ");
        String cuenta = teclado.nextLine();

        System.out.print("Ingrese su saldo disponible: ");
        double saldo = teclado.nextDouble();

        if (validarPayPal(cuenta, saldo)) {
            return new PayPal(cuenta, saldo);
        } else {
            System.out.println("Datos de PayPal inválidos. Intente de nuevo.");
            return null;
        }
    }

    private static Bizum crearBizum() {
        System.out.print("Ingrese su número de teléfono (9 dígitos): ");
        String telefono = teclado.nextLine();

        if (validarBizum(telefono)) {
            return new Bizum(telefono);
        } else {
            System.out.println("Número de teléfono inválido. Intente de nuevo.");
            return null;
        }
    }

    private static boolean validarTarjeta(String numero, String tipo) {
        return numero != null && numero.matches("\\d{16}") &&
                (tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO"));
    }

    private static boolean validarPayPal(String cuenta, double saldo) {
        return cuenta != null && cuenta.matches("^[\\w.-]+@[\\w.-]+\\.com$") && saldo >= 0;
    }

    private static boolean validarBizum(String telefono) {
        return telefono != null && telefono.matches("\\d{9}");
    }
}