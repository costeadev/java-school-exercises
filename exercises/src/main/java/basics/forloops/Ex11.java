package basics.forloops;

import java.util.Scanner;

// Pedir un number y calcular su factorial.

public class Ex11 {

    public static void main(String[] args) {

        // Entrada de usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un number para calcular su factorial: ");
        int n = scanner.nextInt();

        scanner.close();


        // Calcular el factorial de 'n'
        long totalFactorial = 1;
        for (int i = 2; i <= n; i++) totalFactorial *= i;

        System.out.printf("!%d = %d", n, totalFactorial);
    }
}   