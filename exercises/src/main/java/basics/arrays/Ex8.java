package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer por teclado 2 arrays de 5 numeros enteros.
 * Mezclarlos en un 3er array de forma:
 * 1er num del A, 1er num del B, 2ndo num del A, 2ndo num del B.
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("De que tamaño serán los arrays?: ");
        int arraySize = scanner.nextInt();

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

        // Create third array for interleaved elements
        int[] thirdArray = new int[arraySize * 2];
        for (int i = 0; i < arraySize; i++) {
            thirdArray[i * 2] = firstArray[i]; // even index
            thirdArray[i * 2 + 1] = secondArray[i]; // odd index
        }

        // Print arrays
        System.out.println();
        System.out.printf("%nPrimer array: %s", Arrays.toString(firstArray));
        System.out.printf("%nSegundo array: %s", Arrays.toString(secondArray));
        System.out.printf("%nTercer array (mezcla de ambos): %s", Arrays.toString(thirdArray));

    }
}
