package oop.classes.Ej23;

import utils.Keyboard;

public class Main {
    public static void main(String[] args) {

        int option;

        do {
            printMenu();
            option = Keyboard.readInt("Choose an option: ");

            switch (option) {
                case 1 -> { // Create item
                    Item item = createItem();
                    ItemRegistry.add(item);
                }

                case 2 -> { // Add client
                    Client client = createClient();
                    ClientRegistry.add(client);
                }

                case 3 -> { // Start order

                }

                case 4 -> { // Show best client

                }

                case 5 -> { // Remove item from all orders

                }

                case 6 -> { // Change VAT
                    int newVAT = Keyboard.readInt("New VAT: ");
                    Order.changeVAT(newVAT);
                }

                case 7 -> { // Add Item (Test)
                    Item item = createItem();
                    ItemRegistry.add(item);
                    System.out.println();
                }

                case 0 -> { // Finish program
                    System.out.println("Bye bye! 👋");
                }

                default -> {
                    System.err.println("=== INVALID OPTION ===");
                }
            }
        } while (option != 0);
    }

    public static void printMenu() {
        System.out.print("""
                1. Add item
                2. Create client
                3. Start order
                4. Delete item from all orders
                5. Show best client
                6. Change VAT
                0. Exit
                """);
    }

    public static Item createItem() {
        String name = Keyboard.readString("Name: ");
        double price = Keyboard.readDouble("Price: ");
        return new Item(name, price);
    }

    public static Client createClient() {
        String name = Keyboard.readString("Name: ");
        return new Client(name);
    }
}
