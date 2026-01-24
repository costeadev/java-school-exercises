package basics.forloops;

import java.util.Scanner;

/*
 * Pedir 5 calificaciones de students
 * Decir al final si hay algún suspenso.
 */

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        double nota;
        int contadorSuspensos = 0;

        // Bucle principal
        for (int i = 1; i <= 5; i++) {

            // Asegurar que la nota está entre 0 y 10
            do {
                System.out.printf("Introduce la nota del student %d: ", i);
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.err.println("\nNota no válida\n");
                }
            } while (nota < 0 || nota > 10);

            // Añadir al count
            if (nota < 5) contadorSuspensos++;
        }

        scanner.close();

        // Imprimir cuantos suspensos ha habido o si no ha habido.
        if (contadorSuspensos > 0) {
            System.out.printf("Han habido %d suspensos.", contadorSuspensos);
        } else {
            System.out.println("No ha habido ningun suspenso.");
        }
    }
}
