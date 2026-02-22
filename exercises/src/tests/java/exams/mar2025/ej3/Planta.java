package exams.mar2025.ej3;


public class Planta implements Comparable<Planta> {

    private String nombreCientifico;
    private int alturaMaxima;

    public Planta(String nombreCientifico, int alturaMaxima) {
        this.nombreCientifico = nombreCientifico;
        this.alturaMaxima = alturaMaxima;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    @Override
    public int compareTo(Planta o) {
        return alturaMaxima - o.getAlturaMaxima();
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Altura maxima: %dm", nombreCientifico, alturaMaxima);
    }
}
