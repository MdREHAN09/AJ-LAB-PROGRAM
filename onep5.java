/*Write a java program for getting different colors through ArrayList interface 
and delete nth element from the ArrayList object by using remove by index
*/

package prgs;
import java.util.*;

public class onep5 {

	public static void main(String[] args) {
		
		// Creating ArrayList to store colors
		List<String> ls = new ArrayList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Printing original list
		System.out.println(ls);
		
		// Removing nth element using index
		int n = 3; // Example: remove 3rd element
		
		// Index starts from 0, so (n-1)
		System.out.println("Removing the " + n + "th Element: " + ls.remove(n-1));
		
		// Printing updated list
		System.out.println(ls);
	}
}