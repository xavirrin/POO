package org.example.plataforma_streaming;

public class PlataformaStreaming {

    public static void main(String[] args) {

        Suscripcion[] suscripcions = {
                new PlanGratis("Gratis", 0.0),
                new PlanBasico("Básico", 9.99),
                new PlanPremium("Premium", 14.99),
                new PlanFamiliar("Familiar", 19.99)
        };

        for (Suscripcion suscripcion : suscripcions){
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
        }

    }


}
