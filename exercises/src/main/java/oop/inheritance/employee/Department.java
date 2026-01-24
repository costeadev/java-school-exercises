package oop.inheritance.employee;

import java.time.LocalDate;
import java.util.Arrays;

public class Department {
    private static int NEXT_ID = 1;

    private final int id;
    private String name;
    private Employee[] employees;

    public Department(String name) {
        this.id = NEXT_ID++;
        this.name = name;
        employees = new Employee[0];
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Employee[] getEmployees() {
        return employees;
    }

    public Employee createEmployee(String name, double salary, LocalDate hireDate) {
        Employee e = new Employee(name, salary, hireDate);
        addEmployee(e);
        return e;
    }

    public void addEmployee(Employee e) {
        if (employeeExists(e.getId())) {
            throw new IllegalArgumentException("Employee already exists");
        }

        // Copy old array into a new array 1 space bigger
        employees = Arrays.copyOf(employees, employees.length + 1);

        // Add the new employee at the end
        employees[employees.length - 1] = e;
    }

    public void deleteEmployee(int id) {
        int index = indexOfEmployee(id);
        if (index == -1) {
            throw new IllegalArgumentException("Employee not found");
        }

        // Replace the element to delete with the last element
        employees[index] = employees[employees.length - 1];

        // Shrink array by 1
        employees = Arrays.copyOf(employees, employees.length - 1);
    }

    public Employee findEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public double calculateTotalSalary() {
        if (employees == null || employees.length == 0) {
            throw new UnsupportedOperationException("There must be at least 1 employee in the department");
        }
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total;
    }

    public String formatEmployees(String indent) {
        if (employees == null || employees.length == 0) {
            return indent + "- No employees yet\n";
        }
        StringBuilder sb = new StringBuilder();
        for (Employee e : employees) {
            sb.append(indent).append("- ").append(e).append("\n");
        }
        return sb.toString();
    }

    private boolean employeeExists(int id) {
        return findEmployeeById(id) != null;
    }

    private int indexOfEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return String.format("""
                Department: %s
                Employees:
                %s""", name, formatEmployees("  "));
    }
}
