package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Como el anterior, pero desplazar N posiciones (N es introducido por el usuario).
 */
public class Ex16OneArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el number en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Introduce un number de saltos: ");
        int jumps = scanner.nextInt();

        scanner.close();

        System.out.printf("%nOriginal array: %s%n", Arrays.toString(numbers));

        for (int j = 0; j < jumps; j++) {
            int last = numbers[numbers.length - 1];
            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = last;
        }

        System.out.printf("%nModified array: %s", Arrays.toString(numbers));
    }
}

