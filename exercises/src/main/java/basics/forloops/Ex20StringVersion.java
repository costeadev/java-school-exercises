package basics.forloops;

import java.util.Scanner;

/*
 * Programa que dado un number entero,
 * muestre en líneas consecutivas cada una de sus cifras.
 */

public class Ex20StringVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el number: ");
        int num = scanner.nextInt();

        scanner.close();

        // Convertir num a String para acceder a los dígitos facilmente
        String numString = "" + num;

        // Imprimir cada dígito en una linea diferente
        for (int i = 0; i < numString.length(); i++) {
            System.out.println(numString.charAt(i));
        }
    }
}
