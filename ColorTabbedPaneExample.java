/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, 
 * Magenta and Yellow and display the concerned color whenever the specific
 *  tab is selected in the Pan

*/



package prgs;

import java.awt.Color;
import javax.swing.*;

public class ColorTabbedPaneExample {

    JFrame frame;

    ColorTabbedPaneExample() {

        // Create Frame
        frame = new JFrame("Color Tabbed Pane");

        // Create Panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set Background Colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 300, 300);

        // Add Tabs
        tabbedPane.add("CYAN", p1);
        tabbedPane.add("MAGENTA", p2);
        tabbedPane.add("YELLOW", p3);

        // Add to Frame
        frame.add(tabbedPane);

        // Frame Settings
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPaneExample();
    }
}