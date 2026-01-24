package oop.classes.OrderApp;

public class Item {
    private static int NEXT_ID = 1;

    private final int id;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.id = NEXT_ID++;

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;

        if (price < 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Item[id=%d, name=%s, price=%.2f€]", id, name, price);
    }
}
