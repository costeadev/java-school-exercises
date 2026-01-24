package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer por teclado una serie de 6 números.
 * Una vez insertados todos, indicar el menor y el mayor.
 */

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el numero %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        scanner.close();


        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n < smallest) smallest = n;
            if (n > biggest) biggest = n;
        }

        System.out.printf("Array: %s%n", Arrays.toString(numbers));
        System.out.printf("Mas pequeño: %d%n", smallest);
        System.out.printf("Mas grande: %d%n", biggest);

    }
}
