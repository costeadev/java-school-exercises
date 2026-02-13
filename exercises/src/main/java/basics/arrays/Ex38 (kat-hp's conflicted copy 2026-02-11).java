package basics.arrays;

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
            option = scan.nextInt();
            switch (option) {
                case 1 -> { // Add student to position
                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Row number (0-4): ");
                    int row = scan.nextInt();

                    System.out.print("Col number (0-4): ");
                    int col = scan.nextInt();

                    try {
                        matrix[row][col] = name;
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                        break;
                    }
                    System.out.println("Student added succesfully!");
                }
                case 2 -> { // Find student by name
                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    int foundRow = 0;
                    int foundCol = 0;
                    boolean studentFound = false;

                    for (int i = 0; i < ROWS; i++) {
                        for (int j = 0; j < COLS; j++) {
                            if (matrix[i][j].equals(name)) {
                                foundRow = i;
                                foundCol = j;
                                studentFound = true;
                                break;
                            }
                        }
                    }
                    if (studentFound) {
                        System.out.printf("Student found in [%d][%d]\n", foundRow, foundCol);
                    } else {
                        System.err.println("Student not found");
                    }
                }
                case 3 -> {
                    System.out.print("Name 1: ");
                    String name1 = scan.nextLine();

                    System.out.print("Name 2: ");
                    String name2 = scan.nextLine();

                    for ()
                }
                case 4 -> {}
                case 0 -> {
                    System.out.println("Ba bai");
                }
                default -> {
                    System.err.println("Non-valid option");
                }
            }
        } while (option != 0);

        scan.close();
    }

    private static void printMenu() {
        System.out.println("""
                1. Add student
                2. Find student
                3. Swap two students
                4. Are two students consecutive
                0. Exit
                """);
    }
}

