package my_tests;

import java.util.Scanner;

/**
 * Programa que solicite al usuario un número positivo N.
 * El programa verificará la entrada,
 * es decir, solicitará repetidamente el número
 * hasta que se introduzca número positivo.
 *
 * Si el número es menor que 100,
 * el programa mostrará en consola la media
 * de los números impares entre N y 100.
 *
 * Si el número es mayor que 100,
 * el programa mostrará
 * la media de los números pares entre 100 y N.
 */

public class MockExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer numero hasta que sea positivo
        int n;
        do {
            System.out.print("Introduce un numero positivo: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Valor no valido. Debe ser positivo");
            }
        } while (n < 0);

        scanner.close();

        // Media numeros pares
        if (n < 100) {
            int sumaPares = 0;
            int contadorPares = 0;
            for (int i = n + 1; i < 100; i++) {
                if (i % 2 == 0) {
                    sumaPares += i;
                    contadorPares++;
                }
            }
            System.out.printf("%n%d es menor que 100.", n);
            System.out.printf("%nMedia pares entre %d y 100: %.2f", n, (double) sumaPares/contadorPares);
        }

        // Media numeros pares
        else if (n > 100) {
            int sumaImpares = 0;
            int contadorImpares = 0;
            for (int i = 100 + 1; i < n; i++) {
                if (i % 2 != 0) {
                    sumaImpares += i;
                    contadorImpares++;
                }
            }
            System.out.printf("%n%d es mayor que 100.", n);
            System.out.printf("%nMedia pares entre 100 y %d: %.2f", n, (double) sumaImpares/contadorImpares);
        }

        // n == 100
        else {
            System.out.printf("%n%d es 100. No se menciona este caso asi que no hacemos na' 🫡", n);
        }
    }
}
