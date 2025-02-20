package org.example.herencia.ej1;

public class Basico extends Usuario {

    public Basico(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información de la Persona Normal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombre_usuario);
        System.out.println("Seguidores: " + seguidores);
    }
}
