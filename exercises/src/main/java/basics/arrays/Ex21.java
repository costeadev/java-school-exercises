package basics.arrays;

import java.util.Scanner;

/**
 * Leer un array de N char e indicar si estan ordenados alfabeticamente
 */

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Cuantas letras quieres leer?: ");
        int size = scanner.nextInt();

        // Ask user to fill char array
        char[] chars = new char[size];

        for (int i = 0; i < chars.length; i++) {
            char c;
            do {
                System.out.printf("Introduce la letra en posicion %d: ", i + 1);
                c = scanner.next().toLowerCase().charAt(0);
            }
            while (c < 'a' || c > 'z');
            chars[i] = c;
        }
        scanner.close();
        
        // Check if they are ordered alphabetically
        boolean sorted = true;
        for (int i = 1; i < chars.length && sorted; i++) {
             if (chars[i] < chars[i - 1]) sorted = false;
        }

        // Print result
        System.out.println(sorted
            ? "La lista estaba ordenada alfabeticamente :)"
            : "La lista NO estaba ordenada alfabeticamente :(");
    }
}
