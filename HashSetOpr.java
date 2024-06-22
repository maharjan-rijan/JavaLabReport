import java.util.HashSet;
import java.util.Iterator;

public class HashSetOpr {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("WaterMelon");
        hashSet.add("Kiwi");

        // Display the HashSet
        System.out.println("HashSet elements: " + hashSet);

        // Check if an element exists in the HashSet
        String searchElement = "Orange";
        if (hashSet.contains(searchElement)) {
            System.out.println(searchElement + " is present in the HashSet.");
        } else {
            System.out.println(searchElement + " is not present in the HashSet.");
        }

        // Remove an element from the HashSet
        String removeElement = "Grapes";
        if (hashSet.remove(removeElement)) {
            System.out.println(removeElement + " removed from the HashSet.");
        } else {
            System.out.println(removeElement + " not found in the HashSet.");
        }

        // Display the updated HashSet
        System.out.println("Updated HashSet elements: " + hashSet);

        // Iterate over the elements in the HashSet
        System.out.println("Iterating over HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet cleared. Is empty now: " + hashSet.isEmpty());
    }
}
