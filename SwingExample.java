import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");

        // Text Field
        JLabel nameLabel = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);

        // Checkboxes
        JLabel hobbyLabel = new JLabel("Select Hobbies:");
        JCheckBox cb1 = new JCheckBox("Reading");
        JCheckBox cb2 = new JCheckBox("Gaming");
        JCheckBox cb3 = new JCheckBox("Traveling");

        // Radio Buttons
        JLabel genderLabel = new JLabel("Select Gender:");
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");

        // Group radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        // Layout
        frame.setLayout(new FlowLayout());

        frame.add(nameLabel);
        frame.add(textField);

        frame.add(hobbyLabel);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);

        frame.add(genderLabel);
        frame.add(rb1);
        frame.add(rb2);

        // Frame settings
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}