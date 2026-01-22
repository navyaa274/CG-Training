package Jan22.ObjectModeling;
import java.util.*;

public class UniDepFaculty {
    public static void main(String[] args) {
        University uni = new University("Chitkara Uni");

        Faculty f1 = new Faculty("Dr. Singh");
        Faculty f2 = new Faculty("Dr. Kaur");
        Faculty f3 = new Faculty("Dr. Sharma");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        DepartmentUni d1 = uni.createDepartment("CS");
        DepartmentUni d2 = uni.createDepartment("ECE");

        d1.addFaculty(f1);
        d2.addFaculty(f2);
        d1.addFaculty(f3);

        uni.showStructure();
        System.out.println("Destroying university...");
        uni.destroy();
        uni.showStructure();  // Departments cleared, faculty list still there
    }
}

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class DepartmentUni {
    String name;
    List<Faculty> faculty = new ArrayList<>();

    DepartmentUni(String name) {
        this.name = name;
    }

    void addFaculty(Faculty f) {
        faculty.add(f);
    }

    void destroy() {
        faculty.clear();
    }
}

class University {
    String name;
    List<DepartmentUni> departments = new ArrayList<>();
    List<Faculty> faculty = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    DepartmentUni createDepartment(String dname) {
        DepartmentUni d = new DepartmentUni(dname);
        departments.add(d);
        return d;
    }

    void addFaculty(Faculty f) {
        faculty.add(f);
    }

    void destroy() {
        for (DepartmentUni d : departments) {
            d.destroy();
        }
        departments.clear();      // Departments removed
        // Faculty still exists independently
    }

    void showStructure() {
        System.out.println("University: " + name);
        System.out.println(" Departments:");
        for (DepartmentUni d : departments) {
            System.out.print("  " + d.name + " (faculty: ");
            for (Faculty f : d.faculty) {
                System.out.print(f.name + " ");
            }
            System.out.println(")");
        }
        System.out.print(" All Faculty objects: ");
        for (Faculty f : faculty) {
            System.out.print(f.name + " ");
        }
        System.out.println();
    }
}