package org.example.plataforma_streaming;

abstract class Suscripcion {

    public String nombrePlan;
    public double precio;

    public Suscripcion(String nombrePlan, double precio) {
        this.nombrePlan=nombrePlan;
        this.precio=precio;
    }

    public void mostrarInfo(){
        System.out.println("Plan: " + nombrePlan + ", Precio: " + precio + "€.");
    }

    public abstract void obtenerBeneficios();

}
