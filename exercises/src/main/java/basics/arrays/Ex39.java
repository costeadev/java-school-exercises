package basics.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] grid = new char[3][3];

        System.out.println("=== TIC TAC TOE ===");

        char player;
        do {
            System.out.print("X or O?: ");
            player = scan.next().charAt(0);
        } while (player != 'X' && player != 'O');

        char computer = (player == 'X') ? 'O' : 'X';

        Random random = new Random();
        boolean computerStarts = random.nextInt(0, 2) == 1;

        try {
            System.out.print("Doing RNG stuff.");
            Thread.sleep(500);

            System.out.print("\rDoing RNG stuff..");
            Thread.sleep(500);

            System.out.print("\rDoing RNG stuff...");
            System.out.println();
        } catch (InterruptedException e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }

        if (computerStarts) {
            System.out.println("Computer starts!");
            int row;
            int col;
            do {
                row = random.nextInt(0, 3);
                col = random.nextInt(0, 3);
            } while (grid[row][col] == 'X' || grid[row][col] == 'O');
            grid[row][col] = computer;
        } else {
            System.out.println("You start!");
        }

        do {
            printGrid(grid);

            int row, col;
            do {
                System.out.print("Row: ");
                row = scan.nextInt();
                System.out.print("Column: ");
                col = scan.nextInt();

                if ((grid[row][col] == 'X' || grid[row][col] == 'O')) {
                    System.err.println("Cell occupied\n");
                }
            } while ((grid[row][col] == 'X' || grid[row][col] == 'O'));

            grid[row][col] = player;

            // Computer move
            do {
                row = random.nextInt(0, 3);
                col = random.nextInt(0, 3);
            } while (grid[row][col] == 'X' || grid[row][col] == 'O');
            grid[row][col] = computer;

            System.out.println();
        } while (whoWins(grid) != 'X' && whoWins(grid) != 'O');

        printGrid(grid);
        System.out.printf("%c wins!", whoWins(grid));

        scan.close();
    }

    private static void printGrid(char[][] grid) {
        for (int rows = 0; rows < grid.length; rows++) {
            for (int cols = 0; cols < grid[0].length; cols++) {
                System.out.printf("%c ", grid[rows][cols]);
            }
            System.out.println();
        }
    }

    private static char whoWins(char[][] grid) {
        char winner = 0;
        // Horizontal
        if (grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') winner = 'X';
        else if (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') winner = 'X';
        else if (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') winner = 'X';
        else if (grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') winner = 'O';
        else if (grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O') winner = 'O';
        else if (grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O') winner = 'O';
        // Vertical
        else if (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') winner = 'X';
        else if (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') winner = 'X';
        else if (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][1] == 'X') winner = 'X';
        else if (grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O') winner = 'O';
        else if (grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O') winner = 'O';
        else if (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O') winner = 'O';

        // Diagonal
        else if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') winner = 'X';
        else if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X') winner = 'X';
        else if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') winner = 'O';
        else if (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O') winner = 'O';

        return winner;
    }
}
