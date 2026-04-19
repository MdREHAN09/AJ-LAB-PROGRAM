/*Write a Java program that swaps two elements (first and third elements) 
in a linked list (using Collections.swap(l_list, 0, 2))
*/

package prgs;
import java.util.*;

public class onep10 {

	public static void main(String[] args) {
		
		// Creating LinkedList to store colors
		LinkedList<String> ls = new LinkedList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("geen");   // Typo (should be "green")
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Printing list before swapping
		System.out.println("Before swapping");
		System.out.println(ls);
		
		// Swapping 1st (index 0) and 3rd (index 2) elements
		Collections.swap(ls, 0, 2);
		
		// Printing list after swapping
		System.out.println("After swapping");
		System.out.println(ls);
	}
}