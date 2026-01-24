package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crear un programa que lea por teclado una array de 10 números enteros
 * y lo desplace una posición hacia abajo:
 * el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente.
 * El último pasa a ser el primero.
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el number en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.printf("%nOriginal array: %s%n", Arrays.toString(numbers));

        // Save the last number for later use
        int lastNumber = numbers[numbers.length - 1];

        // Shift all elements to the right, leaving 'numbers[0]' as a placeholder
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastNumber;

        System.out.printf("%nModified array: %s", Arrays.toString(numbers));
    }
}

