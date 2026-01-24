package basics.ifstatements;

import java.util.Scanner;

/*
 * Lo mismo que el ejercicio 6, usando un algoritmo distinto
 */

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR QUE SE HAYA INTRODUCIDO 'g' 'a' 't' 'o' ---");

        System.out.print("Carácter 1: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Carácter 2: ");
        char char2 = scanner.next().charAt(0);

        System.out.print("Carácter 3: ");
        char char3 = scanner.next().charAt(0);

        System.out.print("Carácter 4: ");
        char char4 = scanner.next().charAt(0);

        String word = "" + char1 + char2 + char3 + char4;

        if (word.equals("gato")) {
            System.out.printf("La palabra es '%s', está correcto", word);
        } else {
            System.out.printf("La palabra es '%s', NO está correcto", word);
        }

        scanner.close();
    }
}
