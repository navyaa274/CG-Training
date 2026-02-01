package Feb1;
import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Equal: " + setsEqual(set1, set2));
        System.out.println("Union: " + union(set1, new HashSet<>(Arrays.asList(3, 4, 5))));
        System.out.println("Intersection: " + intersection(set1, new HashSet<>(Arrays.asList(3, 4, 5))));
        System.out.println("Symmetric Diff: " + symmetricDifference(set1, new HashSet<>(Arrays.asList(3, 4, 5))));
        System.out.println("Subset check: " + isSubset(new HashSet<>(Arrays.asList(2, 3)), set1));
    }

    public static boolean setsEqual(Set<?> s1, Set<?> s2) {
        return s1.equals(s2);
    }

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }

    public static <T> Set<T> symmetricDifference(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        result.removeAll(intersection(s1, s2));
        return result;
    }

    public static boolean isSubset(Set<?> subset, Set<?> superset) {
        return superset.containsAll(subset);
    }
}
