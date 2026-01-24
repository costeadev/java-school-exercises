package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado
 * dos variables enteras
 * y muestre en pantalla
 * el value de la variable con el mayor number.
 * (SOLO USANDO OPERADOR TERNARIO)
 */

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR MAYOR DE DOS numberS ---");

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("number 2: ");
        int num2 = scanner.nextInt();

        System.out.printf("El number mayor es: %d", num1 > num2 ? num1 : num2);

        scanner.close();
    }
}
