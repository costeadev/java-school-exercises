package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer 5 letras minusculas y guardarlas en un array
 * Luego, convertirlas en mayusculas sobreescribiendo el array.
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        char[] letters = new char[5];

        // Read letters from user
        System.out.printf("%n--- DEBES INTRODUCIR %d LETRAS ---%n", letters.length);
        for (int i = 0; i < letters.length; i++) {
            System.out.printf("Introduce la letra en posicion %d: ", i + 1);
            letters[i] = scanner.next().charAt(0);
        }
        scanner.close();

        // Print original array
        System.out.printf("%nOriginal: %s", Arrays.toString(letters));

        // Convert each letter to Uppercase (Just for ASCII)
        for (int i = 0; i < letters.length; i++) {
            letters[i] -= 32;
        }

        // Print uppercased array
        System.out.printf("%nUppercased: %s", Arrays.toString(letters));
    }
}
