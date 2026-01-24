package inheritance.employee;

import java.util.Arrays;

public class Company {
    private static int NEXT_ID = 1;

    private final int id;
    private String name;
    private Department[] departments;

    public Company(String name) {
        this.id = NEXT_ID++;
        this.name = name;
        departments = new Department[0];
    }

    public Department createDepartment(String name) {
        Department d = new Department(name);
        addDepartment(d);
        return d;
    }

    public void addDepartment(Department d) {
        if (departmentExists(d.getId())) {
            throw new IllegalArgumentException("Department already exists");
        }

        // Copy old array into a new array 1 space bigger
        departments = Arrays.copyOf(departments, departments.length + 1);

        // Add the new employee at the end
        departments[departments.length - 1] = d;
    }

    public void deleteDepartment(int id) {
        int index = indexOfDepartment(id);

        if (index == -1) {
            throw new IllegalArgumentException("Employee not found");
        }

        // Replace the element to delete with the last one
        departments[index] = departments[departments.length - 1];

        // Shrink the array by one space
        departments = Arrays.copyOf(departments, departments.length - 1);
    }

    public double calculateTotalSalary() {
        if (departments == null || departments.length == 0) {
            throw new UnsupportedOperationException("There must be at least 1 department");
        }
        double total = 0;
        for (Department d : departments) {
            total += d.calculateTotalSalary();
        }
        return total;
    }

    public Department getDepartmentHighestSalary() {
        if (departments == null || departments.length == 0) {
            throw new UnsupportedOperationException("There must be at least 1 department");
        }

        Department highestSalary = departments[0]; // We assume the highest is the first department's

        for (Department d : departments) {
            if (d.calculateTotalSalary() > highestSalary.calculateTotalSalary()) {
                highestSalary = d;
            }
        }

        return highestSalary;
    }

    public Department findDepartmentById(int id) {
        for (Department d : departments) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    public Department findDepartmentByName(String name) {
        for (Department d : departments) {
            if (d.getName().equals(name)) return d;
        }
        return null;
    }

    private boolean departmentExists(int id) {
        return findDepartmentById(id) != null;
    }

    private int indexOfDepartment(int id) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getId() == id) return i;
        }
        return -1;
    }

    private String formatDepartments(String indent) {
        if (departments == null || departments.length == 0) {
            return indent + "- No departments yet\n";
        }
        StringBuilder sb = new StringBuilder();
        for (Department d : departments) {
            sb.append(indent).append("- ").append(d.getName()).append("\n");
            sb.append(d.formatEmployees(indent + " "));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("""
                Company: %s
                Departments:
                %s""", name, formatDepartments("  ").trim());
    }
}
