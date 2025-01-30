package org.example;

import java.util.ArrayList;
import java.util.List;

public class Editorial {

    private String nombre;
    private String pais;
    private List<Libro> librosPublicados;

    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.librosPublicados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void anyadirLibro(Libro libro) {
        if (!librosPublicados.contains(libro)) {
            librosPublicados.add(libro);
            System.out.println("Libro '" + libro.getTitulo() + "' añadido a la editorial " + nombre);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está registrado en la editorial.");
        }
    }

    public void borrarLibro(Libro libro) {
        if (librosPublicados.contains(libro)) {
            librosPublicados.remove(libro);
            System.out.println("Libro '" + libro.getTitulo() + "' eliminado de la editorial " + nombre);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está en la editorial.");
        }
    }

    @Override
    public String toString() {
        String libros = librosPublicados.isEmpty() ? "No tiene libros publicados" :
                librosPublicados.stream().map(Libro::getTitulo).toList().toString();

        return "Editorial : [ nombre=" + getNombre() + ", país=" + getPais() + ", libros=" + libros + " ]";
    }
}