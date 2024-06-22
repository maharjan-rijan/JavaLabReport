import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class TreeMapOperations {
    public static void main(String[] args) {
        // Create a TreeMap with key as Integer and value as String
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Display the TreeMap
        System.out.println("TreeMap elements: " + treeMap);

        // Check if a key exists in the TreeMap
        int searchKey = 2;
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " is present in the TreeMap.");
        } else {
            System.out.println("Key " + searchKey + " is not present in the TreeMap.");
        }

        // Check if a value exists in the TreeMap
        String searchValue = "Four";
        if (treeMap.containsValue(searchValue)) {
            System.out.println("Value \"" + searchValue + "\" is present in the TreeMap.");
        } else {
            System.out.println("Value \"" + searchValue + "\" is not present in the TreeMap.");
        }

        // Retrieve a value based on key
        int keyToRetrieve = 3;
        String retrievedValue = treeMap.get(keyToRetrieve);
        System.out.println("Value for key " + keyToRetrieve + ": " + retrievedValue);

        // Remove an element from the TreeMap
        int keyToRemove = 1;
        String removedValue = treeMap.remove(keyToRemove);
        System.out.println("Removed key-value pair: " + keyToRemove + "-" + removedValue);

        // Display the updated TreeMap
        System.out.println("Updated TreeMap elements: " + treeMap);

        // Iterate over the TreeMap using keySet
        System.out.println("Iterating over TreeMap using keySet:");
        Set<Integer> keys = treeMap.keySet();
        for (int key : keys) {
            String value = treeMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Size of the TreeMap
        System.out.println("Size of TreeMap: " + treeMap.size());

        // Clear the TreeMap
        treeMap.clear();
        System.out.println("TreeMap cleared. Is empty now: " + treeMap.isEmpty());
    }
}
