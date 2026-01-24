package my_tests;

import java.util.Scanner;

public class BitOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many bit do you wish to show?: ");
        int maxBits = scanner.nextInt();

        // Go DOWN from maxBits to 1
        for (int i = maxBits; i >= 1; i--) {
            long max = (1L << i) - 1; // Max number with i bits
            String binary = Long.toBinaryString(max); // Get binary representation
            System.out.println(i + " bits → " + max + " (Binary: " + binary + ")");
        }

        scanner.close();
    }
}
