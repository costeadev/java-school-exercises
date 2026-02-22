package oop.collections.schoolmanagement;

public class Enrollment {

    private static int NEXT_ID = 1;

    private final int id;
    private final Student student;
    private double grade;

    public Enrollment(Student student) {
        this.id = NEXT_ID++;
        this.student = student;
        this.grade = 0;
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Invalid grade");
        }
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Enrollment enrollment)) {
            return false;
        }

        return this.id == enrollment.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }

}
