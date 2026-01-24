package basics.arrays;

import java.util.Scanner;

/**
 * Leer N números (N solicitado previamente por teclado)
 * Almacenarlos en un array.
 * Mostrar la media de los pares y la media de los impares.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numbers quieres leer?: ");
        int numbersToRead = scanner.nextInt();

        int[] numbers = new int[numbersToRead];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el number en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        double evenSum = 0;
        double oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            boolean isEven = number % 2 == 0;

            if (isEven) {
                evenSum += number;
                evenCount++;
            } else {
                oddSum += number;
                oddCount++;
            }
        }

        System.out.printf("\nHay %d numbers pares. Su media es: %.2f", evenCount, evenSum / evenCount);
        System.out.printf("\nHay %d numbers impares. Su media es: %.2f", oddCount, oddSum / oddCount);
    }
}
