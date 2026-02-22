package oop.collections.schoolmanagement;

public class Student extends Person {

    private double grade;

    public Student(String id, String name) {
        super(id, name);
        grade = 0;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
