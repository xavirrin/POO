package org.example.ecommerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago {

    private String telefono;
    private int pin;
    private Random aleatorio = new Random();

    public Bizum(String telefono) {
        if (validarBizum(telefono, -1)) {
            this.telefono = telefono;
            this.pin = aleatorio.nextInt(1000000);
            System.out.println("PIN generado: " + String.format("%06d", pin));
        } else {
            System.out.println("Número de teléfono inválido. Se asignará un número por defecto.");
            this.telefono = "000000000";
            this.pin = aleatorio.nextInt(1000000);
        }
    }

    void procesarPago(double importe) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu PIN de Bizum para confirmar el pago: ");
        int pinIngresado = scanner.nextInt();

        if (validarBizum(this.telefono, pinIngresado)) {
            System.out.println("Procesando pago de " + importe + "€ con Bizum.");
        } else {
            System.out.println("PIN incorrecto o número de teléfono inválido. Pago cancelado.");
        }
    }


    private boolean validarBizum(String telefono, int pinIngresado) {
        boolean telefonoValido = telefono != null && telefono.matches("\\d{9}");
        boolean pinValido = (pinIngresado == -1) || (pinIngresado == this.pin);

        return telefonoValido && pinValido;
    }
}