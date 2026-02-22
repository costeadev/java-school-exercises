package oop.collections.schoolmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Registry<T> {

    protected final List<T> items;

    public Registry() {
        this.items = new ArrayList<>();
    }

    // Add item if it doens't already exist
    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (items.contains(item)) { // relies on equals()
            throw new IllegalStateException("Item already added");
        }
        items.add(item);
    }

    // Remove item, return true if removed
    public boolean remove(T item) {
        return items.remove(item);
    }

    // Get all items
    public List<T> getAll() {
        return new ArrayList<>(items); // defensive copy
    }

    // Find by some key (abstract because T may have different keys)
    public abstract T findByKey(String key);
}
