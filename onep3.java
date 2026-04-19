/*
 Program: Store different colors using ArrayList
 and sort them using Collections.sort()
*/

package prgs;

import java.util.*; // Importing utility package

public class onep3 {

    public static void main(String[] args) {

        // Creating a List using ArrayList
        List<String> ls = new ArrayList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("geen");   // Typo (should be "green")
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Printing list before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sorting the list in ascending (alphabetical) order
        Collections.sort(ls);

        // Printing list after sorting
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}