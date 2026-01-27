package Jan27;

import java.util.Scanner;

class Task {
    int taskId; String name, priority, dueDate; Task next;
    Task(int taskId, String name, String priority, String dueDate) {
        this.taskId = taskId; this.name = name; this.priority = priority; this.dueDate = dueDate;
    }
}

public class Question3 {
    static Task head;

    static void addLast(int id, String name, String priority, String dueDate) {
        Task node = new Task(id, name, priority, dueDate);
        if (head == null) { head = node; head.next = head; return; }
        Task temp = head; while (temp.next != head) temp = temp.next;
        temp.next = node; node.next = head;
    }

    static void remove(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            if (head.next == head) { head = null; return; }
            Task temp = head; while (temp.next != head) temp = temp.next;
            head = head.next; temp.next = head; return;
        }
        Task temp = head; while (temp.next != head && temp.next.taskId != id) temp = temp.next;
        if (temp.next != head) temp.next = temp.next.next;
    }

    static void searchPriority(String priority) {
        if (head == null) return;
        Task temp = head; do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println(temp.taskId + ": " + temp.name);
            } temp = temp.next;
        } while (temp != head);
    }

    static Task currentTask() { return head; }
    static Task nextTask() { if (head != null) head = head.next; return head; }

    static void display() {
        if (head == null) { System.out.println("Empty!"); return; }
        Task temp = head; do {
            System.out.println(temp.taskId + "|" + temp.name + "|" + temp.priority + "|" + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.Add 2.Remove 3.SearchPriority 4.Current 5.Next 6.Display 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("ID:"); int id=sc.nextInt();sc.nextLine();
                    System.out.print("Name:"); String n=sc.nextLine();
                    System.out.print("Priority:"); String p=sc.nextLine();
                    System.out.print("DueDate:"); String d=sc.nextLine();
                    addLast(id,n,p,d); break;
                case 2: System.out.print("ID:"); remove(sc.nextInt()); break;
                case 3: System.out.print("Priority:"); searchPriority(sc.nextLine()); break;
                case 4: Task ct = currentTask();
                    if(ct!=null) System.out.println("Current: " + ct.name); break;
                case 5: Task nt = nextTask();
                    if(nt!=null) System.out.println("Next: " + nt.name); break;
                case 6: display(); break;
            }
        } while(choice!=0); sc.close();
    }
}