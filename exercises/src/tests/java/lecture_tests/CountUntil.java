package lecture_tests;

import java.util.Scanner;

public class CountUntil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Count limit: ");
        int limit = scanner.nextInt();

        countUntil(limit);

        scanner.close();
    }

    public static void countUntil(int limit) {
        int count = 1;
        while (count <= limit) {
            System.out.println(count);
            count++;
        }
    }
}
