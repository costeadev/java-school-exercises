package basics.arrays;

public class Ex34 {
    public static void main(String[] args) {
        int rows = 4; // keyboard input
        int cols = 4;
        int[][] students = new int[][]{
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };

        for (int i = 0; i < rows; i++) { // Students
            double sum = 0;
            for (int j = 0; j < cols; j++) { // Grades
                sum += students[i][j];
            }
            System.out.printf("Alumno %d: media %.2f\n", i + 1, sum / cols);
        }
    }
}
