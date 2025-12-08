package my_tests;

import java.util.Scanner;

public class MockExam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantas palabras quieres añadir al array?: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // Clean buffer

        String[] words = new String[arraySize];
        for (int i = 0; i < words.length; i++) {
            System.out.print("Introduce una palabra: ");
            words[i] = scanner.nextLine().trim();
        }

        // Print results
        String[] filteredWords = eliminarLargas(words);
        for (String word : filteredWords) {
            System.out.printf("[%s] ", word);
        }
    }

    public static String[] eliminarLargas(String[] words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        int averageLength = totalLength / words.length;

        int shorterCount = 0;
        for (String word : words) {
            if (word.length() < averageLength) shorterCount++;
        }

        String[] filteredWords = new String[shorterCount];
        int index = 0;
        for (String word : words) {
            if (word.length() < averageLength) {
                filteredWords[index++] = word;
            }
        }

        return filteredWords;
    }
}
