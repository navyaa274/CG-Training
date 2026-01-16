package Jan15.Level1Assignment;

/*
Q5: Create a MobilePhone class with attributes brand, model, and price. Add a method
to display all the details of the phone. The MobilePhone class uses attributes to
store the phone's characteristics. The method is used to retrieve and display this
information for each object.
 */

class MobilePhone {
    String brand, model;
    double price;

    void display() {
        System.out.printf("Brand: %s, Model: %s, Price: ₹%.2f%n", brand, model, price);
    }
}

public class Question5 {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy A52";
        phone1.price = 25000;
        phone1.display();

        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "iPhone";
        phone2.model = "14 Pro";
        phone2.price = 99999;
        phone2.display();
    }
}
