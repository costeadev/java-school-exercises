import java.util.Random;

public class SquareGenerator {
    private static char[] letters = {'a', 'b', 'c' , 'd', 'e', 'f', 'g', 'h'};
    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

    public static Square generate() {
        Random random = new Random();

        int file = random.nextInt(8);
        int rank = random.nextInt(8);
        Color color = (file + rank) % 2 == 0 ? Color.BLACK : Color.WHITE;

        return new Square(letters[file], numbers[rank], color);
    }
}
