package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int ROWS = 5;
        final int COLS = 5;

        String[][] matrix = new String[ROWS][COLS];

        int option;
        do {
            printMenu();
            System.out.print("Choose an option: ");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1 -> { // Add student to position
                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Row number (0-4): ");
                    int row = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Col number (0-4): ");
                    int col = scan.nextInt();
                    scan.nextLine();

                    try {
                        matrix[row][col] = name;
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                        break;
                    }
                    System.out.println("Student added succesfully!\n");
                }
                case 2 -> { // Find student by name
                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    int[] foundPosition;
                    try {
                        foundPosition = findPosition(matrix, name);
                        assert foundPosition != null;
                    } catch (Exception e) {
                        System.err.println("Student not found\n");
                        break;
                    }

                    System.out.printf("Student found at [%d][%d]\n", foundPosition[0], foundPosition[1]);
                }
                case 3 -> {
                    System.out.print("Name 1: ");
                    String name1 = scan.nextLine();

                    int[] position1;
                    try {
                        position1 = findPosition(matrix, name1);
                        assert position1 != null;
                    } catch (Exception e) {
                        System.err.println("Student not found\n");
                        break;
                    }

                    System.out.print("Name 2: ");
                    String name2 = scan.nextLine();

                    int[] position2;
                    try {
                        position2 = findPosition(matrix, name2);
                        assert position2 != null;
                    } catch (Exception e) {
                        System.err.println("Student not found\n");
                        break;
                    }

                    if (position1[0] == position2[0] || position1[1] == position2[1]) {
                        System.out.println("Students are on the same row or column\n");
                    }
                }
                case 4 -> { // Swap students
                    System.out.print("Name 1: ");
                    String name1 = scan.nextLine();

                    int[] position1;
                    try {
                        position1 = findPosition(matrix, name1);
                        assert position1 != null;
                    } catch (Exception e) {
                        System.err.println("Student not found\n");
                        break;
                    }

                    System.out.print("Name 2: ");
                    String name2 = scan.nextLine();

                    int[] position2;
                    try {
                        position2 = findPosition(matrix, name2);
                        assert position2 != null;
                    } catch (Exception e) {
                        System.err.println("Student not found\n");
                        break;
                    }

                    // Swap students
                    String tmp = matrix[position1[0]][position1[1]];
                    matrix[position1[0]][position1[1]] = matrix[position2[0]][position2[1]];
                    matrix[position2[0]][position2[1]] = tmp;
                }
                case 5 -> { // Print matrix
                    System.out.println();
                    for (String[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("Ba bai\n");
                }
                default -> {
                    System.err.println("Non-valid option\n");
                }
            }
        } while (option != 0);

        scan.close();
    }

    private static int[] findPosition(String[][] grid, String target) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == null) continue;
                if (grid[row][col].equals(target)) {
                    return new int[] { row, col };
                }
            }
        }
        return null; // not found
    }

    private static void printMenu() {
        System.out.println("""
                1. Add student
                2. Find student
                3. Are two students consecutive
                4. Swap two students
                5. Print matrix
                0. Exit""");
    }
}

