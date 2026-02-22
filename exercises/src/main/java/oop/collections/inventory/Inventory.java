package oop.collections.inventory;

import utils.Keyboard;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    Map<String, Double> products = new HashMap<>();

    public void saveProduct(String name, Double price) {
        if (products.containsKey(name)) {
            throw new IllegalArgumentException("Product already exists");
        }
        products.put(name, price);
    }

    public void modifyPrice(String name, double newPrice) {
        if (!products.containsKey(name)) {
            throw new IllegalArgumentException("Product doesn't exist");
        }
        products.replace(name, newPrice);
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("=== No products ===");
            return;
        }
        for (Map.Entry<String, Double> e : products.entrySet()) {
            System.out.printf("- %s : %.2f€\n", e.getKey(), e.getValue());
        }
    }

    public void deleteProduct(String name) {
        if (!(products.containsKey(name))) {
            throw new IllegalArgumentException("Product doesn't exist");
        }
        products.remove(name);
    }
}
