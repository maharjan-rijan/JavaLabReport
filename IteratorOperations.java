import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOperations {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the list
        System.out.println("List elements: " + numbers);

        // Obtain an iterator
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate over the elements using the iterator
        System.out.println("Iterating over the list using Iterator:");
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);

            // Remove the element if it's divisible by 20
            if (element % 20 == 0) {
                iterator.remove();
                System.out.println("Removed element: " + element);
            }
        }

        // Display the modified list after removal
        System.out.println("Modified List after removal: " + numbers);
    }
}
