import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Accessing elements using get() method
        System.out.println("Element at index 2: " + numbers.get(2));

        // Modifying element at index 1
        numbers.set(1, 5);
        System.out.println("Modified ArrayList after set(1, 5): " + numbers);

        // Removing element at index 3
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + numbers);

        // Checking if an element exists in the ArrayList
        int element = 3;
        if (numbers.contains(element)) {
            System.out.println("ArrayList contains " + element);
        } else {
            System.out.println("ArrayList does not contain " + element);
        }

        // Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);

        // Checking if the ArrayList is empty
        if (numbers.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}
