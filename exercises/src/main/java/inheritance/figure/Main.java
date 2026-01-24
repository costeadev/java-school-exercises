package inheritance.figure;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        FigureManager manager = new FigureManager();

        // Add random Circles
        for (int i = 0; i < 3; i++) {
            manager.addFigure(new Circle(rand.nextDouble() * 10 + 1));
        }

        // Add random Squares
        for (int i = 0; i < 3; i++) {
            manager.addFigure(new Square(rand.nextDouble() * 10 + 1));
        }

        System.out.println("Total Perimeter: " + manager.getTotalPerimeter());
        System.out.println("Total Area: " + manager.getTotalArea());
    }
}
