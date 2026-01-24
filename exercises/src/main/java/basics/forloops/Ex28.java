package basics.forloops;

import java.util.Scanner;

/*
 * Pide un number (que debe estar entre 0 y 10)
 * Mostrar la tabla de multiplicar de dicho number.
 */

public class Ex28 {
    public static void main(String[] args) {

        // Entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.print("Introduce un number del 0 al 10: ");
            num = scanner.nextInt();
            if (num < 0 || num > 10) {
                System.err.println("value no válido. El number debe estar entre 0 y 10");
            }
        } while (num < 0 || num > 10);

        scanner.close();

        // Imprimir tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
    }
}
