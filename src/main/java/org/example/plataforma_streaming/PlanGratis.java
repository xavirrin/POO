package org.example.plataforma_streaming;

public class PlanGratis extends Suscripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios");

    }
}
