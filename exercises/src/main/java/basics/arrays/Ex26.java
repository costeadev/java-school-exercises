package basics.arrays;

import utils.Keyboard;

import java.util.Arrays;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number: ");
            numbers[i] = scanner.nextInt();

            System.out.print("Keep going? (y/n): ");
            if (scanner.next().charAt(0) == 'n') {
                break;
            }
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
