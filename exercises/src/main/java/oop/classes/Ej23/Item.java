package oop.classes.Ej23;

public class Item {
    private static int NEXT_ID = 1;

    private final int id;
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.id = NEXT_ID++;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("""
                {%s;%s;%.2f}
                """, id, name, price);
    }
}
