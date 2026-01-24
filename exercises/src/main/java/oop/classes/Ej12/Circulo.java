package oop.classes.Ej12;

public class Circulo {
    private final double radio;

    // Constructor
    Circulo(double radio) {
        this.radio = radio;
    }

    // Getters
    public double getRadio() {
        return this.radio;
    }

    // Methods
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}
