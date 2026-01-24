package my_tests;

import java.util.Scanner;

public class MockExam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many words do you wish to add to the array?: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Clean buffer

        String[] words = new String[size];
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Word %d: ", i + 1);
            words[i] = scanner.nextLine().trim();
        }

        // Print results
        String[] filteredWords = removeLongWords(words);
        for (String word : filteredWords) {
            System.out.printf("[%s] ", word);
        }
    }

    public static String[] removeLongWords(String[] words) {
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
