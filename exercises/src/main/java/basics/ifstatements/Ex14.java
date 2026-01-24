package basics.ifstatements;

import java.util.Scanner;

/*
 * Recibir un number e indicar si es válido. Es válido si es un number positivo menor que 100 o un number negativo menor que -100.
 * Validos: 22, 44, 63, 77, 99,-111,-2323,-2424
 * No válidos: -22,-45-73, 234. 51515.222
 */

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- COMPROBAR SI UN number ES VALIDO ---");

        System.out.print("Introduce un number: ");
        int num = scanner.nextInt();

        boolean isValid = (num > 0 && num < 100) || (num < -100);

        if (isValid) {
            System.out.printf("%d es un number válido", num);
        } else {
            System.err.println("El number introducido no es válido");
            return;
        }

        scanner.close();
    }
}
