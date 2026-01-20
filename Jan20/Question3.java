package Jan20;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Rental System ===");
        Vehicle[] vehicles = {
                new Car("C001", 50),
                new Bike("B001", 20),
                new Truck("T001", 100)
        };
        int days = 5;
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleNumber() + " rental (" + days + " days): $" +
                    v.calculateRentalCost(days) + ", Insurance: $" + ((Insurable) v).calculateInsurance());
        }
        System.out.println();
    }
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() { return vehicleNumber; }
    public double getRentalRate() { return rentalRate; }
}

interface Insurable {
    default double calculateInsurance() { return 100; }
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.2; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
}