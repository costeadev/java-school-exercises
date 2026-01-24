package basics.forloops;

import java.util.Scanner;

/*
 * Programa que lea un number N mayor que 0
 * y calcule la siguiente suma: 1+2+3+...+N.
 */

public class Ex6 {
    public static void main(String[] args) {

        // Entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir 'n' hasta que sea positivo
        int n;
        do {
            System.out.print("Introduce un number: ");
            n = scanner.nextInt();
        } while (n < 0);

        scanner.close();


        int sumaTotal = 0; // Acumulador para la suma total
        // Sumar los numbers desde 1 hasta N
        for (int i = 1; i <= n; i++) {
            sumaTotal += i;
        }
        System.out.println(sumaTotal);
    }
}
