package basics.arrays;

import java.util.Scanner;

/**
 * Leer 10 numeros enteros.
 * Mostrarlos en orden:
 * primero-ultimo
 * segundo-penultimo
 * tercero-antepenultimo
 */

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        final int arraySize = 10;
        int[] numbers = new int[arraySize];

        // Read numbers from user
        System.out.printf("--- DEBES INTRODUCIR %d NUMEROS ---%n", arraySize);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el numero en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Calculate amount of pairs: (numbers[0] - numbers[9]) is one pair.
        final int pairsCount = arraySize / 2;

        // Show results
        System.out.printf("%n--- RESULTADO ---%n");
        for (int i = 0; i < pairsCount; i++) {
            System.out.printf("%d-%d%n", numbers[i], numbers[arraySize - 1 - i]);
        }
    }
}
