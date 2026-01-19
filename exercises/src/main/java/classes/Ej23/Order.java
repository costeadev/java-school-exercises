package classes.Ej23;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private static int NEXT_ID = 1;

    private final int orderId;
    private String clientId;
    private List<Item> items;
    private static int vat = 21;

    public Order(String clientId) {
        this.orderId = NEXT_ID++;
        this.clientId = clientId;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        Objects.requireNonNull(item, "Item cannot be null");
        items.add(item);
    }

    // Fill items
    public void fillItems() {

    }

    public static void changeVAT(int newVAT) {
        if (newVAT < 0) {
            throw new IllegalArgumentException("VAT cannot be negative");
        }
        vat = newVAT;
    }
}
