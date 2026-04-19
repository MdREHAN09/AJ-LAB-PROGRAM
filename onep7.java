/*Write a Java program to iterate a linked list in reverse order 
(using objlist.descendingIterator())
*/

package prgs;
import java.util.*;

public class onep7 {

	public static void main(String[] args) {
		
		// Creating LinkedList to store colors
		LinkedList<String> ls = new LinkedList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("geen");   // Typo (should be "green")
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Using descendingIterator() to iterate in reverse order
		Iterator iterator = ls.descendingIterator();
		
		// Printing elements in reverse order
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}