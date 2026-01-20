package Jan19;

public class Question3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 15.5),
                new Motorcycle(220, "Petrol", false)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}

class Vehicle {
    protected int maxSpeed; protected String fuelType;
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed; this.fuelType = fuelType;
    }
    public void displayInfo() {
        System.out.println("Vehicle | MaxSpeed: " + maxSpeed + "km/h | Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seats) {
        super(maxSpeed, fuelType); this.seatCapacity = seats;
    }
    @Override public void displayInfo() {
        System.out.println("Car | Seats: " + seatCapacity + " | MaxSpeed: " + maxSpeed + "km/h | Fuel: " + fuelType);
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    public Truck(int maxSpeed, String fuelType, double load) {
        super(maxSpeed, fuelType); this.loadCapacity = load;
    }
    @Override public void displayInfo() {
        System.out.println("Truck | Load: " + loadCapacity + " tons | MaxSpeed: " + maxSpeed + "km/h");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    public Motorcycle(int maxSpeed, String fuelType, boolean sidecar) {
        super(maxSpeed, fuelType); this.hasSidecar = sidecar;
    }
    @Override public void displayInfo() {
        System.out.println("Motorcycle | Sidecar: " + (hasSidecar ? "Yes" : "No") + " | MaxSpeed: " + maxSpeed + "km/h");
    }
}