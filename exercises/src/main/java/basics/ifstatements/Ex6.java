package basics.ifstatements;

/*
 * Realizar un programa que lea dos números y los muestre ordenados de menor a mayor.
 */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ORDENAR 2 numberS DE MENOR A MAYOR ---");

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("number 2: ");
        int num2 = scanner.nextInt();

        int smallest = (num1 < num2) ? num1 : num2;
        int biggest = (num1 > num2) ? num1 : num2;

        System.out.printf("%d %d", smallest, biggest);

        scanner.close();
    }
}
