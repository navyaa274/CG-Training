package Jan22.ObjectModeling;
import java.util.*;

public class CompDepEmp {
    public static void main(String[] args) {
        Company cmp = new Company("TechCorp");
        Department dept = cmp.createDepartment("IT");

        dept.addEmployee(new Employee("Alice"));
        dept.addEmployee(new Employee("Bob"));

        Department dept2 = cmp.createDepartment("HR");

        dept2.addEmployee(new Employee("Jhon"));
        dept2.addEmployee(new Employee("Harry"));

        cmp.showStructure();
        System.out.println("Destroying company...");
        cmp.destroy();
        cmp.showStructure();  // Now empty
    }
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void destroy() {
        employees.clear();
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    Department createDepartment(String dname) {
        Department d = new Department(dname);
        departments.add(d);
        return d;
    }

    void destroy() {
        for (Department d : departments) {
            d.destroy();
        }
        departments.clear();
    }

    void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            System.out.println(" Department: " + d.name);
            for (Employee e : d.employees) {
                System.out.println("  Employee: " + e.name);
            }
        }
    }
}