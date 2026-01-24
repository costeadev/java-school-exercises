# Company Management App

## Overview
Simple Java console application to manage employees, departments, and salaries using OOP principles.

---

## Design decisions

- Each entitiy (`Employee`, `Department`, `Company`) has an auto-generated numeric ID.
- IDs are assigned automatically when the object is created.
- IDs are unique per class and managed internally.
- The user does not input IDs manually.
- ID generation is handled using a static counter (`NEXT_ID`) inside each class.

---

## Class Model

### Employee
Represents a generic employee of the company.

**Responsibilities:**
- Store employee personal data
- Provide salary information
- Own a unique auto-generated identifier

**Attributes:**
- `id` : int - unique identifier (auto-generated)
- `name` : String
- `salary` : double
- `hireDate` : LocalDate

**Methods:**
- `getSalary()` : double

---

### Manager (extends Employee)
Represents an employee with an additional salary bonus.

**Responsibilities:**
- Extend `Employee` salary logic with a bonus.

**Attributes:** 
- `salaryBonus` : double

---

### TempEmployee (extends Employee)
Represents an employee with limited-time contract.

**Responsibilities:**
- Store contract termination date.

**Attributes:**
- `termDate` : LocalDate

---

### Department
Groups employees and calculates department-level salary.

**Responsibilities:**
- Create and delete employees and store them in a collection.
- Calculate total salary of its employees.

**Attributes:**
- `id` : int - unique identifier (auto-generated)
- `name` : String
- `employees` : Employee[]

**Methods:**
- `createEmployee(String name, double salary, LocalDate hireDate)`: Employee
- `addEmployee(Employee e)` : void
- `deleteEmployee(int id)`; : void
- `calculateTotalSalary()` : double

---

### Company
Aggregates departments and provides global salary logic.

**Responsibilities:**
- Create and delete departments and store them in a collection.
- Calculate company-wide salary.
- Identify the department with the highest salary.

**Attributes:**
- `id` : int - unique identifier (auto-generated)
- `name` : String
- `departments` : Department[]
 
**Methods:**
- `createDepartment(String name)` : Department
- `addDepartment(Department d)` : void
- `deleteDepartment(int id)` : void
- `calculateTotalSalary()` : double
- `getDepartmentHighestSalary()` : Department

---

## Application Flow

1. The application starts and bootstraps an initial company with default departments.
2. The main menu is displayed to the user.
3. The user selects options and navigates through submenus:
    - Create new entities (Employee, Department, Company)
    - Delete entities (recursive)
    - Show lists or summaries (Employees, Departments, Company info)
4. The program loops until the user chooses the exit option (`0`)

### Main Menu

=== MAIN MENU ===
1. *Create* -> lets the user create Employees, Departments, or Companies.
2. *Delete* -> removes entities recursively if needed.
3. *List / Show* -> displays information about existing entities.
0. *Exit* -> finishes the program.

> Note: Menus are implemented in separate methods (`printMainMenu()`, `printCreateMenu()`, etc.)
to keep the `main()` method clean and maintainable. 
The bootstrap method (`bootstrapCompany()`) initializes the starting company and departments.

---

## How to Run
Compile and run the Main class.