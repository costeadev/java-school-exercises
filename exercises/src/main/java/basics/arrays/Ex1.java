package basics.arrays;

import java.util.Scanner;

 // Read 5 numbers
 // - Show them forwards
 // - Show them backwards


public class Ex1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Read 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("Forwards: ");
        for (int num : numbers) {
            System.out.printf("%d ", num);
        }

        System.out.println();

        System.out.print("Backwards: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
