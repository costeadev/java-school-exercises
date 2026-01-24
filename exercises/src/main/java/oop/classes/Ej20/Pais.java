package oop.classes.Ej20;

public record Pais(String name, int habitantes, double superficie) {

    public double obtenerDensidad() {
        return (double) habitantes / superficie;
    }

    @Override
    public String toString() {
        return String.format("""
                name: %s
                Poblacion: %d habitantes
                Superficie: %.2f km2
                """, name, habitantes, superficie);
    }
}
