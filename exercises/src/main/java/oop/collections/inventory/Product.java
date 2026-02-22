package oop.collections.inventory;

public class Product {

    private static int NEXT_CODE = 1;

    private int code;
    private String name;
    private float price;

    public Product(String name, float price) {
        code = NEXT_CODE++;
        this.name = name;
        this.price = price;
    }
}
