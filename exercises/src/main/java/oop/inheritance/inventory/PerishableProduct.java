package oop.inheritance.inventory;

import java.time.LocalDate;

/**
 * Represents a product with a limited shelf life.
 * <p>
 * Expiration is determined dynamically based on the current date
 * and is not stored as persistent state
 */
public class PerishableProduct extends Product {
    private LocalDate expirationDate;

    public PerishableProduct(String name, double price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Determines whether the product is expired relative to the curent date.
     * @return true if the product's expiration date is before today, false otherwise
     */
    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        // Expired for years
        if (expirationDate.getYear() < today.getYear()) return true;
        // Expires this year
        if (expirationDate.getYear() == today.getYear()) {
            return expirationDate.getDayOfYear() < today.getDayOfYear();
        }
        return false;
    }

    @Override
    public String extraInfo() {
        return String.format("Expires: %s", expirationDate);
    }
}
