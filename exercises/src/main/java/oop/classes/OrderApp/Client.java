package oop.classes.OrderApp;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int NEXT_ID = 1;

    private final int id;
    private final String name;
    private final List<Order> orders;

    public Client(String name) {
        this.id = NEXT_ID++;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order newOrder) {
        if (findOrderById(newOrder.getId()) != null) {
            throw new IllegalArgumentException("The order already exists");
        }
        orders.add(newOrder);
    }

    public void removeOrderByCode(int orderId) {
        if (findOrderById(orderId) == null) {
            throw new IllegalArgumentException("The order doesn't exist");
        }
        orders.remove(findOrderById(orderId));
    }

    public Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public boolean hasItem(int itemId) {
        for (Order order : orders) {
            for (Item item : order.getItems()) {
                if (item.getId() == itemId) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removeItemFromAllOrders(int itemId) {
        for (Order order : orders) {
            if (!order.containsItem(itemId)) {
                continue;
            }
            order.getItems().removeIf(item -> item.getId() == itemId);
        }
    }

    public double getTotalSpent() {
        double sum = 0;
        for (Order order : orders) {
            sum += order.getTotal();
        }
        return sum * (1 - Order.getIVA() / 100);
    }

    @Override
    public String toString() {
        return String.format("%s (ID %d)", name, id);
    }
}
