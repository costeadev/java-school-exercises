package basics.ifstatements;

import java.util.Scanner;

/*
 * Recibe 3 números, op, num1 y num2.
 * si op es 1, escribe num1+num2,
 * si op es 2, escribe num1-num2,
 * en todos los otros casos escribe “Operación no valida”
 */

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SUMAR O RESTAR 2 numberS ---");

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("'1' = suma / '2' = resta: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.printf("\n%d + %d = %d", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.printf("\n%d - %d = %d", num1, num2, num1 - num2);
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        scanner.close();
    }
}
