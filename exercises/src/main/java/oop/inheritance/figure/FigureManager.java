package oop.inheritance.figure;

import java.util.ArrayList;
import java.util.List;

public class FigureManager {
    private final List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure f) {
        if (f != null) {
            figures.add(f);
        }
    }

    public double getTotalPerimeter() {
        return figures.stream().mapToDouble(Figure::getPerimeter).sum();
    }

    public double getTotalArea() {
        return figures.stream().mapToDouble(Figure::getArea).sum();
    }

}
