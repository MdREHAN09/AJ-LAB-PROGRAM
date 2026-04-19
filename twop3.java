/*3.Write a Java program to copy all mappings from the specified map to another map as shown below Hashmap1 => ( 1, "Red") ,(2, "Green"), (3, "Black") 
Hashmap2 => (4, "White"),(5, "Blue"),(6, "Orange")  
Add all the values of Hashmap1 intoLiberation Serif Hashmap2 and print the result 
*/



package prgs;

import java.util.HashMap;
import java.util.Map;

public class twop3 {

	public static void main(String[] args) {

		// Creating first HashMap
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");

		// Creating second HashMap
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");

		// Merging map2 into map1 using merge()
		map2.forEach((key, value) ->
			map1.merge(key, value, (v1, v2) -> v1 + v2)
		);

		// Printing merged map
		System.out.println("After merging maps: " + map1);
	}
}