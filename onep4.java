/*Write a java program for getting different colors through ArrayList interface 
and extract the elements 1st and 2nd from the ArrayList object by using SubList()
*/

package prgs;
import java.util.*;

public class onep4 {

	public static void main(String[] args) {
		
		// Creating ArrayList to store colors
		List<String> ls = new ArrayList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("geen");   // Typo (should be "green")
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Printing original list
		System.out.println(ls);
		
		// Extracting 1st and 2nd elements using subList()
		// (index 0 to 2 → 0 inclusive, 2 exclusive)
		System.out.println("using sublist:");
		System.out.println(ls.subList(0,2));
	}
}