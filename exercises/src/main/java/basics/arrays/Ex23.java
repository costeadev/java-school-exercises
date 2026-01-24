package basics.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("""
                \n/// METODO DE ENTRADA ///
                1. Automatico
                2. Manual
                ////////////////////////
                """);
        int choice;
        do {
            System.out.print("Elige un metodo de entrada: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 2);

        System.out.println();

        if (choice == 1) {
            fillArrayRandomly(numbers, scanner);
        }
        if (choice == 2) {
            fillArrayFromInput(numbers, scanner);
        }

        System.out.println();


//        System.out.println("Antes: " + Arrays.toString(numbers));

        long startTime = System.currentTimeMillis();
        selectionSort(numbers); // Sort the array
        long endTime = System.currentTimeMillis();

        System.out.printf("Algorithm runtime: %d", (endTime - startTime) / 1000);

//        System.out.println("Despues: " + Arrays.toString(numbers));

        scanner.close();
    }

    private static void fillArrayFromInput(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Introduce el number en posicion %d: ", i + 1);
            array[i] = sc.nextInt();
        }
    }

    private static void fillArrayRandomly(int[] array, Scanner sc) {
        Random rand = new Random();

        System.out.print("Inicio rango: ");
        int start = sc.nextInt();

        int end;
        do {
            System.out.print("Final rango: ");
            end = sc.nextInt();
        } while (end <= start);

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(end - start + 1) + start;
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
