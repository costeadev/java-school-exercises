package basics.arrays;

import java.util.Scanner;

/**
 * - Leer 5 palabras
 * - Decir si una de ellas
 * es igual a otra introducida anteriormente
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numbers quieres leer?: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // Clean buffer

        String[] words = new String[arraySize];
        // Read 5 words
        for (int i = 0; i < words.length; i++) {
            System.out.print("Introduce una palabra: ");
            words[i] = scanner.nextLine();
        }
        scanner.close();

        int equalPairsCount = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) equalPairsCount++;
            }
        }

        System.out.printf("\nHay %d coincidencias entre las %d palabras", equalPairsCount, words.length);
    }
}
