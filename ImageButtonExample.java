/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or
 *  “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or
 *   Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).

*/


package prgs;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        // Create Frame
        JFrame frame = new JFrame("Image Button Example");

        // Label
        label = new JLabel();
        label.setBounds(50, 50, 600, 100);
        label.setFont(new Font("Arial", Font.BOLD, 30));

        // Load Images (Make sure images are in project folder)
        ImageIcon digitalIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Buttons with images
        JButton btnDigital = new JButton(digitalIcon);
        JButton btnHourglass = new JButton(hourglassIcon);

        btnDigital.setBounds(100, 200, 150, 150);
        btnHourglass.setBounds(300, 200, 150, 150);

        // Event Handling
        btnDigital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourglass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(btnDigital);
        frame.add(btnHourglass);
        frame.add(label);

        // Frame settings
        frame.setSize(600, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}