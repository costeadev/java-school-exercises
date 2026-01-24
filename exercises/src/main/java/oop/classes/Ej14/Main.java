package oop.classes.Ej14;

public class Main {
    public static void main(String[] args) {

        Punto[] puntos = {
                new Punto(7, -2),
                new Punto(4, 2),
                new Punto(1, -2)
        };

        Trayectoria ruta = new Trayectoria(puntos);
        Vehiculo coche = new Vehiculo(7.5);

        double gastoTotal = coche.calcularGasto(ruta);
        double distanciaTotal = ruta.distanciaTotal();

        System.out.printf(
                "En una ruta de %.2f km se gastan %.2fL de combustible\n",
                distanciaTotal, gastoTotal
        );
    }
}
