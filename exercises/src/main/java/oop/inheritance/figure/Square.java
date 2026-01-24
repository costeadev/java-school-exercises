package oop.inheritance.figure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        super("Square", 4);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
