package basics.forloops;

import java.util.Scanner;

/*
 * Programa que dado un number entero,
 * muestre en líneas consecutivas cada una de sus cifras.
 */

public class Ex20MatematikaVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el number: ");
        int num = Math.abs(scanner.nextInt());
        int divisor = 1;

        scanner.close();

        while (num / divisor >= 10) divisor *= 10;

        while (divisor > 0) {
            System.out.println(num / divisor);
            num %= divisor;
            divisor /= 10;
        }
    }
}
