package org.example.ecommerce;

public class PayPal extends MetodoPago {

    private String cuenta;
    private double saldo;

    public PayPal(String cuenta, double saldo) {
        if (validarPayPal(cuenta, saldo, 0)) {
            this.cuenta = cuenta;
            this.saldo = saldo;
        } else {
            System.out.println("Formato de correo inválido. Se asignará un saldo de 23€.");
            this.cuenta = "default@email.com";
            this.saldo = 23;
        }
    }

    public void procesarPago(double importe) {
        if (validarPayPal(cuenta, saldo, importe)) {
            saldo -= importe;
            System.out.println("Procesando pago de " + importe + "€ con PayPal.");
        } else {
            System.out.println("Saldo insuficiente para realizar el pago.");
        }
    }

    private boolean validarPayPal(String cuenta, double saldo, double importe) {
        return cuenta != null && cuenta.matches("^[\\w.-]+@[\\w.-]+\\.com$") && saldo >= importe;
    }
}