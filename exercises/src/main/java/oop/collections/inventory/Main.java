package oop.collections.inventory;

import utils.Keyboard;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Inventory inventory = new Inventory();

        int option;
        do {
            printMainMenu();
            option = Keyboard.readInt("Choose an option: ");
            switch (option) {
                case 1 -> addFlow(inventory);
                case 2 -> removeFlow(inventory);
                case 3 -> modifyFlow(inventory);
                case 4 -> inventory.showProducts();
                case 0 -> System.out.println("Bye bye");
                default -> System.err.println("Invalid option");
            }
        } while (option != 0);
    }

    private static void addFlow(Inventory inventory) {
        String name = Keyboard.readString("Name: ");
        double price = Keyboard.readDouble("Price: ");
        if (price <= 0) {
            System.err.println("Price can't be negative\n");
            return;
        }
        try {
            inventory.saveProduct(name, price);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.println("Product added succesfully!\n");
    }

    private static void removeFlow(Inventory inventory) {
        String name = Keyboard.readString("Name: ");
        try {
            inventory.deleteProduct(name);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.println("Product removed succesfully!\n");
    }

    private static void modifyFlow(Inventory inventory) {
        String name = Keyboard.readString("Name: ");
        double price = Keyboard.readDouble("Price: ");
        if (price <= 0) {
            System.err.println("Price can't be negative\n");
            return;
        }
        try {
            inventory.modifyPrice(name, price);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.println("Price modified succesfully!\n");
    }

    private static void printMainMenu() {
        System.out.println("""
                1. Add product
                2. Remove product
                3. Modify price
                4. Show products
                0. Exit""");
    }
}
