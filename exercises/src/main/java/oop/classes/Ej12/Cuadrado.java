package oop.classes.Ej12;

public class Cuadrado {
    private final double lado;

    // Constructor
    Cuadrado(double lado) {
        this.lado = lado;
    }

    // Getters
    public double getLado() {
        return this.lado;
    }

    // Methods
    public double perimetro() {
        return lado * 4;
    }

    public double area() {
        return Math.pow(lado, 2);
    }
}
