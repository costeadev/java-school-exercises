package exams;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String: ");
        String str = scanner.nextLine();


        String compressedStr = "";
        for (int i = 0; i <= str.length(); i++) {
            int letterCount = 1;
            boolean differentLetter = false;

            for (int j = i + 1; j < str.length() && !differentLetter; j++) {
                if (str.charAt(i) == str.charAt(j)) letterCount++;
                else if (str.charAt(i) != str.charAt(j)) {
                    compressedStr += "" + str.charAt(i) + letterCount;
                    i += letterCount - 1;
                    differentLetter = true;
                }
            }
            if (i == str.length() - 1) {
                compressedStr += "" + str.charAt(i) + letterCount;
            }
        }
        if (compressedStr.length() > str.length()) {
            System.out.println(str);
        } else {
            System.out.println(compressedStr);
        }
    }
}
