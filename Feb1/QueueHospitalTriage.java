package Feb1;
import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + "(" + severity + ")";
    }
}

public class QueueHospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity));

        triage.offer(new Patient("John", 3));
        triage.offer(new Patient("Alice", 5));
        triage.offer(new Patient("Bob", 2));

        System.out.println("Triage order:");
        while (!triage.isEmpty()) {
            System.out.println(triage.poll());
        }
    }
}
