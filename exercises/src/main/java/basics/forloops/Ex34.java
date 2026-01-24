package basics.forloops;

import java.util.Scanner;

/*
 * Dada una palabra, escríbela al revés.
 */

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir palabra al usuario y eliminar espacios sobrantes
        System.out.print("Introduce una palabra: ");
        String word = scanner.nextLine().trim();

        scanner.close();

        // Recorrer cada letra de la palabra
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
