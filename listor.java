// Java Program to Show the Usage of listIterator

import java.util.*;

public class listor {

	// Main driver method 
	public static void main(String[] args)
	{
		// Creating a list of names
		List<String> names = new LinkedList<String>();
	
		names.add("Welcome");
		names.add("To");
		names.add("OOP in Java Class");

		// Getting ListIterator
		ListIterator<String> namesIterator
			= names.listIterator();

		// Traversing elements using next() method 
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

		// for-each loop creates Internal Iterator here.
		for (String s : names) {
			System.out.println(s);
		}
	}
}
