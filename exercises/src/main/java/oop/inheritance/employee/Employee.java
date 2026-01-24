package oop.inheritance.employee;

import java.time.LocalDate;

public class Employee {
    private static int NEXT_ID = 1;

    private final int id;
    private final String name;
    private final double salary;
    private final LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.id = NEXT_ID++;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return String.format(
                "(ID: %d) Name: %s // Salary: $%.2f // Hired on: [%s]%s",
                id, name, salary, hireDate, extraInfo()
        );
    }

    protected String extraInfo() {
        return "";
    }
}
