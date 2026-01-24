package oop.classes.Ej14;

public class Vehiculo {
    private final double gastoPorKm;

    // Constructor
    public Vehiculo(double gastoPorKm) {
        this.gastoPorKm = gastoPorKm;
    }

    // Methods
    public double calcularGasto(Trayectoria trayectoria) {
        return trayectoria.distanciaTotal() * gastoPorKm;
    }
}
