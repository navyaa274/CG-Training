package Jan20;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("=== Ride-Hailing App ===");
        VehicleRide[] rides = {
                new CarRide(1, "Driver1", 20),
                new BikeRide(2, "Driver2", 10),
                new AutoRide(3, "Driver3", 15)
        };
        double distance = 10;
        for (VehicleRide r : rides) {
            r.getVehicleDetails();
            System.out.println("Fare (" + distance + "km): $" + r.calculateFare(distance));
            ((GPS) r).updateLocation("Destination");
        }
    }
}

abstract class VehicleRide {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("ID: " + vehicleId + ", Driver: " + driverName);
    }

    protected double getRatePerKm() { return ratePerKm; }
}

interface GPS {
    default void updateLocation(String loc) { System.out.println("Location: " + loc); }
}

class CarRide extends VehicleRide implements GPS {
    public CarRide(int id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance * 1.1; }
}

class BikeRide extends VehicleRide implements GPS {
    public BikeRide(int id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
}

class AutoRide extends VehicleRide implements GPS {
    public AutoRide(int id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.9; }
}