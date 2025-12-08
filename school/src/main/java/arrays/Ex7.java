package arrays;

import java.util.Scanner;

/**
 * Leer 5 palabras y guardarlas en un array
 * Indicar si alguna de ellas es un numero entero, tanto positivo como negativo
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];

        // Read words from the user
        System.out.printf("%n--- DEBES INTRODUCIR %d PALABRAS ---%n", words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Introduce la palabra en posicion %d: ", i + 1);
            words[i] = scanner.next();
        }
        scanner.close();

        int positiveCount = 0;
        int negativeCount = 0;


        for (String word : words) {

            if (word.isEmpty()) continue;

            boolean isNegative = word.startsWith("-");
            if (word.equals("-")) continue;

            boolean isNumber = true;
            int start = isNegative ? 1 : 0;

            // Check if all remaining chars are digits
            for (int i = start; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c < '0' || c > '9') {
                    isNumber = false;
                    break;
                }
            }

            if (isNumber) {
                int value = Integer.parseInt(word);
                if (value > 0) positiveCount++;
                else if (value < 0) negativeCount++;
            }
        }

        // Show results
        int notNumberCount = words.length - positiveCount - negativeCount;
        System.out.printf("%nPositivos: %d", positiveCount);
        System.out.printf("%nNegativos: %d", negativeCount);
        System.out.printf("%nNo-numeros: %d", notNumberCount);
    }
}
