package oop.collections.schoolmanagement;

import utils.Keyboard;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        School school = bootstrapSchool();
        runApplication(school);
    }

    private static void runApplication(School school) {
        int option;
        do {
            mainMenu();
            option = Keyboard.readInt("Choose an option: ");
            switch (option) {
                case 1 -> createFlow(school);
                case 2 -> findFlow(school);
                case 3 -> enrollStudent(school);
                case 4 -> modifyGrade(school);
                case 0 -> System.out.println("Program finished");
                default -> System.err.println("Invalid option!");
            }
        } while (option != 0);
    }

    private static void createFlow(School school) {
        int option;
        do {
            System.out.println("=== CREATE MENU ===");
            nestedMenu();
            option = Keyboard.readInt("Choose an option");
            switch (option) {
                case 1 -> createStudentFlow(school);
                case 2 -> createProfessorFlow(school);
                case 3 -> createCourseFlow(school);
                case 0 -> System.out.println("Going back...");
                default -> System.err.println("Invalid option!");
            }
        } while (option != 0);
    }

    private static void createStudentFlow(School school) {
        System.out.println("--- CREATE STUDENT ---");
        String id = Keyboard.readString("ID: ");
        String name = Keyboard.readString("Name: ");
        try {
            school.getStudentRegistry().add(new Student(id, name));
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.printf("[DEBUG] Student succesfully created with ID (%s)\n", id);
    }

    private static void createProfessorFlow(School school) {
        System.out.println("--- CREATE PROFESSOR ---");
        String id = Keyboard.readString("ID: ");
        String name = Keyboard.readString("Name: ");
        try {
            school.getProfessorRegistry().add(new Professor(id, name));
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.printf("[DEBUG] Professor succesfully created with ID (%s)\n", id);
    }

    private static void createCourseFlow(School school) {
        System.out.println("--- CREATE COURSE ---");
        String name = Keyboard.readString("Name: ");
        String id = Keyboard.readString("ID of the head professor: ");

        Professor headProfessor = school.getProfessorRegistry().findByKey(id);
        Course course = new Course(name, headProfessor);

        try {
            school.getCourses().add(new Course(name, headProfessor));
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            return;
        }
        System.out.printf("[DEBUG] Course succesfully created with ID (%d)\n", course.getId());
    }

    private static void findFlow(School school) {
        int option;
        do {
            System.out.println("=== FIND MENU ===");
            nestedMenu();
            option = Keyboard.readInt("Choose an option");
            switch (option) {
                case 1 -> findStudentFlow(school);
                case 2 -> findProfessorFlow(school);
                case 3 -> findCourseFlow(school);
                case 0 -> System.out.println("Going back...");
                default -> System.err.println("Invalid option!");
            }
        } while (option != 0);
    }

    private static void findStudentFlow(School school) {
        System.out.println("--- FIND STUDENT ---");
        String id = Keyboard.readString("Student ID: ");
        Student student = school.getStudentRegistry().findByKey(id);
        if (student == null) {
            System.err.println("[ERROR] Student not found");
            return;
        }
        System.out.println("[DEBUG] Student found!:");
        System.out.println(student);
    }

    private static void findProfessorFlow(School school) {
        System.out.println("--- FIND PROFESSOR ---");
        String id = Keyboard.readString("Professor ID: ");
        Professor professor = school.getProfessorRegistry().findByKey(id);
        if (professor == null) {
            System.err.println("[ERROR] Professor not found");
            return;
        }
        System.out.println("[DEBUG] Professor found!:");
        System.out.println(professor);
    }

    private static void findCourseFlow(School school) {
        System.out.println("--- FIND COURSE ---");
        String name = Keyboard.readString("Course name: ");
        Course course = school.findCourseByName(name);
        if (course == null) {
            System.err.println("[ERROR] Course not found");
            return;
        }
        System.out.println("[DEBUG] Course found!:");
        System.out.println(course);
    }

    private static void enrollStudent(School school) {
        String studentId = Keyboard.readString("Student ID: ");
        String courseName = Keyboard.readString("Course name: ");
        Student student = school.getStudentRegistry().findByKey(studentId);
        if (student == null) {
            System.err.println("[ERROR] Student not found");
            return;
        }
        Course course = school.findCourseByName(courseName);
        if (course == null) {
            System.err.println("[ERROR] Course not found");
            return;
        }

        try {
            school.enroll(course, student);
        } catch (Exception e) {
            System.err.println("[ERROR]: " + e.getMessage());
            return;
        }
        System.out.println("[DEBUG] Student succesfully enrolled!");
    }

    private static void modifyGrade(School school) {
        Course course = school.findCourseByName(Keyboard.readString("Course name: "));
        String studentId = Keyboard.readString("Student ID: ");
        double grade = Keyboard.readDouble("Grade: ");
        Enrollment enrollment = null;
        for (Course c : school.getCourses()) {
            enrollment = course.findEnrollmentByStudentId(studentId);
        }
        if (enrollment == null) {
            System.err.println("[ERROR] Enrollment not found");
            return;
        }
        enrollment.setGrade(grade);
    }

    private static void mainMenu() {
        System.out.println("""
                === SCHOOL MENU ===
                1. Create
                2. Find
                3. Enroll student
                4. Modify grades
                0. Exit
                """);
    }

    private static void nestedMenu(){
        System.out.println("""
                1. Student
                2. Professor
                3. Course
                0. Go back
                """);
    }

    private static School bootstrapSchool() {
        School school = new School();
        ProfessorRegistry professorRegistry = school.getProfessorRegistry();
        StudentRegistry studentRegistry = school.getStudentRegistry();

        professorRegistry.add(new Professor("123A", "Jerry Gomez"));
        professorRegistry.add(new Professor("456B", "Susan Chavez"));
        professorRegistry.add(new Professor("789C", "John Smith"));

        school.getCourses().add(new Course("Math", professorRegistry.findByKey("123A")));
        school.getCourses().add(new Course("Physics", professorRegistry.findByKey("456B")));
        school.getCourses().add(new Course("Programming", professorRegistry.findByKey("789C")));

        studentRegistry.add(new Student("333X", "Jimmy Doe"));
        studentRegistry.add(new Student("444Y", "Percy Travis"));
        studentRegistry.add(new Student("555Z", "Ronald Dump"));

        school.enroll(school.findCourseByName("Math"), studentRegistry.findByKey("333X"));
        school.enroll(school.findCourseByName("Physics"), studentRegistry.findByKey("444Y"));
        school.enroll(school.findCourseByName("Programming"), studentRegistry.findByKey("555Z"));

        return school;
    }
}