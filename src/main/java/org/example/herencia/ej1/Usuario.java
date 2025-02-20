package org.example.herencia.ej1;

public class Usuario {

    public String nombre;
    public int edad;
    public String nombre_usuario;
    public int seguidores;

    public Usuario(String nombre, int edad, String nombre_usuario, int seguidores){
        this.nombre = nombre;
        this.edad = edad;
        this.nombre_usuario = nombre_usuario;
        this.seguidores = seguidores;
    }

    protected void mostrarInfo() {
        System.out.println("Información del Usuario: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombre_usuario);
        System.out.println("Seguidores: " + seguidores);
    }
}
