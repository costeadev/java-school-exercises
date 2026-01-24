package inheritance.figure;

public abstract class Figure {
    private String name;
    private int numOfSides;

    public Figure(String name, int numOfSides) {
        this.name = name;
        this.numOfSides = numOfSides;
    }

    public String getName() {
        return name;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public abstract double getPerimeter();
    public abstract double getArea();
}
