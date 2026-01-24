package students;

import java.util.Scanner;

public class Student {
    String id;
    String name;
    int age;


    public void readData(Scanner scanner) {
        System.out.print("ID: ");
        id = scanner.nextLine();

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Age: ");
        age = Integer.parseInt(scanner.nextLine());
    }

    public void showData() {
        System.out.printf("\n\nID: %s", id);
        System.out.printf("\nName: %s", name);
        System.out.printf("\nAge: %s", age);
    }

    public void uppercase() {
        name = name.toUpperCase();
    }
}
