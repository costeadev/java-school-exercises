package classes.Ej18;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<Pelicula> peliculas;

    public Biblioteca() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        if (pelicula == null) {
            throw new IllegalArgumentException("Pelicula no puede ser null");
        }
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula) {
        if (!peliculas.remove(pelicula)) {
            throw new IllegalArgumentException("La pelicula no existe en la biblioteca");
        }
    }

    public int obtenerConteoDePeliculas() {
        return peliculas.size();
    }

    public double obtenerCalificacionPromedio() {
        if (peliculas.isEmpty()) {
            throw new IllegalStateException("No hay peliculas en la biblioteca");
        }
        double sum = 0;
        for (Pelicula p : peliculas) {
            sum += p.getCalificacion();
        }
        return sum / peliculas.size();
    }

    @Override
    public String toString() {
        if (peliculas.isEmpty()) {
            return "No hay peliculas en la biblioteca";
        }

        StringBuilder sb = new StringBuilder();
        for (Pelicula p : peliculas) {
            sb.append(p).append('\n');
        }
        return sb.toString();
    }
}
