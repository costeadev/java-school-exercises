package my_tests;

import java.util.Arrays;
import java.util.Scanner;

public class MockExam5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Clean buffer

        String[] words = new String[size];
        for (int i = 0; i < words.length; i++) {
            System.out.print("Introduce una palabra: ");
            words[i] = scanner.nextLine();
        }

        int lastIndex = words.length - 1;
        for (int i = 0, j = lastIndex; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        System.out.println(Arrays.toString(words));
    }
}
