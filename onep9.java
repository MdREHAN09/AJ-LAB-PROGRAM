/*Write a Java program to display elements and their positions in a linked list 
(using l_listobj.get(p))
*/

package prgs;
import java.util.*;

public class onep9 {

	public static void main(String[] args) {
		
		// Creating LinkedList to store colors
		LinkedList<String> ls = new LinkedList<>();
		
		// Adding elements to the list
		ls.add("Orange");
		ls.add("geen");   // Typo (should be "green")
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		
		// Displaying elements with their positions (index)
		for(int i = 0; i < ls.size(); i++) {
			System.out.println("index: " + i + " value: " + ls.get(i));
		}
	}
}