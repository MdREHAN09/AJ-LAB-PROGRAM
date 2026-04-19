/*4.Write a Java program to check whether a map contains Key-Values mappings (empty) or not after adding all the following elements into Hashmap and after removing all the elements from the Hashmap.  
 (1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue") 
*/



package prgs;

import java.util.HashMap;
import java.util.Map;

public class twop4 {

	public static void main(String[] args) {

		// Creating HashMap
		Map<Integer, String> map1 = new HashMap<>();
		
		// Adding elements
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		
		// Checking if map is empty before removing elements
		boolean res = map1.isEmpty();
		System.out.println("Before Removing: " + res);
		
		// Removing all elements
		map1.clear();
		
		// Checking again after removing elements
		res = map1.isEmpty();
		System.out.println("After removing: " + res);
	}
}