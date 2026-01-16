package Jan15.Level2Assignment;

/*
Q1: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.

 */

class Student {
    String name;
    int rollNumber;
    double marks;

    char getGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    void display() {
        System.out.printf("Name: %s, Roll: %d, Marks: %.1f, Grade: %c%n",
                name, rollNumber, marks, getGrade());
    }
}

public class Question1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.rollNumber = 123;
        s1.marks = 85.5;
        s1.display();

        Student s2 = new Student();
        s2.name = "Bob";
        s2.rollNumber = 124;
        s2.marks = 72.0;
        s2.display();
    }
}
