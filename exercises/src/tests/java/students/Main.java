package students;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.id = "2314922N ";
//        student1.name = "Antonio ";
//        student1.age = 17;
//
//        Student student2 = new Student();
//        student2.id = "092312J ";
//        student2.name = "Manuel ";
//        student2.age = 18;
//
//        System.out.println(student1.id + student1.name + student1.age);
//        System.out.println(student2.id + student2.name + student2.age);

        // Array for 3 more students
        Student[] students = new Student[3];

        Scanner scanner = new Scanner(System.in);

        // Read data
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(); // Object instance
            students[i].readData(scanner);
        }

        // Show data for each student
        for (Student student : students) {
            student.showData();
        }

        // Convert every name to uppercase
        for (Student student : students) {
            student.name = student.name.toUpperCase();
        }

        // Mostrar datos
        for (Student student : students) {
            student.showData();
        }

        scanner.close();
    }
}
