package basics.arrays;

import oop.inheritance.pacientehospital.Paciente;

import java.util.Scanner;

public class Ex28 {

    static String[] students = new String[0];
    static int[] grades = new int[0];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            printMenu();
            System.out.print("Choose an option: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1 -> addStudentFlow(scan);
                case 2 -> deleteStudentFlow(scan);
                case 3 -> findStudentFlow(scan);
                case 0 -> {
                    System.out.println("Ba bai ✌");
                }
            }
        } while (option != 0);
        scan.close();
    }

    private static void printMenu() {
        System.out.println("""
                1. Add student
                2. Delete student
                3. Find student
                0. Exit
                """);
    }

    private static void addStudentFlow(Scanner scan) {
        System.out.print("Student: ");
        String student = scan.nextLine();

        int grade;
        do {
            System.out.print("Grade: ");
            grade = scan.nextInt();
            scan.nextLine();
        } while (!isValidGrade(grade));

        try {
            addStudent(student);
            addGrade(grade);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Student added succesfully!\n");
    }

    private static void deleteStudentFlow(Scanner scan) {
        System.out.print("Student: ");
        String student = scan.nextLine();
        try {
            int deleteIndex = getStudentIndex(student);
            deleteStudent(deleteIndex);
            deleteGrade(deleteIndex);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.println("Student deleted succesfully!\n");
    }

    private static void findStudentFlow(Scanner scan) {
        System.out.print("Student: ");
        String student = scan.nextLine();

        int index = getStudentIndex(student);

        if (index == -1) {
            System.err.println("\nError: Student not found\n");
            return;
        }

        System.out.println("\nStudent found!");
        System.out.println("==============");
        System.out.printf("""
                Student: %s
                Grade: %d
                """, students[index], grades[index]);
        System.out.println("==============\n");
    }

    private static void addStudent(String student) {
        if (getStudentIndex(student) != -1) {
            throw new IllegalArgumentException("Student already exists");
        }

        String[] newStudents = new String[students.length + 1];
        // Copy array to new array
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }

        // Append new student to the last position in the array
        newStudents[students.length] = student;
        students = newStudents;
    }

    private static void addGrade(int grade) {

        int[] newGrades = new int[grades.length + 1];
        // Copy array to new array
        for (int i = 0; i < grades.length; i++) {
            newGrades[i] = grades[i];
        }

        // Append new grade to the last position in the array
        newGrades[grades.length] = grade;
        grades = newGrades;
    }

    private static void deleteStudent(int deleteIndex) {
        if (students.length == 0) {
            throw new RuntimeException("Students is empty");
        }

        if (deleteIndex == -1) {
            throw new RuntimeException("Student not found");
        }

        // Shift all elements left
        for (int i = deleteIndex; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        String[] newStudents = new String[students.length - 1];
        // Copy array
        for (int i = 0; i < newStudents.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }

    private static void deleteGrade(int deleteIndex) {
        if (grades.length == 0) {
            throw new RuntimeException("Grades is empty");
        }

        if (deleteIndex == -1) {
            throw new IndexOutOfBoundsException("Grade not found");
        }

        // Shift all elements left
        for (int i = deleteIndex; i < grades.length - 1; i++) {
            grades[i] = grades[i + 1];
        }

        int[] newGrades = new int[grades.length - 1];
        // Copy array
        for (int i = 0; i < newGrades.length; i++) {
            newGrades[i] = grades[i];
        }
        grades = newGrades;
    }

    private static int getStudentIndex(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 10;
    }
}
