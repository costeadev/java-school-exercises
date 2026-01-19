package classes.Ej14;

public class Punto {
    private final double x;
    private final double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Devolver distancia entre 2 puntos
    public double distanciaHasta(Punto otro) {
        double deltaX = this.x - otro.x;
        double deltaY = this.y - otro.y;

        // Calcular y devolver distancia usando Pitagoras
        return Math.hypot(deltaX, deltaY);
    }
}
