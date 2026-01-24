package basics.forloops;

import java.util.Scanner;

/*
 * Crea un programa que cuente y muestre el number de vocales en una cadena.
 */

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir palabra al usuario y eliminar espacios sobrantes y convertir a minusculas
        System.out.print("Introduce una palabra: ");
        String word = scanner.nextLine().trim().toLowerCase();

        scanner.close();


        int vowelCount = 0;
        // Recorrer cada letra de la palabra
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) { // Si el char en posicion 'i' es una vocal, sumar al count
                case 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
            }
        }

        // Imprimir cantidad de vocales
        System.out.printf("Hay %d vocales", vowelCount);

    }
}
