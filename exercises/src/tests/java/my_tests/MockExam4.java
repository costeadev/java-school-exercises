package my_tests;

import java.util.Scanner;

public class MockExam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you add to the 1st array?: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Element %d of 1st array: ", i + 1);
            array1[i] = scanner.nextInt();
        }

        System.out.print("How many numbers will you add to the 2nd array?: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Element %d of 2nd array: ", i + 1);
            array2[i] = scanner.nextInt();
        }

        System.out.print("\nArray with maximum values: ");
        int[] maxArray = maxOfTwoArrays(array1, array2);
        for (int n : maxArray) {
            System.out.printf("%d ", n);
        }
    }

    public static int[] maxOfTwoArrays(int[] array1, int[] array2) {
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
