package org.example.casa;

public class Habitacion {

    private String nombre;
    private double metrosCuadrados;


    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return " Habitacion : [ nombre=" + getNombre() + " metros cuadrados" + getMetrosCuadrados() + "]";
    }
}

