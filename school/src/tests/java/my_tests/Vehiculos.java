package my_tests;

public class Vehiculos {
    public static class Coche {
        // Atributos
        String marca;
        String color;
        int caballosPotencia;

        public void mostrarDatos() {
            System.out.printf("Es un %s %s con %d caballos de potencia", marca, color, caballosPotencia);
        }

        public void arrancarMotor() {
            System.out.println("Brummmmm brummmmmm");
        }
    }
}
