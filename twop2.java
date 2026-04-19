/*2. Remove the following all elements from the HashMap then verify that its size is zero and  include once again following elements and check its size 
(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”) [ Hint : clear() , size() and put()] 
*/



package prgs;

import java.util.HashMap;
import java.util.Map;

public class twop2 {

	public static void main(String[] args) {

		// Creating HashMap
		Map<Integer, String> hashMap = new HashMap<>();
		
		// Adding elements
		hashMap.put(1, "Apple");
		hashMap.put(2, "Strawberry");
		hashMap.put(3, "Pear");
		hashMap.put(4, "Cucumber");
		hashMap.put(5, "Grapes");
		
		// Removing all elements using clear()
		hashMap.clear();
		
		// Checking size after removing all elements
		System.out.println("After removing all elements, size: " + hashMap.size());
		
		// Adding elements again
		hashMap.put(1, "Apple");
		hashMap.put(2, "Strawberry");
		hashMap.put(3, "Pear");
		hashMap.put(4, "Cucumber");
		hashMap.put(5, "Grapes");
		
		// Checking size after adding elements again
		System.out.println("After adding all elements, size: " + hashMap.size());
	}
}