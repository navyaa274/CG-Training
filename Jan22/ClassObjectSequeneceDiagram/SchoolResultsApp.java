package Jan22.ClassObjectSequeneceDiagram;
import java.util.*;

public class SchoolResultsApp {
    public static void main(String[] args) {
        // Create student and subjects
        StudentResult john = new StudentResult("John", 1);
        john.addSubject(new SubjectResult("Maths", 90));
        john.addSubject(new SubjectResult("Science", 85));

        // Grade calculator
        GradeCalculator calculator = new GradeCalculator();

        double total = calculator.calculateTotal(john);
        double average = calculator.calculateAverage(john);
        char grade = calculator.calculateGrade(average);

        System.out.println("Student: " + john.getName());
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

// Aggregation: Student has many SubjectResult
class StudentResult {
    private String name;
    private int rollNo;
    private List<SubjectResult> subjects = new ArrayList<>();

    public StudentResult(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void addSubject(SubjectResult subject) {
        subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public List<SubjectResult> getSubjects() {
        return subjects;
    }
}

class SubjectResult {
    private String name;
    private double marks;

    public SubjectResult(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

// Service-like class that uses StudentResult
class GradeCalculator {

    public double calculateTotal(StudentResult student) {
        double sum = 0;
        for (SubjectResult s : student.getSubjects()) {
            sum += s.getMarks();
        }
        return sum;
    }

    public double calculateAverage(StudentResult student) {
        if (student.getSubjects().isEmpty()) {
            return 0;
        }
        return calculateTotal(student) / student.getSubjects().size();
    }

    public char calculateGrade(double average) {
        if (average >= 80) return 'A';
        else if (average >= 60) return 'B';
        else if (average >= 40) return 'C';
        else return 'D';
    }
}