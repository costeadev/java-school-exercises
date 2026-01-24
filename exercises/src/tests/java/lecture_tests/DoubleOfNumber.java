package lecture_tests;

import java.util.Scanner;

// Program that calculates and displays on the console,
// double an integer, entered by the user using the keyboard

public class DoubleOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un number: ");
        int num = scanner.nextInt();

        int numDouble = num * 2;

        System.out.println("El doble de " + num + " es: " + numDouble);
        System.out.printf("%d's double is %d", num, numDouble);

        scanner.close();
    }
}