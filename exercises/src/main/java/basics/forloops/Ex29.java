package basics.forloops;

import java.util.Scanner;

/*
 *
 */

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Introduce un number: ");
            n = scanner.nextInt();
        } while (n < 0);

        scanner.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
