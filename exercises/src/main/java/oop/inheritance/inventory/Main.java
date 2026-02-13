package oop.inheritance.inventory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Shop shop = bootstrapShop();
        System.out.println(shop);
        System.out.printf("Total shop value: $%.2f\n", shop.getTotalValue());
    }

    private static Shop bootstrapShop() {
        Shop shop = new Shop();
        shop.addProduct(new Product("Burger King Foot Lettuce", 20));
        shop.addProduct(new DiscountedProduct("Goofy Goober Hat", 100, 20));
        shop.addProduct(new PerishableProduct("Colored Krabby Patty", 10, LocalDate.of(2025, 10, 2)));
        shop.addProduct(new PerishableProduct("Krabby Patty with lots of conservants", 10, LocalDate.of(2027, 1, 26)));
        shop.addProduct(new PerishableProduct("Patrick's midnight sandwich", 10, LocalDate.of(2026, 1, 26)));
        shop.addProduct(new PerishableProduct("Gary's Litterbox", 10, LocalDate.of(2026, 1, 25)));
        shop.addProduct(new Product("Patrick's mayonaisse", 69));
        return shop;
    }
}
