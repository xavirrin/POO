package org.example.herenciajava;

public class Concierto {
    public static void main(String[] args) {

        Persona artista = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente = new Asistente("Lucas", 18, "VIP");
        Persona organizador = new Organizador("Martín", 30, "Producción");


        mostrarAcceso(artista);
        mostrarAcceso(asistente);
        mostrarAcceso(organizador);
    }

    private static void mostrarAcceso(Persona persona) {
        persona.accederEvento();
    }

}