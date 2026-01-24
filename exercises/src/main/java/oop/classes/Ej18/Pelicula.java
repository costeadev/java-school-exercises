package oop.classes.Ej18;

public class Pelicula {
    private final String titulo;
    private final String director;
    private final int calificacion;

    public Pelicula(String titulo, String director, int calificacion) {
        this.titulo = titulo;
        this.director = director;
        if (calificacion < 1 || calificacion > 10) {
            throw new IllegalArgumentException("La calificacion debe estar entre 1 y 10");
        } else {
            this.calificacion = calificacion;
        }
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %d/10", titulo, director, calificacion);
    }
}
