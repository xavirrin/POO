package org.example.ecommerce;

public class TarjetaCredito extends MetodoPago {

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        if (validarTarjeta(nro_tarjeta, tipo)) {
            this.nro_tarjeta = nro_tarjeta;
            this.tipo = tipo;
        } else {
            System.out.println("Número de tarjeta o tipo inválido.");
        }
    }

    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
    }

    private boolean validarTarjeta(String numero, String tipo) {
        return numero != null && numero.matches("\\d{16}") &&
                tipo != null && (tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO"));
    }
}