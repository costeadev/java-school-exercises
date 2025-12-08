package my_tests;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {

        // Leer un string por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un string: ");
        String str = scanner.nextLine();
        scanner.close();

        String strComprimido = "";

        // Bucle sobre todas las letras del String
        for (int i = 0; i < str.length(); i++) {
            // Contar cuantas letras iguales hay
            int letterCount = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) letterCount++;
                if (str.charAt(i) != str.charAt(j)) break; // Exit condition
            }
            // Añadir (letra + veces que aparece) a String comprimido
            strComprimido += "" + str.charAt(i) + letterCount;
            // Hacer que 'i' empiece en la siguiente letra
            i += letterCount - 1;
        }

        // No mostrar el string comprimido si es mas largo
        if (strComprimido.length() > str.length()) {
            System.out.println(str);
        } else {
            System.out.println(strComprimido);
        }
    }
}
