package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado
 * una variable de tipo entero
 * y diga si ese number es par o impar
 */

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI UN number ES PAR O IMPAR ---");

        System.out.print("number: ");
        int num = scanner.nextInt();

        System.out.printf("%d = %s", num, esPar(num) ? "par" : "impar");

        scanner.close();
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
}
