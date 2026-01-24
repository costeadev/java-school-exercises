package oop.classes.OrderApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClientRegistry {
    private static final List<Client> clients = new ArrayList<>();

    public static List<Client> getClients() {
        return clients;
    }

    public static void add(Client client) {
        Objects.requireNonNull(client, "Client cannot be null");
        if (clients.size() == 50) {
            throw new RuntimeException("Cannot add more clients");
        }
        if (findClientById(client.getId()) != null) {
            throw new IllegalArgumentException("Client already exists");
        }
        clients.add(client);
    }

    public static void removeClientById(int clientId) {
        if (findClientById(clientId) == null) {
            throw new IllegalArgumentException("Client doesn't exist");
        }
        clients.remove(findClientById(clientId));
    }

    public static Client findClientById(int clientId) {
        for (Client client : clients) {
            if (client.getId() == clientId) {
                return client;
            }
        }
        return null;
    }
}
