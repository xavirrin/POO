package org.example.herencia.ej1;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;


    public Influencer(String nombre, int edad, String nombre_usuario, int seguidores, ArrayList<String> colaboraciones) {
        super(nombre, edad, nombre_usuario, seguidores);
        this.colaboraciones = colaboraciones;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información del Influencer:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombre_usuario);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
