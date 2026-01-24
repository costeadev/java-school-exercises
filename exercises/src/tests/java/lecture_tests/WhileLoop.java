package lecture_tests;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.print("Positive number: ");
            num = scanner.nextInt();
        } while (num < 0);

        scanner.close();
    }
}
