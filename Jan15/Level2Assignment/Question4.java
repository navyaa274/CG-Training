package Jan15.Level2Assignment;

/*
Q4: Create a MovieTicket class with attributes movieName, seatNumber, and
price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.

 */

class MovieTicket {
    String movieName, seatNumber;
    double price;

    void book(String seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked - Seat " + seatNumber + " for " + movieName);
    }

    void display() {
        System.out.printf("Movie: %s, Seat: %s, Price: ₹%.2f%n", movieName, seatNumber, price);
    }
}

public class Question4 {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.movieName = "Avengers: Endgame";
        ticket1.book("A12", 250);
        ticket1.display();

        MovieTicket ticket2 = new MovieTicket();
        ticket2.movieName = "Spider-Man";
        ticket2.book("B05", 200);
        ticket2.display();
    }
}