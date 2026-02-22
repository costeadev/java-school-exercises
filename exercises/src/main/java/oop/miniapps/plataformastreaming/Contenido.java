package oop.miniapps.plataformastreaming;

public abstract class Contenido {

    protected String titulo;
    protected int duracionMin;
    protected String genero;

    public Contenido(String titulo, int duracionMin, String genero) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public String getGenero() {
        return genero;
    }

    protected abstract String extraInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Contenido contenido)) {
            return false;
        }

        return this.titulo.equals(contenido.getTitulo());
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s (%d min) - %s %s", titulo, duracionMin, genero, extraInfo());
    }
}
