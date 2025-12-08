package arrays;

import java.util.Scanner;

/**
 * Leer una cantidad de numeros por teclado
 * (La cantidad la debe introducir el usuario)
 * De esos numeros, devolver:
 *   - Media positivos
 *   - Media negativos
 *   - Cantidad de ceros
 */

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres leer?: ");
        int numbersToRead = scanner.nextInt();

        int[] numbers = new int[numbersToRead];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el numero en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        double positiveSum = 0, negativeSum = 0;
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Positivos: %d, Media: %.2f%n", positiveCount,
                positiveCount > 0 ? positiveSum / positiveCount : 0);
        System.out.printf("Negativos: %d, Media: %.2f%n", negativeCount,
                negativeCount > 0 ? negativeSum / negativeCount : 0);
        System.out.printf("Ceros: %d%n", zeroCount);
    }
}
