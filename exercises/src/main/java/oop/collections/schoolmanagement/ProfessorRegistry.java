package oop.collections.schoolmanagement;

import java.util.Optional;

public class ProfessorRegistry extends Registry<Professor> {

    @Override
    public Professor findByKey(String id) {
        for (Professor p : items) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean removeById(String id, School school) {

        Professor professor = findByKey(id);

        if (professor == null) {
            throw new IllegalArgumentException("Can't remove professor: Professor not found");
        }

        // Remove courses the teacher teached
        school.getCourses().removeIf(course -> course.getHeadProfessor().equals(professor));

        // Remove professor from registry
        remove(professor);

        return true;
    }
}
