package org.example.plataforma_streaming;

public class PlanBasico extends Suscripcion{

    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");

    }
}
