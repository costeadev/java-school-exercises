package basics.arrays;

import java.util.Scanner;

/**
 * Leer por teclado una serie de 10 números enteros.
 * La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados.
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce en numero en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i-1]) increasing = false;
            if (numbers[i] > numbers[i-1]) decreasing = false;
            if (!increasing && !decreasing) break;
        }
        System.out.printf("Creciente: %s%n", increasing ? "si" : "no");
        System.out.printf("Decreciente: %s%n", decreasing ? "si" : "no");
        System.out.printf("Desordenado: %s%n", (!increasing && !decreasing) ? "si" : "no");
    }
}

