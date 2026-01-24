package my_tests;

import java.util.Scanner;

public class NameToASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERT YOUR NAME INTO AN ASCII CHARACTER ===");

        System.out.print("What's your name?: ");
        String name = scanner.nextLine();

        System.out.printf("%s = %c", name, toASCII(name));

        scanner.close();
    }

    public static int toASCII(String name) {
        int asciiSum = 0;
        for (int i = 0; i < name.length(); i++) {
            asciiSum += name.charAt(i);
        }
        return asciiSum;
    }
}
