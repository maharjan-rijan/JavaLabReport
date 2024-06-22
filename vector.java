// Java code to illustrate boolean add(Object element)
import java.util.*;

public class vector {
	public static void main(String args[])
	{

		// Creating an empty Vector
		Vector<String> vec_tor = new Vector<String>();

		// Use add() method to add elements in the vector
		vec_tor.add("Kathmandu");
		vec_tor.add("Capital");
		vec_tor.add("of");
		vec_tor.add("Nepal");
		vec_tor.add("Smallest");

		// Output the present vector
		System.out.println("The vector is: " + vec_tor);

		// Adding new elements to the end
		vec_tor.add("Asian");
		vec_tor.add("Country");

		// Printing the new vector
		System.out.println("The new Vector is: " + vec_tor);
	}
}
