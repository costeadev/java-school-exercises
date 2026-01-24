package exams;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Fill array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Array number %d : ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        int largestPairCount = 0;
        int mostRepeatedNumber = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int pairCount = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) pairCount++;
            }
            if (pairCount > largestPairCount) {
                largestPairCount = pairCount + 1;
                mostRepeatedNumber = numbers[i];
            }
        }

        // Check if the most repeated element is majority
        boolean isMajority = largestPairCount > size / 2;

        // Print everything
        System.out.printf("\nMost repeated value: %d", mostRepeatedNumber);
        System.out.printf("\nTimes repeated: %d", largestPairCount);
        System.out.printf("\nIs it majority?: %s", isMajority ? "yes" : "no");

        scanner.close();
    }
}
