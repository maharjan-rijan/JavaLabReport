import java.util.*;

public class mapping {
    public static void main(String[] args) {
        // Create a HashMap to store mappings of names to ages
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding entries to the map
        ageMap.put("Hari", 56);
        ageMap.put("Rahul", 78);
        ageMap.put("Sandhya", 21);
        ageMap.put("Sita", 18);

        // Accessing values from the map
        System.out.println("Age of Sandhya: " + ageMap.get("Sandhya"));
        System.out.println("Age of Hari: " + ageMap.get("Hari"));

        // Iterating over keys and values in the map
        System.out.println("\nIterating over entries in the map:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + "\nAge: " + entry.getValue());
        }

        // Checking if a key exists in the map
        String name = "Hari";
        if (ageMap.containsKey(name)) {
            System.out.println("\n" + name + " is present in the map.");
        } else {
            System.out.println("\n" + name + " is not present in the map.");
        }

        // Removing an entry from the map
        String removeName = "Sita";
        ageMap.remove(removeName);
        System.out.println("\nRemoved " + removeName + " from the map.");

        // Displaying all entries in the map after removal
        System.out.println("\nEntries in the map after removal:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + "\nAge: " + entry.getValue());
        }
    }
}
