package lecture_tests;

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("They're multiples :D");
        } else {
            System.out.println("They're not multiples :/");
        }

        System.out.println("Adios 🐂");

        scanner.close();
    }
}
