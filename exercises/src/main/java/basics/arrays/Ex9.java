package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer los datos correspondiente a dos arrays de 12 elementos numéricos.
 * Mezclarlos en un tercero de la forma:
 * 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = 12;

        // Read first array
        int[] firstArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Introduce el numero %d del array 1: ", i + 1);
            firstArray[i] = scanner.nextInt();
        }

        System.out.println();

        // Read second array
        int[] secondArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Introduce el numero %d del array 2: ", i + 1);
            secondArray[i] = scanner.nextInt();
        }
        scanner.close();

        int[] thirdArray = new int[arraySize * 2];
        int outIndex = 0;

        // Fill up the third array with one trio from each array each time.
        for (int i = 0; i < arraySize; i += 3) {

            // Copy 3 from A
            for (int j = 0; j < 3; j++) {
                thirdArray[outIndex++] = firstArray[i + j];
            }

            // Copy 3 from B
            for (int j = 0; j < 3; j++) {
                thirdArray[outIndex++] = secondArray[i + j];
            }
        }

        // Print results
        System.out.printf("Primer array: %s%n", Arrays.toString(firstArray));
        System.out.printf("Segundo array: %s%n", Arrays.toString(secondArray));
        System.out.printf("Tercer array: %s%n", Arrays.toString(thirdArray));
    }
}
