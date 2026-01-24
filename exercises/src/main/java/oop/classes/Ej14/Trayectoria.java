package oop.classes.Ej14;

public class Trayectoria {
    private Punto[] puntos;

    // Constructor
    public Trayectoria(Punto[] puntos) {
        this.puntos = puntos;
    }

    public double distanciaTotal() {
        double total = 0.0;

        for (int i = 0; i < puntos.length - 1; i++) {
            total += puntos[i].distanciaHasta(puntos[i + 1]);
        }

        return total;
    }
}
