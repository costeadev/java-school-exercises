package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado
 * dos variables de tipo double
 * y muestre en pantalla el resultado de la resta de ambas,
 * pero asegurándote de que el resultado nunca sea negativo.
 */

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- RESTA QUE NUNCA ES NEGATIVA ---");

        System.out.print("number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("number 2: ");
        double num2 = scanner.nextDouble();

        double resta = valueAbsoluto(num1 - num2);

        System.out.printf("El resultado de la resta es: %.2f", resta);

        scanner.close();
    }

    public static double valueAbsoluto(double num) {
        return Math.sqrt(num * num);
    }
}
