package Jan20;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===");
        Employee[] employees = {
                new FullTimeEmployee(1, "John FullTime", 50000),
                new PartTimeEmployee(2, "Jane PartTime", 25, 40)
        };
        for (Employee e : employees) {
            e.displayDetails();
            ((Department) e).assignDepartment("IT");
        }
        System.out.println();
    }
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: $" + calculateSalary());
    }

    // Getters and setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}

interface Department {
    default void assignDepartment(String dept) {
        System.out.println("Assigned to: " + dept);
    }
}

class FullTimeEmployee extends Employee implements Department {
    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee implements Department {
    private double hours;

    public PartTimeEmployee(int id, String name, double baseSalary, double hours) {
        super(id, name, baseSalary);
        this.hours = hours;
    }

    public double calculateSalary() {
        return getBaseSalary() * hours;
    }

    public double getHours() { return hours; }
    public void setHours(double hours) { this.hours = hours; }
}