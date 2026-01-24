package lecture_tests;

import java.util.Scanner;

// Program which asks for a NAME and a NUMBER
// Must show true if the NAME has more characters than the NUMBER
// Else, show false

public class IsNameBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Number: ");
        int number = scanner.nextInt();

        boolean isNameBigger = name.length() > number;

        System.out.println("\nIs the name bigger than the number?: " + isNameBigger);

        scanner.close();
    }
}
