package Jan19;

public class Question5 {
    public static void main(String[] args) {
        Device[] devices = {
                new Device("L001", "On"),
                new Thermostat("T001", "Active", 22.5)
        };

        for (Device device : devices) {
            device.displayStatus();
            System.out.println();
        }
    }
}

class Device {
    protected String deviceId, status;
    public Device(String id, String status) {
        this.deviceId = id; this.status = status;
    }
    public void displayStatus() {
        System.out.println("Device " + deviceId + ": " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;
    public Thermostat(String id, String status, double temp) {
        super(id, status); this.temperatureSetting = temp;
    }
    @Override public void displayStatus() {
        System.out.println("Thermostat " + deviceId + ": " + status + " | Temp: " + temperatureSetting + "°C");
    }
}