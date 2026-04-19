/*
 Program: Store different colors using ArrayList,
 remove the 2nd element and remove the color "Blue"
*/

package prgs;

import java.util.*; // Importing utility package

public class onep2 {

    public static void main(String[] args) {

        // Creating a List using ArrayList
        List<String> ls = new ArrayList<>();

        // Adding elements (colors) to the ArrayList
        ls.add("Orange");
        ls.add("geen");   // Typo (should be "green")
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Printing original list
        System.out.println("Original List: " + ls);

        // Removing the 2nd element (index starts from 0, so index 2 = 3rd element)
        ls.remove(2);

        // Printing list after removing 2nd index element
        System.out.println("After removing element at index 2: " + ls);

        // Removing the element "Blue" from the list
        ls.remove("Blue");

        // Printing final list after removing "Blue"
        System.out.println("After removing 'Blue': " + ls);
    }
}