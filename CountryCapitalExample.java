/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, 
 * Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore 
 * into a JList and display the capital of the countries on console whenever the 
 * countries are selected on the list.

*/



package prgs;

import java.util.HashMap;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryCapitalExample extends JFrame {

    private JList<String> countryList;

    public CountryCapitalExample() {

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };

        // Capitals mapping
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(countries);

        // Event Handling
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();

                    if (selectedCountry != null) {
                        String capital = capitals.get(selectedCountry);
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    }
                }
            }
        });

        // Add list to scroll pane
        add(new JScrollPane(countryList));

        // Frame settings
        setTitle("Country Capital List");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalExample();
    }
}