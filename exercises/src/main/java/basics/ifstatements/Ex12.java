package basics.ifstatements;

import java.util.Scanner;

/*
 * Recibir 4 números e indicar si son todos el mismo number.
 */

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI 4 numberS SON IGUALES ---");

        System.out.print("Introduce un number: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce otro number: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce OTRO number: ");
        int num3 = scanner.nextInt();

        System.out.print("Introduce OTRO number más: ");
        int num4 = scanner.nextInt();

        scanner.close();


        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.printf("%n%d %d %d y %d son todos iguales", num1, num2, num3, num4);
        } else {
            System.out.printf("%n%d %d %d y %d NO son todos iguales", num1, num2, num3, num4);
        }
    }
}
