package my_tests;

import java.util.Scanner;

public class MockExam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer array1
        System.out.print("Cuantos numeros quieres introducir en array1?: ");
        int array1Size = scanner.nextInt();
        int[] array1 = new int[array1Size];
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Introduce el elemento %d de array1: ", i + 1);
            array1[i] = scanner.nextInt();
        }

        // Leer array2
        System.out.print("Cuantos numeros quieres introducir en array2?: ");
        int array2Size = scanner.nextInt();
        int[] array2 = new int[array2Size];
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Introduce el elemento %d de array2: ", i + 1);
            array2[i] = scanner.nextInt();
        }

        System.out.printf("\nArray con valor maximo: ");
        int[] arrayMaximo = devolverMaximo(array1, array2);
        for (int n : arrayMaximo) {
            System.out.printf("%d ", n);
        }
    }
    public static int[] devolverMaximo(int[] array1, int[] array2) {
        int array1Max = Integer.MIN_VALUE;
        for (int number : array1) {
            if (number > array1Max) array1Max = number;
        }

        int array2Max = Integer.MIN_VALUE;
        for (int number : array2) {
            if (number > array2Max) array2Max = number;
        }

        if (array2Max > array1Max) {
            return array2;
        } else {
            return array1;
        }
    }
}
