package basics.arrays;

import java.util.Scanner;


/**
 * Leer por teclado una serie de 5 palabras y guardarlas en un array.
 * Leer un nuevo número e indicar cuántas y qué palabras son más largas del valor indicado.
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Introduce la palabra en posicion %d: ", i + 1);
            words[i] = scanner.next();
        }

        System.out.printf("%nIntroduce un numero: ");
        int reference = scanner.nextInt();
        scanner.close();


        int longerWordCount = 0;
        System.out.printf("%n Palabras con mas de %d letras: ", reference);
        for (String word : words) {
            if (word.length() > reference) {
                System.out.print(word + " ");
                longerWordCount++;
            }
        }

        System.out.printf("%nTotal: %d palabras", longerWordCount);
    }
}
