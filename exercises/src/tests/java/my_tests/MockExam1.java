package my_tests;

import java.util.Scanner;

// Program which asks the user for a positive number (n)
// The program will validate the input
// i.e. It will repeatedly ask for a number until it's positive

// If the number is less than 100, the program will display the average of the odd numbers between N and 100

// If the number is greather than 100, display the average of the even number between 100 and N



public class MockExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n until positive
        int n;
        do {
            System.out.print("Positive number: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Non-valid value. Must be positive");
            }
        } while (n < 0);

        scanner.close();

        // Even number average
        if (n < 100) {
            int evenSum = 0;
            int evenCount = 0;
            // evenFlow lol
            for (int i = n + 1; i < 100; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                    evenCount++;
                }
            }
            System.out.printf("%n%d is less than 100.", n);
            System.out.printf("%Even average between %d & 100: %.2f", n, (double) evenSum / evenCount);
        }

        // Odd number average
        else if (n > 100) {
            int oddSum = 0;
            int oddCount = 0;
            for (int i = 100 + 1; i < n; i++) {
                if (i % 2 != 0) {
                    oddSum += i;
                    oddCount++;
                }
            }
            System.out.printf("%n%d is greater than 100.", n);
            System.out.printf("%nOdd average between 100 y %d: %.2f", n, (double) oddSum / oddCount);
        }
        else {
            System.out.printf("%n%d is 100. We don't do nothin' 🫡", n);
        }
    }
}
