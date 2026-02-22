package oop.miniapps.plataformastreaming;

public class Pelicula extends Contenido implements Reproducible {

    public Pelicula(String titulo, int duracionMin, String genero) {
        super(titulo, duracionMin, genero);
    }

    @Override
    public String extraInfo() {
        return "";
    }

    @Override
    public void reproducir() {
        System.out.printf("Metro Goldwyn Mayer presents: %s", getTitulo());
    }
}
