/*3. Remove the following all elements from the TreeMap then verify that its size is zero and include once again following elements and iterate them and check its size (1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”) [ Hint : clear() , size() and put()] 
*/




package prgs;

import java.util.HashMap;
import java.util.*;

public class twop7 {

	public static void main(String[] args) {

		// Creating TreeMap (sorted map)
		Map<Integer, String> map = new TreeMap<>();
		
		// Adding elements
		map.put(1, "Apple");
		map.put(2, "Strawberry");
		map.put(3, "Pear");
		map.put(4, "Cucumber");
		map.put(5, "Grapes");
		
		// Removing all elements using clear()
		map.clear();
		
		// Checking size after removing all elements
		System.out.println("After removing all elements size: " + map.size());
		
		// Adding elements again
		map.put(1, "Apple");
		map.put(2, "Strawberry");
		map.put(3, "Pear");
		map.put(4, "Cucumber");
		map.put(5, "Grapes");
		
		// Checking size after adding elements
		System.out.println("After adding all elements size: " + map.size());
	}
}