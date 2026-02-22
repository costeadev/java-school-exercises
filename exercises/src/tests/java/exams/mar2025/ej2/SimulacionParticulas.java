package exams.mar2025.ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

 public class SimulacionParticulas {
    
    Scanner scanner;

    public SimulacionParticulas() {
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {

        List<Particula> particulas = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            switch (opcion) {
                case 1:
                    agregarParticula(particulas);
                    break;
                case 2:
                    buscarPorRangoMasa(particulas);
                    break;
                case 3:
                    eliminarPorPosicion(particulas);
                    break;
                case 4:
                    particulaMaxMasa(particulas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- Simulador de Partículas ---");
        System.out.println("1. Agregar partícula");
        System.out.println("2. Buscar por rango de masa");
        System.out.println("3. Eliminar por posición");
        System.out.println("4. Buscar partícula con más masa");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private void agregarParticula(List<Particula> particulas) {
        System.out.println("Carga: (int)");
        int carga = scanner.nextInt();
        System.out.println("Masa: (double)");
        double masa = scanner.nextDouble();
        System.out.println("Posición x: (double)");
        double x = scanner.nextDouble();
        System.out.println("Posición y: (double)");
        double y = scanner.nextDouble();
       
        //TODO: crear la particula y añadirla a la colección de particulas
        Particula particula = new Particula(carga, masa, new Punto(x, y));
        particulas.add(particula);
        
        System.out.println("Partícula agregada.");
    }


    private List<Particula> buscarPorRangoMasa(List<Particula> particulas) {
    	List<Particula> lista = new ArrayList<>();
        System.out.print("Rango de masa (min): (double) ");
        double minMasa = scanner.nextDouble();
        System.out.print("Rango de masa (max): (double) ");
        double maxMasa = scanner.nextDouble();

        /*  TODO: buscar todas las particulas que entren el rango de masa proporcionado,
             guardalas en una List y devolverla
        */

        for (Particula p : particulas) {
            if (p.masa >= minMasa && p.masa <= maxMasa) {
                lista.add(p);
            }
        }

        if (lista.isEmpty()) {
            return null;
        }

        return lista;
    }

    private void eliminarPorPosicion(List<Particula> particulas) {
        if (particulas.isEmpty()) {
            throw new RuntimeException("La lista esta vacia");
        }

        System.out.print("Posición para eliminar (x): (double)");
        double x = scanner.nextDouble();

        System.out.print("Posición para eliminar (x): (double)");
        double y = scanner.nextDouble();

        Punto posicion = new Punto(x, y);

        /*
         TODO: usando el método proporcionado para calcular distancias entre dos puntos,
          encontrar la particula más cercana al punto proporcionado y quitarla de la colección de particulas
        */

        double distanciaMinima = Double.MAX_VALUE;
        Particula particulaMasCercana = null;

        for (Particula particula : particulas) {
            double distanciaActual = calcularDistancia(particula.posicion, posicion);
            if (distanciaActual < distanciaMinima) {
                distanciaMinima = distanciaActual;
                particulaMasCercana = particula;
            }
        }
        particulas.remove(particulaMasCercana);
        System.out.printf("Particula [%s] eliminada!", particulaMasCercana);
    }

    private double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }


    private void particulaMaxMasa(List<Particula> particulas) {
    	//TODO: mostrar la particula con max Masa
        double masaMax = Double.MIN_VALUE;
        Particula particulaMax = null;
    	for (Particula p : particulas) {
            if (p.masa > masaMax) {
                masaMax = p.masa;
                particulaMax = p;
            }
        }
        System.out.printf("La particula con mas masa es: [%s]", particulaMax);
    }

    public static void main(String[] args) {
        SimulacionParticulas simulacion = new SimulacionParticulas();
        simulacion.ejecutar();
    }
}
