package oop.collections.nameidlookup;

import utils.Keyboard;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Set<String>> people = new HashMap<>(); // <Name, ID list for that name>

        addPerson(people, "paco", "123A");
        addPerson(people, "paco", "321B");
        addPerson(people, "bob esponja", "923X");
        addPerson(people, "paco", "910T");
        addPerson(people, "samuel de luque", "777V");


        String name;
        while (true) {
            name = Keyboard.readString("Enter a name: ").trim().toLowerCase();

            if (name.equalsIgnoreCase("end")) break;

            if (people.get(name) == null) {
                System.err.println("The person doesn't exist");
            } else {
                for (String id : people.get(name)) {
                    System.out.printf("- %s [%s]%n", name, id);
                }
            }
        }
    }

    private static void addPerson(Map<String, Set<String>> people,
                                  String name,
                                  String id) {
        Set<String> ids = people.computeIfAbsent(name, k -> new HashSet<>());
        ids.add(id);
    }
}

