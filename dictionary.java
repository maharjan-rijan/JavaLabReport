import java.util.*;

public class dictionary {
    public static void main(String[] args) {
        // Creating a HashMap to act as a dictionary
        Map<String, String> dictionary = new HashMap<>();

        // Adding entries to the dictionary
        dictionary.put("apple", "a fruit that grows on trees");
        dictionary.put("java", "a programming language");
        dictionary.put("ocean", "a large body of salt water");

        // Retrieving and printing meanings from the dictionary
        System.out.println("Meaning of 'apple': " + dictionary.get("apple"));
        System.out.println("Meaning of 'java': " + dictionary.get("java"));
        System.out.println("Meaning of 'ocean': " + dictionary.get("ocean"));

        // Checking if a key exists in the dictionary
        String searchKey = "java";
        if (dictionary.containsKey(searchKey)) {
            System.out.println("'" + searchKey + "' is found in the dictionary.");
        } else {
            System.out.println("'" + searchKey + "' is not found in the dictionary.");
        }

        // Removing an entry from the dictionary
        String removeKey = "apple";
        if (dictionary.containsKey(removeKey)) {
            String removedValue = dictionary.remove(removeKey);
            System.out.println("Removed '" + removeKey + "' from dictionary. Meaning was: " + removedValue);
        } else {
            System.out.println("'" + removeKey + "' not found in the dictionary.");
        }

        // Displaying all entries in the dictionary
        System.out.println("\nAll entries in the dictionary:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
