/* 
1. Write a Java program to traverse / iterate all the keys with the specified value in a HashMap  (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) 
[ hint : 6. Iterating Over Map in the worked out example]

*/

package prgs;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class twop1 {

	public static void main(String[] args) {

		// Creating HashMap with Integer keys and String values
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		// Adding elements to the HashMap
		hashMap.put(1, "Apple");
		hashMap.put(2, "Strawberry");
		hashMap.put(3, "Pear");
		hashMap.put(4, "Cucumber");
		hashMap.put(5, "Grapes");
	
		// Iterating over entries using entrySet()
		System.out.println("Iterating over entries:");
		
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			
			// Printing key and value
			System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
		}
	}
}