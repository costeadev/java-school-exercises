package basics.forloops;

import java.util.Scanner;

public class Ex11FunctionsVersion {

    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un number para calcular su factorial: ");
        int n = scanner.nextInt();

        scanner.close();

        int factorial = factorial(n);
        System.out.printf("!%d = %d", n, factorial);
    }
}   