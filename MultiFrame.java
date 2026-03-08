import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiFrame implements ActionListener {
    JFrame frame1, frame2;
    JLabel l1, l2;
    JButton back;

    MultiFrame() {
        // Creating frame 1
        frame1 = new JFrame("FRAME 1");
        l1 = new JLabel("This Is Frame Number 1.\n");
        frame1.setLayout(new FlowLayout());
        frame1.add(l1);
        frame1.setSize(300, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        // creating frame 2
        frame2 = new JFrame("FRAME 2");
        l2 = new JLabel("This Is Frame Number 2.\n");
        back = new JButton("BACK");
        back.addActionListener(this);
        frame2.setLayout(null);
        l2.setBounds(70, 20, 200, 30);
        back.setBounds(110, 50, 70, 30);
        frame2.add(l2);
        frame2.add(back);
        frame2.setSize(300, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String status = e.getActionCommand();
        if (status.equals("BACK")) {
            frame2.dispose();
        }
    }

    public static void main(String args[]) {
        new MultiFrame();
    }
}