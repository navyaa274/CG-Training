package Jan15.Level1Assignment;

/*
Q1:  Write a program to create an Employee class with attributes name, id, and salary.
Add a method to display the details.
 */

class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "John Doe";
        emp1.id = 101;
        emp1.salary = 50000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.name = "Jane Smith";
        emp2.id = 102;
        emp2.salary = 60000;
        emp2.display();
    }

}
