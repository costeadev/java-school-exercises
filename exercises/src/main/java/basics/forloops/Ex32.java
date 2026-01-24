package basics.forloops;

import java.util.Scanner;

/*
 * Pide un number N.
 * Por cada number de 1 a N, indica cuáles son sus divisores.
 */

public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d:", i);

            // First, print divisors up to sqrt(i)
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    System.out.printf(" %d", j);
                }
            }

            // Then, print the paired divisors in descending order
            for (int j = (int) Math.sqrt(i); j >= 1; j--) {
                if (i % j == 0 && i / j != j) {
                    System.out.printf(" %d", i / j);
                }
            }

            System.out.println();
        }
    }
}
