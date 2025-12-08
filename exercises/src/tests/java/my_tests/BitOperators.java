package my_tests;

import java.util.Scanner;

public class BitOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Hasta cuántos bits quieres mostrar?: ");
        int maxBits = scan.nextInt();

        // Go DOWN from maxBits to 1
        for (int i = maxBits; i >= 1; i--) {
            long max = (1L << i) - 1; // max number with i bits
            String binary = Long.toBinaryString(max); // get binary representation
            System.out.println(i + " bits → " + max + " (binario: " + binary + ")");
        }

        scan.close();
    }
}
