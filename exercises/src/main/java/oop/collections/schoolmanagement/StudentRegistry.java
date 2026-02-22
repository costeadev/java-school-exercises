package oop.collections.schoolmanagement;

import java.util.Optional;

public class StudentRegistry extends Registry<Student> {

    @Override
    public Student findByKey(String id) {
        for (Student student : items) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean removeById(String id, School school) {

        Student student = findByKey(id);

        if (student == null) {
            throw new IllegalArgumentException("Can't remove student: Student not found");
        }

        // Remove student from enrollments in courses he is enrolled in
        for (Course course : school.getCourses()) {
            course.getEnrollments().removeIf(enr -> enr.getStudent().equals(student));
        }

        // Remove from registry
        remove(student);

        return true;
    }
}
