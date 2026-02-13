package oop.classes.Ex23;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClientRegistry {

    private static final List<Client> clients = new ArrayList<>();

    public static void add(Client client) {
        Objects.requireNonNull(client, "Client cannot be null");
        clients.add(client);
    }

    public static Client findById(int clientId) {
        for (Client client : clients) {
            if (client.getId() == clientId) {
                return client;
            }
        }
        return null;
    }
}
