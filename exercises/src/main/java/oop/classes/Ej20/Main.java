package oop.classes.Ej20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pais[] paises = new Pais[3];
        paises[0] = new Pais("Espanya",  49442844, 506030);
        paises[1] = new Pais("China", 1414500128 ,  9596960);
        paises[2] = new Pais("Francia", 68520000, 632702);

//        Pais[] paises = new Pais[10];
//
//        for (int i = 0; i < paises.length; i++) {
//            System.out.print("Nombre: ");
//            String nombre = scanner.nextLine();
//
//            System.out.print("Habitantes: ");
//            int habitantes = Integer.parseInt(scanner.nextLine());
//
//            System.out.print("Superficie: ");
//            double superficie = Double.parseDouble(scanner.nextLine());;
//
//            paises[i] = new Pais(nombre, habitantes, superficie);
//
//            System.out.println();
//        }

        System.out.println("--- DENSIDADES DE POBLACION ---");
        for (int i = 0; i < paises.length; i++) {
            System.out.printf("Densidad %s: %.2f habitantes/km2\n", paises[i].getNombre(), paises[i].obtenerDensidad());
        }

//        System.out.print("Nombre continente: ");
//        String nombre = scanner.nextLine();
//        Continente continente = new Continente(nombre, paises);
        Continente continente = new Continente("El mundo", paises);

        System.out.printf("\n--- DATOS DE %s ---\n", continente.getNombre().toUpperCase());
        System.out.printf("Superficie de %s: %.2f km2\n", continente.getNombre().toUpperCase(), continente.obtenerSuperficie());
        System.out.printf("Habitantes de %s: %d habitantes\n", continente.getNombre().toUpperCase(), continente.obtenerHabitantes());

        System.out.printf("\n--- PAISES DE %s ---\n", continente.getNombre().toUpperCase());
        for (Pais p : paises) {
            System.out.println(p.toString());
        }

        continente.ordenarPaises();

        System.out.printf("\n--- PAISES DE %s (ORDENADOS POR POBLACION)---\n", continente.getNombre().toUpperCase());
        for (Pais p : paises) {
            System.out.println(p.toString());
        }
        scanner.close();
    }
}
