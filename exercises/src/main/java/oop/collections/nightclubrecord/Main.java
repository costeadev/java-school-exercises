package oop.collections.nightclubrecord;

import utils.Keyboard;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    static List<Nightclub> nightclubs = new ArrayList<>();

    public static void main(String[] args) {

        int option;
        do {
            mainMenu();
            option = Keyboard.readInt("Choose an option: ");
            switch (option) {
                case 1 -> createNightclub();
                case 2 -> addRecord();
                case 3 -> removeRecord();
                case 4 -> compareNightclubs();
                case 5 -> searchRecordsByAuthor();
                case 6 -> searchRecordsByTitle();
                case 0 -> System.out.println("bye bye");
                default -> System.err.println("Invalid option!");

            }
        } while (option != 0);
    }

    private static void createNightclub() {
        System.out.println("=== CREATING NIGHTCLUB ===");
        String theme = Keyboard.readString("Theme: ");
        nightclubs.add(new Nightclub(theme));
        System.out.println("[DEBUG] Nightclub succesfully created!");
    }

    private static void addRecord() {
        String theme = Keyboard.readString("Nightclub theme: ");
        Nightclub nightclub = findNightclubByTheme(theme);
        if (nightclub == null) {
            System.err.println("[ERROR] Nightclub not found");
            return;
        }
        String title = Keyboard.readString("Record title: ");
        String author = Keyboard.readString("Record author: ");

        try {
            nightclub.getRecords().add(new Record(author, title));
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.println("[DEBUG] Record added succesfully!");
    }

    private static void removeRecord() {
        String title = Keyboard.readString("Record title: ");
        String author = Keyboard.readString("Record author: ");
        Record toDelete = new Record(title, author);
        for (Nightclub n : nightclubs) {
            n.getRecords().removeIf(r -> r.equals(toDelete));
        }
    }

    private static void compareNightclubs() {
        Nightclub nightclub1 = findNightclubByTheme(Keyboard.readString("Nightclub 1 theme: "));
        Nightclub nightclub2 = findNightclubByTheme(Keyboard.readString("Nightclub 2 theme: "));

        assert nightclub1 != null;
        Set<Record> duplicates = new HashSet<>(nightclub1.getRecords());
        assert nightclub2 != null;
        duplicates.retainAll(nightclub2.getRecords());

        System.out.printf("%s nightclub: 1\n", nightclub1.getTheme());
        System.out.printf("%s nightclub: 2\n", nightclub2.getTheme());
        for (Record r : duplicates) {
            System.out.println(r + " is in both nightclubs!");
            int choice = Keyboard.readInt("Where do you want to remove the duplicate record? (1 or 2): ");
            switch (choice) {
                case 1 -> nightclub1.getRecords().remove(r);
                case 2 -> nightclub2.getRecords().remove(r);
                default -> System.err.println("Invalid option!");
            }
        }
    }

    private static void searchRecordsByAuthor() {
        Set<Record> recordsByAuthor = new HashSet<>();
        String author = Keyboard.readString("Author: ");
        for (Nightclub n : nightclubs) {
            for (Record r : n.getRecords()) {
                if (r.getAuthor().equals(author)) {
                    recordsByAuthor.add(r);
                }
            }
        }
        System.out.printf("=== Records by %s ===\n", author);
        for (Record r : recordsByAuthor) {
            System.out.println(r);
        }
    }

    private static void searchRecordsByTitle() {
        Set<Record> recordsByTitle = new HashSet<>();
        String title = Keyboard.readString("Title: ");
        for (Nightclub n : nightclubs) {
            for (Record r : n.getRecords()) {
                if (r.getTitle().equals(title)) {
                    recordsByTitle.add(r);
                }
            }
        }
        System.out.printf("=== Records with title <%s> ===\n", title);
        for (Record r : recordsByTitle) {
            System.out.println(r);
        }
    }

    private static Nightclub findNightclubByTheme(String theme) {
        for (Nightclub n : nightclubs) {
            if (n.getTheme().equals(theme)) return n;
        }
        return null;
    }

    private static void mainMenu() {
        System.out.println("""
                1. Create nightclub
                2. Add record to nightclub
                3. Remove record from all nightclubs
                4. Compare two nightclubs (and delete duplicates)
                5. Search records by author
                6. Search records by title
                0. Exit
                """);
    }
}
