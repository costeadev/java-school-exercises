package oop.classes.Ex23;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private static int NEXT_ID = 1;
    private static int vat = 21;
    private final int orderId;
    private final String clientId;
    private final List<Item> items;

    public Order(String clientId) {
        this.orderId = NEXT_ID++;
        this.clientId = clientId;
        this.items = new ArrayList<>();
    }

    public static void changeVAT(int newVAT) {
        if (newVAT < 0) {
            throw new IllegalArgumentException("VAT cannot be negative");
        }
        vat = newVAT;
    }

    public void addItem(Item item) {
        Objects.requireNonNull(item, "Item cannot be null");
        items.add(item);
    }

    // Fill items
    public void fillItems() {

    }
}
