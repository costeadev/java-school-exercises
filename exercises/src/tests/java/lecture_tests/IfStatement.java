package lecture_tests;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int n = scanner.nextInt();

        // Good way
        if (n < 0) {
            System.out.println("Non-valid number");
        }

        // EVIL WAY
        if (n < 0)
            System.out.println("Non-valid number");
    }
}
