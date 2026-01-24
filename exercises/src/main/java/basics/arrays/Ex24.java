package basics.arrays;

/*
 * Dado un array de n enteros pasados por teclado,
 * ordenarlo (sin usar otro array. Se ordenará el mismo array creado anteriormente).
 * Array inicial: 5 2 7 3 8
 * Mismo array después de la ejecución: 2 3 5 7 8
 */

import java.util.Random;

public class Ex24 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[5000000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 1001);
        }

        int n = arr.length;

        long start = System.currentTimeMillis();

        quickSort(arr, 0, n - 1);

        long end = System.currentTimeMillis();

        System.out.printf("Time taken: %d seconds", (end - start) / 1000);

    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
