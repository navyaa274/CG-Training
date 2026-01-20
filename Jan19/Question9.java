package Jan19;

public class Question9 {
    public static void main(String[] args) {
        Person[] members = {
                new Teacher("Mr. Smith", 35, "Mathematics"),
                new Student("Jane Doe", 16, 10),
                new Staff("Ms. Brown", 42, "Administration")
        };

        for (Person person : members) {
            person.displayRole();
            System.out.println();
        }
    }
}

class Person {
    protected String name; protected int age;
    public Person(String name, int age) {
        this.name = name; this.age = age;
    }
    public void displayRole() {
        System.out.println("Person: " + name + " (Age: " + age + ")");
    }
}

class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age); this.subject = subject;
    }
    @Override public void displayRole() {
        super.displayRole();
        System.out.println("Role: Teacher | Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age); this.grade = grade;
    }
    @Override public void displayRole() {
        super.displayRole();
        System.out.println("Role: Student | Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;
    public Staff(String name, int age, String dept) {
        super(name, age); this.department = dept;
    }
    @Override public void displayRole() {
        super.displayRole();
        System.out.println("Role: Staff | Department: " + department);
    }
}