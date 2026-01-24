package oop.classes.Ej23;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int NEXT_ID = 1;

    private final int id;
    private final String name;
    private final List<Integer> orderIds;

    public Client(String name) {
        this.id = NEXT_ID++;
        this.name = name;
        this.orderIds = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
}
