package arrays;

import java.util.Scanner;

/**
 * Leer 5 numeros
 * - Mostrarlos al derecho
 * - Mostrarlos al reves
 */
public class Ex1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Read 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Introduce un numero: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Forward
        System.out.print("Normal: ");
        for (int num : numbers) {
            System.out.printf("%d ", num);
        }

        System.out.println();

        // Backwards
        System.out.print("Reverso: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
