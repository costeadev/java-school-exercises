import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = "CC";

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < MESSAGE.length(); i++) {
            binary.append(toBinary(MESSAGE.charAt(i)));
        }

        int size = 1;
        char current = 0;

        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            // create block
            if (current == binary.charAt(i)) {
                size++;
            } else { // block finish
                if (current == 1) {
                    encoded.append("00 ");
                }
                else{
                    encoded.append("0 ");
                }
                encoded.append("0".repeat(size));
                encoded.append(" ");
                size = 1;
                current = binary.charAt(i);
            }
        }
        System.out.println(encoded);
    }

    private static String toBinary(int n) {
        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}