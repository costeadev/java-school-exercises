package oop.collections.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class School {

    private final StudentRegistry studentRegistry;
    private final ProfessorRegistry professorRegistry;
    private final List<Course> courses;

    public School() {
        studentRegistry = new StudentRegistry();
        professorRegistry = new ProfessorRegistry();
        courses = new ArrayList<>();
    }

    public StudentRegistry getStudentRegistry() {
        return studentRegistry;
    }

    public ProfessorRegistry getProfessorRegistry() {
        return professorRegistry;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course, Student student) {
        course.addEnrollment(new Enrollment(student));
    }

    public Course findCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return course;
            }
        }
        return null;
    }
}
