package Feb4;
import java.util.*;

abstract class JobRole {
    protected String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract boolean matches(Resume<?> resume);
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean matches(Resume<?> resume) {
        return resume.getYearsOfExperience() >= 2;
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean matches(Resume<?> resume) {
        return resume.getYearsOfExperience() >= 3;
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean matches(Resume<?> resume) {
        return resume.getYearsOfExperience() >= 4;
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private int yearsOfExperience;
    private T targetRole;

    public Resume(String candidateName, int yearsOfExperience, T targetRole) {
        this.candidateName = candidateName;
        this.yearsOfExperience = yearsOfExperience;
        this.targetRole = targetRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public T getTargetRole() {
        return targetRole;
    }
}

public class Question5 {

    public static void screenResumes(List<? extends JobRole> roles, Resume<?> resume) {
        for (JobRole role : roles) {
            System.out.println("Checking " + role.getTitle() +
                    " for " + resume.getCandidateName() +
                    " -> " + (role.matches(resume) ? "SHORTLIST" : "REJECT"));
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume =
                new Resume<>("Alice", 3, new SoftwareEngineer());

        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(new SoftwareEngineer());
        pipeline.add(new DataScientist());
        pipeline.add(new ProductManager());

        screenResumes(pipeline, seResume);
    }
}