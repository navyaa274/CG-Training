package Jan27;

import java.util.Scanner;

class Book {
    String title, author, genre; int id; boolean available; Book next, prev;
    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id; this.title = title; this.author = author; this.genre = genre; this.available = available;
    }
}

public class Question5 {
    static Book head, tail; static int count = 0;

    static void addLast(int id, String title, String author, String genre, boolean available) {
        Book node = new Book(id, title, author, genre, available); count++;
        if (head == null) { head = tail = node; return; }
        tail.next = node; node.prev = tail; tail = node;
    }

    static void remove(int id) {
        Book temp = head; while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) return; count--;
        if (temp == head) head = head.next; if (temp == tail) tail = tail.prev;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }

    static void searchTitle(String title) {
        Book temp = head; while (temp != null) {
            if (temp.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(temp.id + ": " + temp.title + " by " + temp.author + " [" +
                        (temp.available ? "Available" : "Issued") + "]");
            } temp = temp.next;
        }
    }

    static void updateStatus(int id, boolean status) {
        Book temp = head; while (temp != null && temp.id != id) temp = temp.next;
        if (temp != null) temp.available = status;
    }

    static void displayForward() {
        System.out.println("\nForward (" + count + " books):");
        Book temp = head; while (temp != null) {
            System.out.println(temp.id + "|" + temp.title + "|" + temp.author + "|" +
                    temp.genre + "|" + (temp.available ? "Yes" : "No"));
            temp = temp.next;
        }
    }

    static void displayReverse() {
        System.out.println("\nReverse:");
        Book temp = tail; while (temp != null) {
            System.out.println(temp.id + "|" + temp.title + "|" + temp.author + "|" +
                    temp.genre + "|" + (temp.available ? "Yes" : "No"));
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.Add 2.Remove 3.SearchTitle 4.UpdateStatus 5.Forward 6.Reverse 7.Count 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("ID:"); int id=sc.nextInt();sc.nextLine();
                    System.out.print("Title:"); String t=sc.nextLine();
                    System.out.print("Author:"); String a=sc.nextLine();
                    System.out.print("Genre:"); String g=sc.nextLine();
                    System.out.print("Available(1/0):"); int av=sc.nextInt(); sc.nextLine();
                    addLast(id,t,a,g,av==1); break;
                case 2: System.out.print("ID:"); remove(sc.nextInt()); break;
                case 3: System.out.print("Title:"); searchTitle(sc.nextLine()); break;
                case 4: System.out.print("ID:"); int uid=sc.nextInt();sc.nextLine();
                    System.out.print("Available(1/0):"); updateStatus(uid,sc.nextInt()==1); break;
                case 5: displayForward(); break;
                case 6: displayReverse(); break;
                case 7: System.out.println("Total Books: " + count); break;
            }
        } while(choice!=0); sc.close();
    }
}