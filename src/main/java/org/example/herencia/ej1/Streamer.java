package org.example.herencia.ej1;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombre_usuario, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombre_usuario, 0);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información del Streamer:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombre_usuario);
        System.out.println("Número de retransmisiones: " + numero_retransmisiones);
        System.out.println("Horas de directo: " + horas_directo);
    }
}
