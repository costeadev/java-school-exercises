package oop.classes.Ex12;

public class Esfera {
    private final double radio;

    // Constructor
    Esfera(double radio) {
        this.radio = radio;
    }

    // Getters
    public double getRadio() {
        return this.radio;
    }

    // Methods
    public double superficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double volumen() {
        return ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);
    }
}
