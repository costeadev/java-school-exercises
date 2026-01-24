package inheritance.employee;

import utils.Keyboard;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company company = bootstrapCompany();
        runApplication(company);
    }

    private static Company bootstrapCompany() {
        Company company = new Company("Allsafe");

        Department cybersecurity = new Department("Cybersecurity");
        Department it = new Department("IT");
        Department hr = new Department("HR");
        Department finance = new Department("Finance");

        company.addDepartment(cybersecurity);
        company.addDepartment(it);
        company.addDepartment(hr);
        company.addDepartment(finance);

        cybersecurity.createEmployee("Elliot", 2000, LocalDate.of(2015, 1, 1));

        return company;
    }

    private static void runApplication(Company company) {
        int mainOption;
        do {
            printMainMenu();
            mainOption = Keyboard.readInt("Choose an option: ");

            switch(mainOption) {
                case 1 -> showCreateMenu(company);
                case 2 -> showDeleteMenu(company);
                case 3 -> showDisplayMenu(company);
                case 0 -> System.out.println("Bye bye... 👋🌊");
                default -> System.err.println("Invalid option");
            }

        } while(mainOption != 0);
    }

    private static void printMainMenu() {
        System.out.println("""
                \n=== MAIN MENU ===
                1. Create
                2. Delete
                3. List / Show
                0. Exit""");
    }

    private static void showCreateMenu(Company company) {
        int createOption;
        do {
            System.out.println("""
                    \n=== CREATE MENU ===
                    1. Employee
                    2. Department
                    0. Back""");
            createOption = Keyboard.readInt("Choose an option: ");

            switch(createOption) {
                case 1 -> createEmployeeFlow(company);
                case 2 -> createDepartmentFlow(company);
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.err.println("Invalid option");
            }
        } while(createOption != 0);
    }

    private static void createEmployeeFlow(Company company) {
        System.out.println("\n=== CREATE EMPLOYEE ===");
        String name = Keyboard.readString("Name: ");
        double salary = Keyboard.readDouble("Salary: ");
        LocalDate hireDate = LocalDate.of(
                Keyboard.readInt("Year: "),
                Keyboard.readInt("Month: "),
                Keyboard.readInt("Day: ")
        );

        Department department = company.findDepartmentById(Keyboard.readInt("Department ID: "));
        department.createEmployee(name, salary, hireDate);
        System.out.println("Employee created!");
    }

    private static void createDepartmentFlow(Company company) {
        System.out.println("\n=== CREATE DEPARTMENT ===");
        String name = Keyboard.readString("Name: ");
        company.createDepartment(name);
        System.out.println("Department created!");
    }

    private static void showDeleteMenu(Company company) {
        int deleteOption;
        do {
            System.out.println("""
                \n1. Employee
                2. Department
                0. Back""");
            deleteOption = Keyboard.readInt("Choose an option: ");

            switch(deleteOption) {
                case 1 -> deleteEmployeeFlow(company);
                case 2 -> deleteDepartmentFlow(company);
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.err.println("Invalid option");
            }
        } while(deleteOption != 0);
    }

    private static void deleteEmployeeFlow(Company company) {
        System.out.println("\n=== DELETE EMPLOYEE FROM A DEPARTMENT ===");

        Department department = company.findDepartmentById(Keyboard.readInt("Department ID: "));

        department.deleteEmployee(Keyboard.readInt("Employee ID: "));
        System.out.println("Employee deleted!");
    }

    private static void deleteDepartmentFlow(Company company) {
        System.out.println("\n=== DELETE DEPARTMENT ===");

        company.deleteDepartment(Keyboard.readInt("Department ID: "));
        System.out.println("Department deleted!");
    }

    private static void showDisplayMenu(Company company) {
        int displayOption;
        do {
            System.out.println("""
                    \n=== DISPLAY MENU ===
                    1. Employee
                    2. Department
                    3. Company
                    0. Back
                    """);
            displayOption = Keyboard.readInt("Choose an option: ");

            switch(displayOption) {
                case 1 -> displayEmployeeFlow(company);
                case 2 -> displayDepartmentFlow(company);
                case 3 -> System.out.println(company);
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.err.println("Invalid option");
            }
        } while(displayOption != 0);
    }

    private static void displayEmployeeFlow(Company company) {
        System.out.println("\n=== DISPLAY EMPLOYEE ===");

        Department department = company.findDepartmentById(Keyboard.readInt("Department ID: "));
        Employee employee = department.findEmployeeById(Keyboard.readInt("Employee ID: "));

        System.out.println(employee);
    }

    private static void displayDepartmentFlow(Company company) {
        System.out.println("\n=== DISPLAY DEPARTMENT ===");

        Department department = company.findDepartmentById(Keyboard.readInt("Department ID: "));

        System.out.println(department);
    }
}
