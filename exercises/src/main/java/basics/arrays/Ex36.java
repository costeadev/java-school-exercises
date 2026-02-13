package basics.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex36 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(0, 11);
        int cols = random.nextInt(0, 11);
        int[][] matrix = new int[rows][cols];

        // Fill in the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(0, 10);
            }
        }

        // Print with average
        for (int i = 0; i < rows; i++) {
            double sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            System.out.print(Arrays.toString(matrix[i]));
            System.out.printf(" Average: %.2f\n", sum / cols);
        }
    }
}
