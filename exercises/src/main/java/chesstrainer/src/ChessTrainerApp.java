import java.util.Scanner;

public class ChessTrainerApp { ;
    private final Scanner scanner = new Scanner(System.in);

    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";

    public void run() {
        System.out.println("=== CHESS TRAINER APP ===");
        while (playRound());
        System.out.println("Training ended.");
    }

    private boolean playRound() {

        Square square = SquareGenerator.generate();

        System.out.println();
        System.out.println("Square: " + square);
        System.out.print("Guess the color (w/b): ");

        String guess = scanner.nextLine().trim().toLowerCase();

        if (!isValidGuess(guess)) {
            return false;
        }

        Color guessedColor = parseGuess(guess);
        evaluateGuess(guessedColor, square.getColor());

        return true;
    }

    private boolean isValidGuess(String guess) {
        return guess.equals("w") || guess.equals("b");
    }

    private Color parseGuess(String guess) {
        return guess.equals("w") ? Color.WHITE : Color.BLACK;
    }

    private void evaluateGuess(Color guessed, Color actual) {
        if (guessed == actual) {
            System.out.println(GREEN + "GOOD." + RESET);
        } else {
            System.out.println(RED + "NO." + RESET);
        }
    }
}
