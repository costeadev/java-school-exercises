package lecture_tests;

import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un number: ");
        final int num = scanner.nextInt();

        // Descending count
        for (int i = num; i >= -num; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
