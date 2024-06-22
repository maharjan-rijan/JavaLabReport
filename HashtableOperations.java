import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableOperations {
    public static void main(String[] args) {
        // Create a Hashtable with key as Integer and value as String
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding elements to the Hashtable
        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(3, "C++");
        hashtable.put(4, "JavaScript");

        // Display the Hashtable
        System.out.println("Hashtable elements: " + hashtable);

        // Check if a key exists in the Hashtable
        int searchKey = 3;
        if (hashtable.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " is present in the Hashtable.");
        } else {
            System.out.println("Key " + searchKey + " is not present in the Hashtable.");
        }

        // Check if a value exists in the Hashtable
        String searchValue = "Python";
        if (hashtable.containsValue(searchValue)) {
            System.out.println("Value \"" + searchValue + "\" is present in the Hashtable.");
        } else {
            System.out.println("Value \"" + searchValue + "\" is not present in the Hashtable.");
        }

        // Retrieve a value based on key
        int keyToRetrieve = 2;
        String retrievedValue = hashtable.get(keyToRetrieve);
        System.out.println("Value for key " + keyToRetrieve + ": " + retrievedValue);

        // Remove an element from the Hashtable
        int keyToRemove = 4;
        String removedValue = hashtable.remove(keyToRemove);
        System.out.println("Removed key-value pair: " + keyToRemove + "-" + removedValue);

        // Display the updated Hashtable
        System.out.println("Updated Hashtable elements: " + hashtable);

        // Iterate over the Hashtable using Enumeration
        System.out.println("Iterating over Hashtable using Enumeration:");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            String value = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Size of the Hashtable
        System.out.println("Size of Hashtable: " + hashtable.size());

        // Clear the Hashtable
        hashtable.clear();
        System.out.println("Hashtable cleared. Is empty now: " + hashtable.isEmpty());
    }
}
