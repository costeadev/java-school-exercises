public class Square {
    private char letter;
    private int number;
    private Color color;

    public Square(char letter, int number, Color color) {
        this.letter = letter;
        this.number = number;
        this.color =  color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "" + letter + number;
    }
}
