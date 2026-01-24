package basics.forloops;

import java.util.Scanner;

/*
 * Dada una palabra, decir si es un palíndromo (se puede leer igual hacia un sentido o el otro)
 */

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir palabra al usuario y eliminar espacios sobrantes y convertir a minusculas
        System.out.print("Introduce una palabra: ");
        String word = scanner.nextLine().trim().toLowerCase();

        scanner.close();

        String reversedWord = "";

        // Recorrer cada letra de la palabra
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i); // Añadir letras al revés
        }

        // Comprobar e imprimir si es un palíndomo o no
        System.out.printf("%s un palíndromo", word.equals(reversedWord) ? "Es" : "No es");
    }
}
