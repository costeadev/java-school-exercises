package classes.OrderApp;

import utils.Keyboard;

public class Main {
    public static void main(String[] args) {
        // Main menu
        int option;
        do {
            printMenu();
            option = Keyboard.readInt("Select an option: ");

            switch (option) {
                case 1 -> { // Modify IVA
                    double newIVA = Keyboard.readDouble("New IVA: ");
                    Order.setIVA(newIVA);
                }
                case 2 -> { // Insert new client
                    String name = Keyboard.readString("Client name: ");
                    ClientRegistry.add(new Client(name));
                }
                case 3 -> { // Insert order for a client (by clientId)
                    int clientId = Keyboard.readInt("Client ID: ");
                    Client client = ClientRegistry.findClientById(clientId);
                    Order order = new Order();

                    String keepGoing;
                    do {
                        Item newItem = createItem();
                        order.addItem(newItem);
                        keepGoing = Keyboard.readString("Type 'y' to continue adding items: ");
                    } while (keepGoing.equalsIgnoreCase("y"));
                    client.addOrder(order);
                }
                case 4 -> { // Show orders of a client (by clientId)
                    int clientId = Keyboard.readInt("Client ID: ");
                    Client client = ClientRegistry.findClientById(clientId);

                    System.out.printf("\n%s's orders: \n", client.getName());
                    if (client.getOrders() == null) {
                        System.out.println("No orders yet");
                    } else {
                        for (Order order : client.getOrders()) {
                            System.out.println(order);
                            System.out.println("\n");
                        }
                    }
                }

                case 5 -> { // Remove item by code from ALL clients and orders
                    int itemId = Keyboard.readInt("Item ID: ");
                    for (Client client : ClientRegistry.getClients()) {
                        for (Order order : client.getOrders()) {
                            if (!order.containsItem(itemId)) {
                                break;
                            }
                            order.removeItemById(itemId);
                        }
                    }
                }

                case 6 -> { // Show the client who has spent the most
                    Client leader = getLeader();
                    System.out.println(leader);
                }

                case 7 -> { // Show all clients
                    if (ClientRegistry.getClients().isEmpty()) {
                        System.out.println("\nNo clients yet");
                        continue;
                    }
                    for (Client client : ClientRegistry.getClients()) {
                        System.out.println(client);
                    }
                }

                case 0 -> {
                    // Exit
                }

                default -> {
                    System.err.println("\nInvalid option");
                }
            }
        } while (option != 0);
    }

    private static void printMenu() {
        System.out.println("""
                \n1. Modify IVA
                2. Insert new client
                3. Insert order for a client
                4. Show orders of a client
                5. Remove item by code from ALL clients and orders
                6. Show the client who has spent the most
                7. Show clients
                0. Exit
                """);
    }

    private static Item createItem() {
        String name = Keyboard.readString("Item name: ");
        double price = Keyboard.readDouble("Item price: ");
        return new Item(name, price);
    }

    private static Client getLeader() {
        Client leader = null;
        double mostSpent = -1;
        for (Client client : ClientRegistry.getClients()) {
            if (client.getTotalSpent() < mostSpent) {
                leader = client;
                mostSpent = client.getTotalSpent();
            }
        }
        if (leader == null) {
            throw new IllegalArgumentException("No clients yet");
        }
        return leader;
    }


}
