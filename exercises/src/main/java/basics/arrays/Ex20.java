package basics.arrays;

import java.util.Scanner;

/**
 * Leer 10 enteros ordenados crecientemente,
 * Leer N y mostrar en que posicion se encuentra.
 * Si no está, indicarlo con un mensaje.
 */

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to fill array
        int[] numbers = new int[10];
        System.out.println("--- RELLENAR UN ARRAY DE 10 NUMEROS ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el numero en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        // Ask user to enter a numberToFind
        System.out.print("Introduce un numero para buscar dentro de ese array: ");
        int numberToFind = scanner.nextInt();


        int index = -1;

        // Search for an equal number inside the array
        for (int i = 0; i < numbers.length && numbers[i] <= numberToFind; i++) {
            if (numbers[i] == numberToFind) {
                index = i;
                break; // Loop exit condition
            }
        }

        // Print results
        if (index != -1) {
            System.out.printf("%d esta en numbers[%d]", numberToFind, index);
        } else {
            System.out.printf("No se ha podido encontrar %d", numberToFind);
        }
    }
}
