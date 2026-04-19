/*Write a Java program to iterate through all elements in a linked list 
starting at the specified position (2nd) using iterator
(hint: Iterator iteratorobj = listobj.listIterator(1))
*/

package prgs;
import java.util.*;

public class onep6 {

	public static void main(String[] args) {
		
		// Creating LinkedList to store colors
		List<String> ls = new LinkedList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("geen");   // Typo (should be "green")
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Creating iterator starting from index 1 (2nd position)
		Iterator iterator = ls.listIterator(1);
		
		// Iterating and printing elements from 2nd position
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}