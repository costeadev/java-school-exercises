package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * tres variables de tipo doble (números decimales)
 * y calcule su promedio.
 * Luego, muestra el resultado en la pantalla
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CALCULAR PROMEDIO DE 3 NÚMEROS ---");

        System.out.print("number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("number 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("number 3: ");
        double num3 = scanner.nextDouble();

        double avg = average(num1, num2, num3);

        System.out.printf("\nNúmeros: {%.2f, %.2f, %.2f}\n", num1, num2, num3);
        System.out.printf("Promedio: %.2f", avg);

        scanner.close();
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
