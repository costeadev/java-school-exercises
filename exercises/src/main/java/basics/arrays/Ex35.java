package basics.arrays;

import java.util.Arrays;

public class Ex35 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        int cols = 3;
        char[][] matrix = new char[arr.length/cols][cols];

        // Copy to matrix
        for (int i = 0; i < arr.length; i++) {
            matrix[i / cols][i % cols] = arr[i];
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
