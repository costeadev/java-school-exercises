package inheritance.employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private double salaryBonus;

    public Manager(String name, double salary, LocalDate hireDate, double salaryBonus) {
        super(name, salary, hireDate);
        this.salaryBonus = salaryBonus;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + salaryBonus;
    }

    @Override
    protected String extraInfo() {
        return String.format(" // Bonus: $%.2f", salaryBonus);
    }
}
