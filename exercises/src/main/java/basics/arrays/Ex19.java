package basics.arrays;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer dos series de 10 enteros, que estarán ordenados crecientemente.
 * Copiar (fusionar) las dos series en una tercera, de forma que sigan ordenadas.
 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = new int[10];
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print("Introduce un number: ");
            numbers1[i] = scanner.nextInt();
        }
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("Introduce un number: ");
            numbers2[i] = scanner.nextInt();
        }
        scanner.close();


        int[] orderedNumbers = new int[20];
        for (int i = 0; i < orderedNumbers.length; i++) {

            // Varaible declaration
            int minimum1 = Integer.MAX_VALUE;
            int minimum2 = Integer.MAX_VALUE;
            int minimum1Index = 0;
            int minimum2Index = 0;

            // Find minimum in numbers1[]
            for (int j = 0; j < numbers1.length; j++) {
                if (numbers1[j] < minimum1) {
                    minimum1 = numbers1[j];
                    minimum1Index = j;
                }
            }

            // Find minimum in numbers2[]
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers2[j] < minimum2) {
                    minimum2 = numbers2[j];
                    minimum2Index = j;
                }
            }

            if (minimum1 < minimum2) {
                orderedNumbers[i] = minimum1; // Add to ordered list as minimum
                numbers1[minimum1Index] = Integer.MAX_VALUE; // Remove from array
            } else {
                orderedNumbers[i] = minimum2;
                numbers2[minimum2Index] = Integer.MAX_VALUE;
            }
        }

        // Print results
        System.out.println(Arrays.toString(orderedNumbers));
    }
}
