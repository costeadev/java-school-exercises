package oop.collections.battlearena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Warrior> fighters = new ArrayList<>();
        

        fighters.add(new Warrior(1, "Paco", 200));
        fighters.add(new Warrior(2, "Pico", 200));
        fighters.add(new Warrior(3, "Peca", 200));
        fighters.add(new Warrior(4, "Peco", 200));
        fighters.add(new Warrior(5, "Poca", 500));
        fighters.add(new Warrior(6, "Pepo", 102323));
        fighters.add(new Warrior(7, "Pope", 200));
        fighters.add(new Warrior(8, "Papo", 200));
        fighters.add(new Warrior(9, "Pipo", 200));
        fighters.add(new Warrior(10, "Pepe", 200));

        int size = fighters.size();
        double total;

        total = 0;
        System.out.println("=== FOR LOOP ===");
        for (int i = 0; i <= size; i++) {
            double current = System.nanoTime();
            System.out.printf("%f ms\n", (System.nanoTime() - current) / 1000000);
        }
        System.out.printf("Iterator avg time: %f\n", total / fighters.size());


        total = 0;
        System.out.println("=== ENCHANCED FOR LOOP ===");
        for (Warrior w : fighters) {
            double current = System.nanoTime();
            System.out.printf("%f ms\n", (System.nanoTime() - current) / 1000000);
        }
        System.out.printf("Iterator avg time: %f\n", total / fighters.size());




        total = 0;
        System.out.println("=== ITERATOR ===");
        Iterator<Warrior> it = fighters.iterator();
        while (it.hasNext()) {
            double current = System.nanoTime();
            total += (System.nanoTime() - current) / 1000000;
            it.next();
        }
        System.out.printf("Iterator avg time: %f\n", total / fighters.size());
    }
}
