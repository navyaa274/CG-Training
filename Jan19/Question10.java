package Jan19;

public class Question10 {
    public static void main(String[] args) {
        Worker[] staff = {
                new Chef("Mario", "C001"),
                new Waiter("Luigi", "W001")
        };

        for (Worker worker : staff) {
            worker.performDuties();
            System.out.println();
        }
    }
}

interface Worker {
    void performDuties();
}

class RestaurantPerson {
    protected String name, id;
    public RestaurantPerson(String name, String id) {
        this.name = name; this.id = id;
    }
}

class Chef extends RestaurantPerson implements Worker {
    public Chef(String name, String id) { super(name, id); }
    @Override public void performDuties() {
        System.out.println(name + " (Chef ID:" + id + ") prepares gourmet dishes");
    }
}

class Waiter extends RestaurantPerson implements Worker {
    public Waiter(String name, String id) { super(name, id); }
    @Override public void performDuties() {
        System.out.println(name + " (Waiter ID:" + id + ") serves customers promptly");
    }
}