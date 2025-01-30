package org.example.biblioteca;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    final static String LIB = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        cantidadLibros++;
        librosDisponibles++;
        id = LIB + calcularId(cantidadLibros);
        disponible = true;
        estudiantePrestado = null;
        this.editorial = editorial;
    }

    public String calcularId(int cantidadLibros) {
        return String.format("%03d", cantidadLibros);
    }

    public Prestamo prestar(Estudiante estudiante) {
        if (!disponible) {
            System.out.println("El libro " + getTitulo() + " no se puede prestar (no disponible).");
            return null;
        }

        if (estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene el libro " + getTitulo() + " prestado.");
            return null;
        }

        disponible = false;
        librosDisponibles--;
        estudiantePrestado = estudiante;
        estudiante.anyadirLibro(this);

        Prestamo prestamo = new Prestamo(estudiante, this);
        System.out.println("El libro " + getTitulo() + " ha sido prestado con éxito a " + estudiante.getNombre() + ".");
        System.out.println("Se ha generado el préstamo " + prestamo);
        return prestamo;
    }

    public Prestamo getPrestamo(Prestamo prestamo) {
        return prestamo;
    }

    public void devolver(Estudiante estudiante) {
        if (disponible) {
            System.out.println("El libro " + getTitulo() + " no se puede devolver (ya está disponible).");
            return;
        }

        if (!estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " no tiene prestado el libro " + getTitulo() + ".");
            return;
        }

        disponible = true;
        librosDisponibles++;
        estudiante.borrarLibro(this);
        estudiantePrestado = null;

        System.out.println("El libro " + getTitulo() + " ha sido devuelto con éxito por " + estudiante.getNombre() + ".");
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        if (estudiantePrestado != null) {
            return "Libro : [ titulo=" + getTitulo() + ", autor=" + getAutor() + ", id=" + getId() +
                    ", disponible=" + getDisponible() + ", estudiante=" + estudiantePrestado.getNombre() +
                    ", editorial=" + editorial.getNombre() + " ]";
        } else {
            return "Libro : [ titulo=" + getTitulo() + ", autor=" + getAutor() + ", id=" + getId() +
                    ", disponible=" + getDisponible() + ", editorial=" + editorial.getNombre() + " ]";
        }
    }
}