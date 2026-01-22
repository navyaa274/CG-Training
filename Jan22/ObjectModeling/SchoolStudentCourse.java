package Jan22.ObjectModeling;
import java.util.*;

public class SchoolStudentCourse {
    public static void main(String[] args) {
        School school = new School("Chitkara School");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Priya");

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        s1.viewCourses();
        s2.viewCourses();
        c1.showStudents();
        c2.showStudents();
    }
}

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enrollStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
        if (!s.courses.contains(this)) {
            s.courses.add(this);
        }
    }

    void showStudents() {
        System.out.print(name + " students: ");
        for (Student s : students) {
            System.out.print(s.name + " ");
        }
        System.out.println();
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void viewCourses() {
        System.out.print(name + " courses: ");
        for (Course c : courses) {
            System.out.print(c.name + " ");
        }
        System.out.println();
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}