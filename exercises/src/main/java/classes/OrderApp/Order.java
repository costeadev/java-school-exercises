package classes.OrderApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private static int NEXT_ID = 1;

    private final int id;
    private List<Item> items;
    private static double iva = 21;

    public Order() {
        this.id = NEXT_ID++;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items); // defensive copy
    }

    public double getTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum * (1 + iva / 100);
    }

    public boolean containsItem(int itemId) {
        for (Item item : items) {
            if (itemId == item.getId()) {
                return true;
            }
        }
        return false;
    }

    public void addItem(Item item) {
        Objects.requireNonNull(item, "Item can't be null");
        items.add(item);
    }

    public void removeItemById(int itemId) {
        boolean removed = items.removeIf(item -> item.getId() == itemId);
        if (!removed) {
            throw new RuntimeException("Item couldn't be found");
        }
    }

    public static double getIVA() {
        return iva;
    }

    public static void setIVA(double newIVA) {
        if (newIVA < 0) {
            throw new RuntimeException("New VAT must be positive");
        }
        iva = newIVA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Order (ID %d)\n", id));

        for (Item item : items) {
            sb.append(item);
            sb.append("\n");
        }

        sb.append(String.format("\nTotal price: $%.2f (%.2f%% IVA)", getTotal(), iva));

        return sb.toString();
    }
}
