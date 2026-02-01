package Feb1;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Policy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName,
                  LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters
    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Policy{%s, %s, %s, %s, ₹%.2f}",
                policyNumber, policyholderName, expiryDate, coverageType, premiumAmount);
    }
}

public class InsurancePolicyManager {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001", "Ravi Kumar",
                LocalDate.now().plusDays(15), "Health", 5000));
        manager.addPolicy(new Policy("P002", "Priya Singh",
                LocalDate.now().plusDays(45), "Auto", 12000));
        manager.addPolicy(new Policy("P003", "Amit Patel",
                LocalDate.now().plusDays(10), "Health", 7500));

        System.out.println("=== All Policies ===");
        manager.printAllCollections();

        System.out.println("\n=== Expiring Soon (30 days) ===");
        manager.getExpiringSoon().forEach(System.out::println);

        System.out.println("\n=== Health Policies ===");
        manager.getByCoverageType("Health").forEach(System.out::println);
    }
}

class PolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private TreeSet<Policy> treeSetPolicies = new TreeSet<>(
            Comparator.comparing(Policy::getExpiryDate));

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public List<Policy> getExpiringSoon() {
        LocalDate thirtyDaysFromNow = LocalDate.now().plusDays(30);
        return hashSetPolicies.stream()
                .filter(p -> !p.getExpiryDate().isAfter(thirtyDaysFromNow))
                .collect(Collectors.toList());
    }

    public List<Policy> getByCoverageType(String coverageType) {
        return hashSetPolicies.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(coverageType))
                .collect(Collectors.toList());
    }

    public void printAllCollections() {
        System.out.println("HashSet (unordered):");
        hashSetPolicies.forEach(System.out::println);
        System.out.println("\nLinkedHashSet (insertion order):");
        linkedHashSetPolicies.forEach(System.out::println);
        System.out.println("\nTreeSet (sorted by expiry date):");
        treeSetPolicies.forEach(System.out::println);
    }
}