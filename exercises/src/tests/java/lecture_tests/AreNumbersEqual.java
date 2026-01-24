package lecture_tests;

import java.util.Scanner;

public class AreNumbersEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int num1 = scanner.nextInt();
        if (num1 < 0) System.out.println("Number is negative");

        System.out.print("\nAnother number: ");
        int num2 = scanner.nextInt();
        if (num2 < 0) System.out.println("Number is negative");

        if (num1 == num2) System.out.println("They're equal");
        if (num1 < num2) System.out.println(num1 + " " + num2);
        if (num1 > num2) System.out.println(num2 + " " + num1);

        scanner.close();
    }
}
