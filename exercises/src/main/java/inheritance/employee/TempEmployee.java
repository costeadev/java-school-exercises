package inheritance.employee;

import java.time.LocalDate;

public class TempEmployee extends Employee {
    private LocalDate termDate;

    public TempEmployee(String name, double salary, LocalDate hireDate, LocalDate termDate) {
        super(name, salary, hireDate);
        this.termDate = termDate;
    }

    public LocalDate getTermDate() {
        return termDate;
    }

    @Override
    protected String extraInfo() {
        return String.format(" // Leaves on: [%s]", termDate);
    }
}
