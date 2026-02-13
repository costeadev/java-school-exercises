package oop.inheritance.inventory;

/**
 * Represents a product that can be sold in a shop.
 * <p>
 * A product encapsulates immutable identity data (name) and base price.
 * It does not handle discounts, expiration, or inventory management.
 */
public class Product {
    private final String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        if (price < 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Provides additional information for display purposes.
     * <p>
     * Subclasses may override this method to include extra details
     * such as discounts or expiration dates.
     *
     * @return a formatted string with extra information, or an empty string if not
     */
    public String extraInfo() {
        return "";
    }


    @Override
    public String toString() {
        return String.format("""
                - %s [$%.2f] %s""", name, price, extraInfo());
    }
}
