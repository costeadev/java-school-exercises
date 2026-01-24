package basics.ifstatements;

/*
 * Realizar un programa que lea un number entero de 3 cifras,
 * y forme el mayor number posible con las cifras del number ingresado.
 * El number formado debe tener el mismo signo que el number ingresado.
 */

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ESCRIBIR MAYOR number CON 3 CIFRAS ---");

        System.out.print("Introduce un number de 3 cifras: ");
        int num = scanner.nextInt();

        boolean validInput = (num >= 100 && num <= 999 || num <= -100 && num >= -999);
        if (!validInput) {
            System.err.println("Error: number fuera de rango (100-999)");
            return;
        }

        int sign = (num < 0) ? -1 : 1;
        if (num < 0) num = -num;

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        int firstDigit = hundreds;
        if (tens > firstDigit) firstDigit = tens;
        if (units > firstDigit) firstDigit = units;

        int lastDigit = hundreds;
        if (tens < lastDigit) lastDigit = tens;
        if (units < lastDigit) lastDigit = units;

        int middleDigit = (hundreds + tens + units) - (firstDigit + lastDigit);

        int newNumber = firstDigit * 100 + middleDigit * 10 + lastDigit;
        newNumber *= sign;

        System.out.printf("El mayor number posible con las cifras de %d es %d", num, newNumber);

        scanner.close();
    }
}
