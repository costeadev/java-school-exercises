package oop.collections.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private static int NEXT_ID = 1;

    private final int id;
    private final String name;
    private final Professor headProfessor;
    private final List<Enrollment> enrollments;

    public Course(String name, Professor headProfessor) {
        id = NEXT_ID++;
        this.name = name;
        if (headProfessor == null) {
            throw new IllegalArgumentException("Professor doesn't exist");
        }
        this.headProfessor = headProfessor;
        enrollments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Professor getHeadProfessor() {
        return headProfessor;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment e) {
        if (e == null) {
            throw new IllegalArgumentException("Enrollment can't be null");
        }
        enrollments.add(e);
    }

    public Enrollment findEnrollmentByStudentId(String id) {
        for (Enrollment e : enrollments) {
            if (e.getStudent().getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Course course)) {
            return false;
        }

        return this.id == course.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}
