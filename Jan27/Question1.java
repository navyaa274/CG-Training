package Jan27;
import java.util.Scanner;

class Student {
    int rollNo; String name; int age; String grade; Student next;
    Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo; this.name = name; this.age = age; this.grade = grade;
    }
}

public class Question1 {
    static Student head;

    static void addFirst(int rollNo, String name, int age, String grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = head; head = newNode;
    }

    static void addLast(int rollNo, String name, int age, String grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        if (head == null) { head = newNode; return; }
        Student temp = head; while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    static void delete(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) { head = head.next; return; }
        Student temp = head; while (temp.next != null && temp.next.rollNo != rollNo) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    static Student search(int rollNo) {
        Student temp = head; while (temp != null) {
            if (temp.rollNo == rollNo) return temp; temp = temp.next;
        } return null;
    }

    static void updateGrade(int rollNo, String grade) {
        Student s = search(rollNo);
        if (s != null) s.grade = grade;
    }

    static void display() {
        System.out.println("\nRollNo\tName\tAge\tGrade");
        Student temp = head; while (temp != null) {
            System.out.println(temp.rollNo + "\t" + temp.name + "\t" + temp.age + "\t" + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.AddFirst 2.AddLast 3.Delete 4.Search 5.UpdateGrade 6.Display 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("RollNo:"); int r1=sc.nextInt();sc.nextLine();
                    System.out.print("Name:"); String n1=sc.nextLine();
                    System.out.print("Age:"); int a1=sc.nextInt();sc.nextLine();
                    System.out.print("Grade:"); String g1=sc.nextLine();
                    addFirst(r1,n1,a1,g1); break;
                case 2: System.out.print("RollNo:"); int r2=sc.nextInt();sc.nextLine();
                    System.out.print("Name:"); String n2=sc.nextLine();
                    System.out.print("Age:"); int a2=sc.nextInt();sc.nextLine();
                    System.out.print("Grade:"); String g2=sc.nextLine();
                    addLast(r2,n2,a2,g2); break;
                case 3: System.out.print("RollNo:"); delete(sc.nextInt()); break;
                case 4: System.out.print("RollNo:"); Student s=search(sc.nextInt());
                    if(s!=null) System.out.println("Found: "+s.name); break;
                case 5: System.out.print("RollNo:"); int ur=sc.nextInt();sc.nextLine();
                    System.out.print("NewGrade:"); updateGrade(ur,sc.nextLine()); break;
                case 6: display(); break;
            }
        } while(choice!=0); sc.close();
    }
}