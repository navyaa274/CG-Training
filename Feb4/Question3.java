package Feb4;
import java.util.*;

abstract class CourseType {
    protected String evalType;

    public CourseType(String evalType) {
        this.evalType = evalType;
    }

    public String getEvalType() {
        return evalType;
    }

    public abstract double calculateGrade(int score);
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }

    @Override
    public double calculateGrade(int score) {
        return score * 0.7;
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }

    @Override
    public double calculateGrade(int score) {
        return score * 0.8;
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }

    @Override
    public double calculateGrade(int score) {
        return score * 0.9;
    }
}

class Course<T extends CourseType> {
    private String name;
    private T type;

    public Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public T getType() {
        return type;
    }
}

public class Question3 {

    public static void processCourses(List<? extends CourseType> courses) {
        for (CourseType ct : courses) {
            System.out.println(ct.getEvalType() + " course, grade(80) = " +
                    ct.calculateGrade(80));
        }
    }

    public static void main(String[] args) {
        List<CourseType> list = new ArrayList<>();
        list.add(new ExamCourse());
        list.add(new AssignmentCourse());
        list.add(new ResearchCourse());

        processCourses(list);
    }
}