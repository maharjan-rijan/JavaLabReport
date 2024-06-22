import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetOpr {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);

        // Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Check if an element exists in the TreeSet
        int searchElement = 8;
        if (treeSet.contains(searchElement)) {
            System.out.println(searchElement + " is present in the TreeSet.");
        } else {
            System.out.println(searchElement + " is not present in the TreeSet.");
        }

        // Remove an element from the TreeSet
        int removeElement = 3;
        if (treeSet.remove(removeElement)) {
            System.out.println(removeElement + " removed from the TreeSet.");
        } else {
            System.out.println(removeElement + " not found in the TreeSet.");
        }

        // Display the updated TreeSet
        System.out.println("Updated TreeSet elements: " + treeSet);

        // Iterate over the elements in the TreeSet
        System.out.println("Iterating over TreeSet:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet cleared. Is empty now: " + treeSet.isEmpty());
    }
}
