package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Ex25NoPlaceholders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Cuantas palabras quieres leer?: ");
        int size = scan.nextInt();
        scan.nextLine(); // Clear buffer

        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Introduce la palabra en posicion %d: ", i + 1);
            words[i] = scan.nextLine();
        }

        scan.close();

        // Count unique words
        int uniqueCount = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) uniqueCount++;
        }

        // Create and fill unique array
        String[] uniqueWords = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) uniqueWords[index++] = words[i];
        }

        // Output
        System.out.println("Todas las palabras: " + Arrays.toString(words));
        System.out.println("Palabras unicas: " + Arrays.toString(uniqueWords));
    }
}
