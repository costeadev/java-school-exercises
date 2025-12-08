package coches;

public class Main {
    public static void main(String[] args) {
        Coche[] coches = new Coche[3];

        // Crear array y leer datos de coches
        for (int i = 0; i < coches.length; i++) {
            coches[i] = new Coche();
            coches[i].leerDatos();
        }

        // Mostrar datos y arrancar
        for (Coche c : coches) {
            c.mostrarDatos();
            c.arrancar();
        }
    }
}
