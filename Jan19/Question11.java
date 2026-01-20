package Jan19;

public class Question11 {
    public static void main(String[] args) {
        PetrolVehicle petrolCar = new PetrolVehicle("Toyota Camry", 200);
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250, 75.0);

        System.out.print("Petrol Car: "); petrolCar.refuel();
        System.out.println();
        System.out.print("Electric: "); tesla.charge();
    }
}

interface Refuelable {
    void refuel();
}

class HybridVehicle {
    protected String model; protected int maxSpeed;
    public HybridVehicle(String model, int maxSpeed) {
        this.model = model; this.maxSpeed = maxSpeed;
    }
}

class ElectricVehicle extends HybridVehicle {
    private double batteryCapacity;
    public ElectricVehicle(String model, int maxSpeed, double battery) {
        super(model, maxSpeed); this.batteryCapacity = battery;
    }
    public void charge() {
        System.out.println(model + " is charging (Battery: " + batteryCapacity + " kWh)");
    }
}

class PetrolVehicle extends HybridVehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) { super(model, maxSpeed); }
    @Override public void refuel() {
        System.out.println(model + " refueled with petrol");
    }
}