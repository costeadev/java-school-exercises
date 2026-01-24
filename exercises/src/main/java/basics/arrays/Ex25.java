package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Cuantas palabras quieres leer?: ");
        int size = scan.nextInt();
        scan.nextLine(); // Clear buffer

        String[] words = new String[size];
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Introduce la palabra en posicion %d: ", i + 1);
            words[i] = scan.nextLine();
        }

        // Quitar duplicados
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals("0")) continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[j].equals("0")) continue;

                if (words[i].equals(words[j])) {
                    words[j] = "0";
                }
            }
        }

        // Contar palabras unicas
        int uniqueCount = 0;
        for (String word : words) {
            if (!word.equals("0")) uniqueCount++;
        }

        // Crear y rellenar nuevo array
        String[] uniqueWords = new String[uniqueCount];
        int index = 0;
        for (String word : words) {
            if (!word.equals("0")) uniqueWords[index++] = word;
        }

        // Imprimir con formato bonito
        System.out.printf("\nAntes: %s",Arrays.toString(words));
        System.out.printf("\nDespues: %s",Arrays.toString(uniqueWords));

        scan.close();
    }
}
