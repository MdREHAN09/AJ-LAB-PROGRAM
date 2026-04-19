/*Write a Java program to insert the specified element at the end of a linked list
(using l_listobj.offerLast("Pink"))
*/

package prgs;
import java.util.*;

public class onep8 {

	public static void main(String[] args) {
		
		// Creating LinkedList to store colors
		LinkedList<String> ls = new LinkedList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("geen");   // Typo (should be "green")
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Printing original list
		System.out.println(ls);
		
		// Inserting element at the end using offerLast()
		ls.offerLast("Pink");
		
		// Printing updated list
		System.out.println(ls);
	}
}