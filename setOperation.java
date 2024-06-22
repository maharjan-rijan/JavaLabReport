import java.util.*;

public class setOperation {
    public static void main(String[] args) {
        // Creating sets
        Set<Integer> set1 = new LabHashSet<>();
        Set<Integer> set2 = new LabHashSet<>();

        // Adding elements to set1
        set1.add(7);
        set1.add(8);
        set1.add(3);
        set1.add(4);

        // Adding elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(51);
        set2.add(7);

        // Print sets
        System.out.println("Values of Set 1: " + set1);
        System.out.println("Values of Set 2: " + set2);

        // Union of sets
        Set<Integer> union = new LabHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of Set 1 and Set 2: " + union);

        // Intersection of sets
        Set<Integer> intersection = new LabHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersection);

        // Difference (Set1 - Set2)
        Set<Integer> difference1 = new LabHashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference of Set 1 and Set 2: " + difference1);

        // Difference (Set2 - Set1)
        Set<Integer> difference2 = new LabHashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference of Set 2 and Set 1: " + difference2);

        // Checking subset
        boolean subset = set1.containsAll(set2);
        System.out.println("Is Set 2 a subset of Set 1 ? \n" + subset);
    }
}
