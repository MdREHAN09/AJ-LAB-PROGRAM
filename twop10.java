/*2. Include the following elements into the LinkedHashMap called programminglanguages and print all of them. 
("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985); 
  
*/
 


package prgs;

import java.util.*;

public class twop10 {

	public static void main(String[] args) {

		// Creating LinkedHashMap (maintains insertion order)
		Map<String, Integer> programminglanguages = new LinkedHashMap<>();
		
		// Adding elements (language -> release year)
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		
		// Displaying the map
		System.out.println(programminglanguages);
	}
}