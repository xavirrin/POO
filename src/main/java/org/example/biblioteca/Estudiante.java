package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        this.librosPrestados = new ArrayList<>();
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anyadirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public boolean borrarLibro(Libro libro) {
        return librosPrestados.remove(libro);
    }


    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email) {
        return email != null && email.matches(FORMATO_CORREO);
    }

    @Override
    public String toString() {
        return "Alumno: [nombre=" + nombre + ", curso=" + curso + ", nia=" + nia +
                ", email=" + email + ", librosPrestados=" + librosPrestados + "]";
    }

}