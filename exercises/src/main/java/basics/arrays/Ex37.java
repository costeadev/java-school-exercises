package basics.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex37 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(1, 11);
        int cols = random.nextInt(1, 11);
        int arraySize = 2;
        int[][][] matrix = new int[rows][cols][];

        // Fill in the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = randomArray(arraySize);
            }
        }

        // Print with average
        for (int i = 0; i < rows; i++) {
            double sum = 0;
            int count = 0;

            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    sum += matrix[i][j][k];
                    count++;
                }
            }
            System.out.printf("%s Average: %.2f\n", Arrays.deepToString(matrix[i]), sum / count);
        }
    }

    private static int[] randomArray(int size) {
        Random random = new Random();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(0, 10);
        }
        return arr;
    }
}
