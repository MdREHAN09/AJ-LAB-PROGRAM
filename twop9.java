/*1. Write a Java program to traverse / iterate all the keys with the specified value in a linked  HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) and display  only elderly entered 4 elements only 
[ hint : Refer to 5. LinkedHashMap Demonstration of worked out example]
*/


package prgs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class twop9 {

	public static void main(String[] args) {
		
		System.out.println("\n=== LinkedHashMap Demonstration ===");
		
		// Creating LinkedHashMap with custom rule to remove eldest entry
		Map<Integer, String> map = new LinkedHashMap<Integer, String>() {
			
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
				return size() > 4; // Keep only 4 elements
			}
		};
		
		// Adding elements
		map.put(1, "Apple");
		map.put(2, "Strawberry");
		map.put(3, "Pear");
		map.put(4, "Cucumber");
		map.put(5, "Grapes"); // This will remove the eldest (1=Apple)
		
		// Iterating over entries
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		// Displaying final map after removal of eldest entry
		System.out.println("After adding 5 (removal of eldest): " + map);
	}
}