package lecture_tests;

import java.util.Scanner;

// Program which reads 2 char
// Then says if the 2nd is the 1st but uppercase
// If not, it will say which is the uppercase of the 1st char

public class UppercaseASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Character: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Another character: ");
        char char2 = scanner.next().charAt(0);


        boolean validChar = char1 >= 97 && char1 <= 122 || char2 >= 97 && char2 <= 122;

        String checkCharacter = !validChar ? "Non-valid character" :
                char1 - char2 == 32 ? String.format("%c is %c but uppercase", char1, char2) :
                        String.format("%c's uppercase is %c", char1, char1 - 32);

        System.out.printf(checkCharacter);

        scanner.close();
    }
}
