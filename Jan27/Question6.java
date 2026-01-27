package Jan27;

import java.util.Scanner;

class Process {
    int pid, burstTime, remainingTime, priority; Process next;
    Process(int pid, int burstTime, int priority) {
        this.pid = pid; this.burstTime = burstTime; this.remainingTime = burstTime; this.priority = priority;
    }
}

public class Question6 {
    static Process head; static int quantum = 2;

    static void addProcess(int pid, int burst, int priority) {
        Process node = new Process(pid, burst, priority);
        if (head == null) { head = node; head.next = head; return; }
        Process temp = head; while (temp.next != head) temp = temp.next;
        temp.next = node; node.next = head;
    }

    static void simulateRoundRobin() {
        if (head == null) return;
        Process current = head; int time = 0;
        System.out.println("\nTime\tPID\tExecuted");
        do {
            if (current.remainingTime > 0) {
                int exec = Math.min(quantum, current.remainingTime);
                current.remainingTime -= exec;
                System.out.println(time + "\t" + current.pid + "\t" + exec);
                time += exec;
            }
            current = current.next;
        } while (current != head && hasRemainingTime());
    }

    static boolean hasRemainingTime() {
        if (head == null) return false;
        Process temp = head; do {
            if (temp.remainingTime > 0) return true; temp = temp.next;
        } while (temp != head); return false;
    }

    static void display() {
        if (head == null) return;
        System.out.println("\nProcesses:");
        Process temp = head; do {
            System.out.println("PID:" + temp.pid + " Burst:" + temp.burstTime +
                    " Remaining:" + temp.remainingTime + " Priority:" + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.AddProcess 2.Simulate 3.Display 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("PID:"); int p=sc.nextInt();
                    System.out.print("Burst:"); int b=sc.nextInt();
                    System.out.print("Priority:"); int pr=sc.nextInt(); sc.nextLine();
                    addProcess(p,b,pr); break;
                case 2: simulateRoundRobin(); break;
                case 3: display(); break;
            }
        } while(choice!=0); sc.close();
    }
}