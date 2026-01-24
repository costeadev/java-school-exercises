package oop.inheritance.figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        super("Circle", 0);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
