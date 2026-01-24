package basics.ifstatements;

import java.util.Scanner;

// Pedir un number entre 0 y 99999 y decir cuantas cifras tiene.

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CONTAR CUANTAS CIFRAS TIENE UN number ---");

        System.out.print("Introduce un number entre 0 y 99999: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 99999) {
            System.err.print("Error: number fuera de rango.");
            return;
        }

        int cifras = 1;

        if (num >= 10 && num < 100) {
            cifras = 2;
        } else if (num >= 100 && num < 1000) {
            cifras = 3;
        } else if (num >= 1000 && num < 10000) {
            cifras = 4;
        } else if (num >= 10000 && num < 100000) {
            cifras = 5;
        }

        System.out.printf("El number %d tiene %d dígito%s", num, cifras, cifras > 1 ? "s" : "");

        scanner.close();
    }
}
