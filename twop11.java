/*3. Include the following elements into the LinkedHashMap called programminglanguages and print as follows. 
Java was developed in 1995 
Python was developed in 1991. 
JavaScript was developed in 1995 
C++ was developed in 1985 

*/



package prgs;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;

public class twop11 {

	public static void main(String[] args) {

		// Creating LinkedHashMap (maintains insertion order)
		Map<String, Integer> programminglanguages = new LinkedHashMap<>();
		
		// Adding elements (language -> release year)
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		
		// Iterating through map using entrySet()
		for (Entry<String, Integer> entry : programminglanguages.entrySet()) {
			
			// Printing key and value
			System.out.println(entry.getKey() + " was developed in " + entry.getValue());
		}
	}
}