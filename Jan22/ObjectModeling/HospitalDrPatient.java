package Jan22.ObjectModeling;
import java.util.*;

public class HospitalDrPatient {
    public static void main(String[] args) {
        Hospital hosp = new Hospital("Civil Hosp");

        Doctor d1 = new Doctor("Dr. Gupta");
        Doctor d2 = new Doctor("Dr. Sharma");
        hosp.addDoctor(d1);
        hosp.addDoctor(d2);

        Patient p1 = new Patient("Raj");
        Patient p2 = new Patient("Simran");
        hosp.addPatient(p1);
        hosp.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hosp.showMappings();
    }
}

class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        if (!patients.contains(p)) {
            patients.add(p);
        }
        if (!p.doctors.contains(this)) {
            p.doctors.add(this);
        }
        System.out.println(name + " consulting " + p.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showMappings() {
        System.out.println("Hospital: " + name);
        for (Doctor d : doctors) {
            System.out.print(d.name + " patients: ");
            for (Patient p : d.patients) {
                System.out.print(p.name + " ");
            }
            System.out.println();
        }
    }
}