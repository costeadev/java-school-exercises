package utils;

import java.util.Scanner;

public class Keyboard {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(sc.nextLine());
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static boolean readBoolean(String prompt) {
        System.out.print(prompt);
        return Boolean.parseBoolean(sc.nextLine());
    }
}
