package oop.miniapps.plataformastreaming;

public class Serie extends Contenido implements Reproducible {

    private int capitulos;
    private int temporadas;

    public Serie(String titulo, int duracionMin, String genero, int capitulos, int temporadas) {
        super(titulo, duracionMin, genero);
        this.capitulos = capitulos;
        this.temporadas = temporadas;
    }

    @Override
    public String extraInfo() {
        return String.format("(%d temporadas) %s capitulos en total", temporadas, capitulos);
    }

    @Override
    public void reproducir() {
        System.out.printf("Netflix presents: %s", getTitulo());
    }
}
