package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[0];

        System.out.println("=== PATTERN RECOGNISER ===");
        String input = "";
        while (true) {
            System.out.print("Enter a number: ('n' to stop): ");
            input = scan.nextLine();
            try {
                int num = Integer.parseInt(input);
                nums = push(nums, num);
            } catch (Exception e) {
                if (!input.equalsIgnoreCase("n")) {
                    System.err.println("Error: " + e.getMessage());
                } else {
                    break;
                }
            }
        }

        System.out.println();
        System.out.printf("Original array: %s\n", Arrays.toString(nums));
        System.out.printf("Pattern: %s\n", Arrays.toString(getPattern(nums)));

        scan.close();
    }

    private static int[] getPattern(int[] arr) {
        int[] divisors = getDivisors(arr.length);

        for (int divisor : divisors) {
            int[] pattern = new int[0];

            // Get temp pattern
            for (int j = 0; j < divisor; j++) {
                pattern = push(pattern, arr[j]);
            }

            boolean hasPattern = true;

            // Compare to real array
            for (int j = divisor; j < arr.length; j++) {
                if (arr[j] != pattern[j % pattern.length]) {
                    hasPattern = false;
                    break;
                }
            }

            if (hasPattern) {
                return pattern;
            }
        }

        return new int[0];
    }

    private static int[] getDivisors(int n) {
        int[] divisors = new int[0];
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors = push(divisors, i);
            }
        }

        for (int i = divisors.length - 1; i >= 0; i--) {
            if (n / divisors[i] != n) {
                divisors = push(divisors, n/divisors[i]);
            }
        }

        return divisors;
    }


    private static int[] push(int[] arr, int n) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = n;
        return arr;
    }
}
