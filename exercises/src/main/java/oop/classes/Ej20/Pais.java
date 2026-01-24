package oop.classes.Ej20;

public class Pais {
    private final String nombre;
    private final int habitantes;
    private final double superficie;

    public Pais(String nombre, int habitantes, double superficie) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double obtenerDensidad() {
        return (double) habitantes / superficie;
    }

    @Override
    public String toString() {
        return String.format("""
                Nombre: %s
                Poblacion: %d habitantes
                Superficie: %.2f km2
                """, nombre, habitantes, superficie);
    }
}
