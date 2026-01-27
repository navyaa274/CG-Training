package Jan27;

import java.util.Scanner;

class Movie {
    String title, director; int year; double rating; Movie next, prev;
    Movie(String title, String director, int year, double rating) {
        this.title = title; this.director = director; this.year = year; this.rating = rating;
    }
}

public class Question2 {
    static Movie head, tail;

    static void addFirst(String title, String director, int year, double rating) {
        Movie node = new Movie(title, director, year, rating);
        if (head == null) { head = tail = node; return; }
        node.next = head; head.prev = node; head = node;
    }

    static void addLast(String title, String director, int year, double rating) {
        Movie node = new Movie(title, director, year, rating);
        if (head == null) { head = tail = node; return; }
        tail.next = node; node.prev = tail; tail = node;
    }

    static void remove(String title) {
        Movie temp = head; while (temp != null && !temp.title.equalsIgnoreCase(title)) temp = temp.next;
        if (temp == null) return;
        if (temp == head) head = head.next; if (temp == tail) tail = tail.prev;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }

    static void searchDirector(String director) {
        Movie temp = head; while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + " (" + temp.year + ") Rating: " + temp.rating);
            } temp = temp.next;
        }
    }

    static void updateRating(String title, double rating) {
        Movie temp = head; while (temp != null && !temp.title.equalsIgnoreCase(title)) temp = temp.next;
        if (temp != null) temp.rating = rating;
    }

    static void displayForward() {
        System.out.println("\nForward:"); Movie temp = head;
        while (temp != null) { System.out.println(temp.title+"|"+temp.director+"|"+temp.year+"|"+temp.rating); temp = temp.next; }
    }

    static void displayReverse() {
        System.out.println("\nReverse:"); Movie temp = tail;
        while (temp != null) { System.out.println(temp.title+"|"+temp.director+"|"+temp.year+"|"+temp.rating); temp = temp.prev; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.AddFirst 2.AddLast 3.Remove 4.SearchDirector 5.UpdateRating 6.Forward 7.Reverse 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("Title:"); String t1=sc.nextLine();
                    System.out.print("Director:"); String d1=sc.nextLine();
                    System.out.print("Year:"); int y1=sc.nextInt();
                    System.out.print("Rating:"); double rt1=sc.nextDouble(); sc.nextLine();
                    addFirst(t1,d1,y1,rt1); break;
                case 2: System.out.print("Title:"); String t2=sc.nextLine();
                    System.out.print("Director:"); String d2=sc.nextLine();
                    System.out.print("Year:"); int y2=sc.nextInt();
                    System.out.print("Rating:"); double rt2=sc.nextDouble(); sc.nextLine();
                    addLast(t2,d2,y2,rt2); break;
                case 3: System.out.print("Title:"); remove(sc.nextLine()); break;
                case 4: System.out.print("Director:"); searchDirector(sc.nextLine()); break;
                case 5: System.out.print("Title:"); String ut=sc.nextLine();
                    System.out.print("NewRating:"); updateRating(ut,sc.nextDouble()); sc.nextLine(); break;
                case 6: displayForward(); break;
                case 7: displayReverse(); break;
            }
        } while(choice!=0); sc.close();
    }
}
