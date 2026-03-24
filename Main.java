//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//class Employee {
//    private String id;
//    private String name;
//    private String salary;
//
//    Employee(String id, String name, String salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getId() { return id; }
//    public String getName() { return name; }
//    public String getSalary() { return salary; }
//
//    public void setId(String id) { this.id = id; }
//    public void setName(String name) { this.name = name; }
//    public void setSalary(String salary) { this.salary = salary; }
//
//    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        List<Employee> list =  new ArrayList<>();
//        list.add(new Employee("1", "A", "1000"));
//        list.add(new Employee("2", "B", "2000"));
//        list.add(new Employee("3", "C", "30000"));
//        list.add(new Employee("4", "D", "4000"));
//
//        Employee max = list.get(0);
//        for(Employee e:list){
//            if(e.getSalary().compareTo(max.getSalary()) > 0){
//                max = e;
//            }
//        }
//        list.stream().max(Comparator.comparing(emp -> Integer.parseInt(emp.getSalary()))).ifPresent(System.out::println);
//    }
//}

import java.util.*;

class Student {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class Test {

    public static Student findTopStudent(ArrayList<Student> students) {

        // WRITE YOUR LOGIC HERE
        if (students == null || students.isEmpty()) return null;

        return students.stream()
                .max(Comparator.comparing(student -> student.marks))
                .orElse(null);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            String name = sc.next();
            double marks = sc.nextDouble();

            list.add(new Student(id,name,marks));
        }

        Student result = findTopStudent(list);

        if(result == null){
            System.out.println("No students found");
        } else {
            System.out.println("Top Student: " + result.name);
            System.out.println("Marks: " + result.marks);
        }

    }
}
