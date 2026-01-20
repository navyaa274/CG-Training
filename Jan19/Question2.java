package Jan19;

public class Question2 {
    public static void main(String[] args) {
        Employee[] staff = {
                new Manager("Alice", "M001", 80000, 10),
                new Developer("Bob", "D001", 65000, "Java"),
                new Intern("Carol", "I001", 20000, "Alice")
        };

        for (Employee emp : staff) {
            emp.displayDetails();
            System.out.println();
        }
    }
}

abstract class Employee {
    protected String name, id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name; this.id = id; this.salary = salary;
    }
    public abstract void displayDetails();
}

class Manager extends Employee {
    private int teamSize;
    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary); this.teamSize = teamSize;
    }
    @Override public void displayDetails() {
        System.out.println("Manager: " + name + " (ID:" + id + ") | Salary: $" + salary + " | Team: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, String id, double salary, String lang) {
        super(name, id, salary); this.programmingLanguage = lang;
    }
    @Override public void displayDetails() {
        System.out.println("Developer: " + name + " (ID:" + id + ") | Salary: $" + salary + " | Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String mentor;
    public Intern(String name, String id, double salary, String mentor) {
        super(name, id, salary); this.mentor = mentor;
    }
    @Override public void displayDetails() {
        System.out.println("Intern: " + name + " (ID:" + id + ") | Salary: $" + salary + " | Mentor: " + mentor);
    }
}