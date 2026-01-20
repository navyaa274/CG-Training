package Jan20;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("=== Hospital Management ===");
        Patient[] patients = {
                new InPatient(1, "John In", 30),
                new OutPatient(2, "Jane Out", 25)
        };
        for (Patient p : patients) {
            p.getPatientDetails();
            ((MedicalRecord) p).addRecord("Checkup done");
        }
        System.out.println();
    }
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Bill: $" + calculateBill());
    }
}

interface MedicalRecord {
    default void addRecord(String record) { System.out.println("Record added: " + record); }
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(int id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return 1000; }
}

class OutPatient extends Patient implements MedicalRecord {
    public OutPatient(int id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return 200; }
}