package my_tests;

import java.util.Scanner;

public class MockExam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want in the array?: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Number in position %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Goal: ");
        int goal = scanner.nextInt();
        scanner.close();

        System.out.printf("Is there a sum?: %s",
                sumExists(numbers, goal) ? "yes" : "no");
    }

    public static boolean sumExists(int[] numbers, int goal) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == goal) return true;
            }
        }
        return false; // Sum not found
    }
}
