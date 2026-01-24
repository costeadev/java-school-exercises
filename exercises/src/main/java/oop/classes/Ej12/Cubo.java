package oop.classes.Ej12;

public class Cubo {
    private final double lado;

    // Constructor
    Cubo(double lado) {
        this.lado = lado;
    }

    // Getters
    public double getLado() {
        return this.lado;
    }

    // Methods
    public double superficie() {
        return 6 * Math.pow(lado, 2);
    }

    public double volumen() {
        return Math.pow(lado, 3);
    }
}
