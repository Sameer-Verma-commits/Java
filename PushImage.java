import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PushImage implements ActionListener {
    JFrame f;
    JLabel l1, l2;
    JButton push;

    PushImage() {
        f = new JFrame("FRAME WITH IMAGE");
        l1 = new JLabel("--CLICK TO SEE IMAGE--");
        l2 = new JLabel("kakashi_icon.png");
        push = new JButton("PUSH");
        push.addActionListener(this);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(push);
        f.add(l2);
        f.setSize(250, 250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        // Image displayed after button click
        ImageIcon img = new ImageIcon("C:/Users/Austin Griffin/Pictures/kakashi_icon.png");
        l2.setText("");
        l2.setIcon(img);
    }

    public static void main(String args[]) {
        new PushImage();
    }
}