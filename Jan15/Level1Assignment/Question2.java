package Jan15.Level1Assignment;

/*
Q2: Write a program to create a Circle class with an attribute radius. Add methods
to calculate and display the area and circumference of the circle.
 */

class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.printf("Radius: %.2f, Area: %.2f, Circumference: %.2f%n",
                radius, area(), circumference());
    }
}

public class Question2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5.0;
        c1.display();

        Circle c2 = new Circle();
        c2.radius = 7.5;
        c2.display();
    }
}