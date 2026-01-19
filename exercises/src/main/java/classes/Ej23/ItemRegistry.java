package classes.Ej23;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemRegistry {
    private static List<Item> items = new ArrayList<>();

    public static List<Item> getItems() {
        return items;
    }

    public static void add(Item item) {
        Objects.requireNonNull(item, "Item cannot be null");
        items.add(item);
    }
}
