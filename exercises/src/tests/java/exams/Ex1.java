package exams;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number until it's greater than 1
        int n;
        do {
            System.out.print("Number: ");
            n = scanner.nextInt();
        } while (n < 1);

        scanner.close();


        boolean isEven = n % 2 == 0;
        int collatzCount = 0;
        int peakValue = Integer.MIN_VALUE;

        // Collatz sequence
        while (n > 1) {

            if (isEven) {
                n /= 2;
            } else {
                n *= 3;
                n += 1;
            }
            // Calculate peak value
            if (n > peakValue) peakValue = n;

            // Count all Collatz digits
            collatzCount++;

            // Print every digit
            System.out.printf("%d ", n);
        }

        // Print other values
        System.out.printf("\nCollatz digits: %d", collatzCount);
        System.out.printf("\nPeak value: %d", peakValue);
    }
}
