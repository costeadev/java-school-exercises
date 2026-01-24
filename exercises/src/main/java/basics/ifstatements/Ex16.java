package basics.ifstatements;

import java.util.Scanner;

/*
 *  Recibir un number entre 1 y 99 e indicar si su decena es un number par o impar.
 *  (pero con un algoritmo diverso del que has usado en el ejercicio 4)
 */

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI LA DECENA DE UN number ES PAR O IMPAR ---");

        System.out.print("Introduce un number (1-99): ");
        int num = scanner.nextInt();

        boolean validInput = (num > 0 && num < 100);
        if (!validInput) {
            System.err.println("El number introducido no es válido.");
            return;
        }

        int units = num % 10;
        int tens = (num - units) / 10;

        if (num - units == 0) {
            System.out.println("El number no tiene decenas");
        } else {
            String parity = (tens % 2 == 0) ? "par" : "impar";
            System.out.printf("La decena (%d) de %d es %s", tens, num, parity);
        }

        scanner.close();
    }
}
