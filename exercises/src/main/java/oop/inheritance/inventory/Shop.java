package oop.inheritance.inventory;

/**
 * Represents a shop that manages an inventory of products.
 * <p>
 * Products are stored in a fixed-size array and kept contiguosly.
 * Expired perishable products are discarded and moved to a trash collection
 */
public class Shop {
    private Product[] products;
    private PerishableProduct[] trash; // Maybe this should be Product[]

    public Shop() {
        products = new Product[100];
        trash = new PerishableProduct[100];
    }

    /**
     * Adds a product to the shop inventory.
     * <p>
     * Products are stored contiguously from index 0
     * A null entry marks the end of the inventory.
     * If an expired perishable product is found, it is removed
     * and replaces by the new product.
     * @param product the product to add to the inventory
     */
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof PerishableProduct && ((PerishableProduct) products[i]).isExpired()) {
                throwProduct((PerishableProduct) products[i]);
                products[i] = product;
                return;
            }
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }

    /**
     * Calculates the total value of the shop inventory.
     * <p>
     * The value is computed by summing {@link Product#getPrice()}
     * for each product until a null entry is reached.
     *
     * @return the total monetary value of all the products in the shop
     */
    public double getTotalValue() {
        double total = 0;
        for (Product p : products) {
            if (p == null) {
                return total;
            }
            total += p.getPrice();
        }
        return total;
    }


    private void throwProduct(PerishableProduct p) {
        for (int i = 0; i < trash.length; i++) {
            if (trash[i] == null) {
                trash[i] = p;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("=== SHOP ===\n");
        for (Product p : products) {
            if (p == null) break;
            sb.append(p);
            sb.append('\n');
        }

        sb.append("=== TRASH ===\n");
        for (PerishableProduct p : trash) {
            if (p == null) break;
            sb.append(p);
            sb.append('\n');
        }

        return sb.toString();
    }
}
