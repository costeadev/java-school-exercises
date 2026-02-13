package oop.inheritance.inventory;

/**
 * Represents a product whose effective price is reduced by a percentage discount
 * <p>
 * The discount is applied dynamically when {@link #getPrice() is called.}
 */
public class DiscountedProduct extends Product {
    private double discountPercentage;

    /**
     *
     * @param name the product name
     * @param price the base (non-discounted) price
     * @param discountPercentage discount to apply, from 0 to 100
     * @throws IllegalArgumentException if the discount is outside the valid range
     */
    public DiscountedProduct(String name, double price, double discountPercentage) {
        super(name, price);

        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage invalid");
        }
        this.discountPercentage = discountPercentage;
    }

    /** {@inheritDoc} */
    @Override
    public double getPrice() { // Price with discount
        return super.getPrice() * (1 - discountPercentage/100);
    }

    @Override
    public String extraInfo() {
        return String.format("Final price: [$%.2f] (%.2f%% discount)", getPrice(), discountPercentage);
    }
}
