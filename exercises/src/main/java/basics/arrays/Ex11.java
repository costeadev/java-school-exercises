package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer por teclado una serie de 6 números.
 * Una vez insertados todos, leer un nuevo número.
 * Indicar cuántos elementos del array son mayores al valor dado.
 */

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el numero en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("%nIntroduce otro numero: ");
        int reference = scanner.nextInt();
        scanner.close();

        int greaterCount = 0;
        for (int n : numbers) {
            if (n > reference) greaterCount++;
        }

        System.out.printf("%nArray original: %s%n", Arrays.toString(numbers));
        System.out.printf("Hay %d numeros mayores que %d", greaterCount, reference);
    }
}
