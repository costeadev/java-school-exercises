package basics.ifstatements;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI UN number ES MULTIPLO DE OTRO ---");

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("number 2: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede dividir por cero lol.");
            return;
        }

        if (num1 % num2 == 0) {
            System.out.printf("\n%d es múltiplo de %d", num1, num2);
        } else if (num2 % num1 == 0) {
            System.out.printf("\n%d es múltiplo de %d", num2, num1);
        } else {
            System.out.println("Ninguno es múltiplo del otro.");
        }

        scanner.close();
    }
}
