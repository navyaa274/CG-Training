package Jan19;

public class Question7 {
    public static void main(String[] args) {
        Course[] courses = {
                new Course("Java Basics", 20),
                new OnlineCourse("Web Development", 30, "Udemy", true),
                new PaidOnlineCourse("Advanced Java", 40, "Coursera", true, 199, 20)
        };

        for (Course course : courses) {
            course.displayDetails();
            System.out.println();
        }
    }
}

class Course {
    protected String courseName; protected int duration;
    public Course(String name, int duration) {
        this.courseName = name; this.duration = duration;
    }
    public void displayDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    private String platform; private boolean isRecorded;
    public OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration); this.platform = platform; this.isRecorded = recorded;
    }
    @Override public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + " | Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee, discount;
    public PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded); this.fee = fee; this.discount = discount;
    }
    @Override public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee + " | Discount: " + discount + "%");
    }
}