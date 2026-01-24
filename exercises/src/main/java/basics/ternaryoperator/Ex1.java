package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa en Java
 * que lea por teclado dos variables enteras
 * y muestre su suma en pantalla
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SUMAR 2 NÚMEROS ---");

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("number 2: ");
        int num2 = scanner.nextInt();

        int sum = sum(num1, num2);
        System.out.printf("Resultado: (%d + %d = %d)", num1, num2, sum);

        scanner.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
