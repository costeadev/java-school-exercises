package basics.ifstatements;

import java.util.Scanner;

/*
 * Crear un programa que lea 3 numbers
 * y muestre cual es el mayor
 */

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ENCONTRAR EL MAYOR DE 3 numberS ---");

        System.out.print("Introduce un number: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce otro number: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce OTRO number: ");
        int num3 = scanner.nextInt();

        int biggest = num1;
        if (num2 > biggest) biggest = num2;
        if (num3 > biggest) biggest = num3;

        System.out.printf("El mayor es %d", biggest);

        scanner.close();
    }
}
