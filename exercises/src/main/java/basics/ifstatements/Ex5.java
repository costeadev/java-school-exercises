package basics.ifstatements;

/*
 * Realizar un programa que lea un number entero de tres cifras
 * e indique si se lee igual de izquierda a derecha que de derecha a izquierda.
 */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI UN number DE 3 CIFRAS ES CAPICUA ---");

        System.out.print("number de 3 cifras: ");
        int num = scanner.nextInt();

        boolean validInput = (num >= 100 && num <= 999);
        if (!validInput) {
            System.err.println("ERROR: el number debe tener 3 cifras.");
            return;
        }

        int centenas = num / 100;
        int decenas = (num / 10) % 10;
        int unidades = num % 10;

        int reversed = unidades * 100 + decenas * 10 + centenas;

        if (num == reversed) {
            System.out.printf("%d --> %d%n", num, reversed);
            System.out.printf("%d es capicúa.%n", num);
        } else {
            System.out.printf("%d --> %d%n", num, reversed);
            System.out.printf("%d no es capicúa.%n", num);
        }

        scanner.close();
    }
}
