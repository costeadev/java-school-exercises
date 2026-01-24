package basics.ifstatements;

import java.util.Scanner;

// Pedir un number entre 0 y 99999 y decir cuantas cifras tiene.

public class Ex22V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CONTAR CIFRAS DE UN number ---");

        System.out.print("Introduce un number entre 0 y 99999: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 99999) {
            System.err.print("Error: number fuera de rango.");
            return;
        }

        int digitos = (int) calculateDigits(num);

        System.out.printf("El number %d tiene %d digito%s", num, digitos, digitos > 1 ? "s" : "");

        scanner.close();
    }

    public static double calculateDigits(int num) {
        if (num == 0) return 1;
        return Math.log10(num) + 1;
    }
}
