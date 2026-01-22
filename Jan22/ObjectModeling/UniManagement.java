package Jan22.ObjectModeling;
import java.util.*;

public class UniManagement {
    public static void main(String[] args) {
        StudentUM s = new StudentUM("Neha");
        CourseUM c = new CourseUM("Java");
        ProfessorUM p = new ProfessorUM("Prof. Kaur");

        p.assignProfessor(c);
        s.enrollCourse(c);

        System.out.println(s.name + " enrolled in " + c.name + " taught by " + c.professor.name);
    }
}

class ProfessorUM {
    String name;
    List<CourseUM> courses = new ArrayList<>();

    ProfessorUM(String name) {
        this.name = name;
    }

    void assignProfessor(CourseUM c) {
        if (!courses.contains(c)) {
            courses.add(c);
        }
        c.professor = this;
    }
}

class CourseUM {
    String name;
    List<StudentUM> students = new ArrayList<>();
    ProfessorUM professor;

    CourseUM(String name) {
        this.name = name;
    }

    void enrollStudent(StudentUM s) {
        if (!students.contains(s)) {
            students.add(s);
        }
        if (!s.courses.contains(this)) {
            s.courses.add(this);
        }
    }
}

class StudentUM {
    String name;
    List<CourseUM> courses = new ArrayList<>();

    StudentUM(String name) {
        this.name = name;
    }

    void enrollCourse(CourseUM c) {
        c.enrollStudent(this);
    }
}