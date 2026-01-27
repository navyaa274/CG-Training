package Jan27;
import java.util.Scanner;

class Ticket {
    int ticketId, seatNo; String customer, movie; String time; Ticket next;
    Ticket(int id, String customer, String movie, int seat, String time) {
        this.ticketId = id; this.customer = customer; this.movie = movie;
        this.seatNo = seat; this.time = time;
    }
}

public class Question9 {
    static Ticket head; static int totalTickets = 0;

    static void addTicket(int id, String customer, String movie, int seat, String time) {
        Ticket node = new Ticket(id, customer, movie, seat, time); totalTickets++;
        if (head == null) { head = node; head.next = head; return; }
        Ticket temp = head; while (temp.next != head) temp = temp.next;
        temp.next = node; node.next = head;
    }

    static void remove(int id) {
        if (head == null) return;
        if (head.ticketId == id) {
            if (head.next == head) { head = null; totalTickets--; return; }
            Ticket temp = head; while (temp.next != head) temp = temp.next;
            head = head.next; temp.next = head; totalTickets--;
            return;
        }
        Ticket temp = head; while (temp.next != head && temp.next.ticketId != id) temp = temp.next;
        if (temp.next != head) { temp.next = temp.next.next; totalTickets--; }
    }

    static void searchCustomer(String customer) {
        if (head == null) return;
        Ticket temp = head; do {
            if (temp.customer.toLowerCase().contains(customer.toLowerCase())) {
                System.out.println(temp.ticketId + ": " + temp.customer + " - " + temp.movie + " Seat:" + temp.seatNo);
            } temp = temp.next;
        } while (temp != head);
    }

    static void searchMovie(String movie) {
        if (head == null) return;
        Ticket temp = head; do {
            if (temp.movie.equalsIgnoreCase(movie)) {
                System.out.println(temp.customer + " Seat:" + temp.seatNo + " Time:" + temp.time);
            } temp = temp.next;
        } while (temp != head);
    }

    static void display() {
        System.out.println("\nTickets (" + totalTickets + "):");
        if (head == null) return;
        Ticket temp = head; do {
            System.out.println(temp.ticketId + "|" + temp.customer + "|" + temp.movie +
                    "|Seat:" + temp.seatNo + "|" + temp.time);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.AddTicket 2.Remove 3.SearchCustomer 4.SearchMovie 5.Display 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("ID:"); int id=sc.nextInt();sc.nextLine();
                    System.out.print("Customer:"); String c=sc.nextLine();
                    System.out.print("Movie:"); String m=sc.nextLine();
                    System.out.print("Seat:"); int s=sc.nextInt();
                    System.out.print("Time:"); String t=sc.nextLine(); sc.nextLine();
                    addTicket(id,c,m,s,t); break;
                case 2: System.out.print("ID:"); remove(sc.nextInt()); break;
                case 3: System.out.print("Customer:"); searchCustomer(sc.nextLine()); break;
                case 4: System.out.print("Movie:"); searchMovie(sc.nextLine()); break;
                case 5: display(); break;
            }
        } while(choice!=0); sc.close();
    }
}