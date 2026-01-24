package oop.inheritance.figure;

public class Triangle extends Figure {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double s1, double s2, double s3) {
        super("Triangle", 3);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
