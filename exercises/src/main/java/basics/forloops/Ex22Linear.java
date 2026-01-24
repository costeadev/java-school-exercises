package basics.forloops;

import java.util.Scanner;

/*
 * Un number perfecto es un entero positivo
 * igual a la suma de sus divisores (exceptuando como divisor al propio number).
 * Escriba un programa que acepte un entero positivo y determine si es un number perfecto.
 */

public class Ex22Linear {
    public static void main(String[] args) {

        // Entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int num;

        // Pedir number hasta que sea positivo
        do {
            System.out.print("Introduce un number entero positivo: ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.err.println("number no válido. Debe ser un entero positivo");
            }
        } while (num <= 0);

        scanner.close();

        // Calcular la suma de todos los divisores de 'num'
        int sumaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sumaDivisores += i;
        }

        // Comprobar si el number es perfecto.
        boolean esPerfecto = sumaDivisores == num;

        // Imprimir con formato bonito
        System.out.printf("El number %d %s perfecto", num, esPerfecto ? "es" : "NO es");
    }
}
