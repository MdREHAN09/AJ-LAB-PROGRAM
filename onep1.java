/* 
 Program: Store different colors using ArrayList 
 and check whether "Red" is available or not
*/

package prgs;

import java.util.*; // Importing utility package for List and ArrayList

public class onep1 {

    public static void main(String[] args) {

        // Creating a List using ArrayList to store colors
        List<String> ls = new ArrayList<>();

        // Adding colors to the ArrayList
        ls.add("Orange");
        ls.add("geen");   // Typo here (should be "green")
        ls.add("pink");
        ls.add("red");

        // Printing all colors in the list
        System.out.println(ls);

        // Checking if the list contains "red"
        if (ls.contains("red")) {
            System.out.println("available"); // If found
        } else {
            System.out.println("available not"); // If not found
        }
    }
}