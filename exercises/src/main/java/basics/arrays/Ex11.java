package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer por teclado una serie de 6 números.
 * Una vez insertados todos, leer un nuevo number.
 * Indicar cuántos elementos del array son mayores al value dado.
 */

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el number en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("%nIntroduce otro number: ");
        int reference = scanner.nextInt();
        scanner.close();

        int greaterCount = 0;
        for (int n : numbers) {
            if (n > reference) greaterCount++;
        }

        System.out.printf("%nArray original: %s%n", Arrays.toString(numbers));
        System.out.printf("Hay %d numbers mayores que %d", greaterCount, reference);
    }
}
