package basics.ifstatements;

import java.util.Scanner;
/*
 * Recibir 4 números e indicar el más pequeño y el más grande
 */

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INDICAR MENOR Y MAYOR DE 4 numberS ---");

        System.out.print("Introduce un number: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce otro number: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce OTRO number: ");
        int num3 = scanner.nextInt();

        System.out.print("Introduce OTRO number más: ");
        int num4 = scanner.nextInt();

        int biggest = num1;
        if (num2 > biggest) biggest = num2;
        if (num3 > biggest) biggest = num3;
        if (num4 > biggest) biggest = num4;

        int smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;

        System.out.printf("Más grande: %d%nMás pequeño: %d%n", biggest, smallest);

        scanner.close();
    }
}
