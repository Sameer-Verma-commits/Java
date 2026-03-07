import java.awt.*;
import java.awt.event.*;

public class AWTButton implements ActionListener{
    Frame f;
    Button b1,b2,b3,b4;
    Label statusLabel;
    public AWTButton(){
        f= new Frame("Four Buttons AWT");
        statusLabel= new Label("Click a Button");
        //Creating buttons
        b1= new Button("Button 1");
        b2= new Button("Button 2");
        b3= new Button("Button 3");
        b4= new Button("Button 4");

        //set Layout
        f.setLayout(new FlowLayout());

        //Add button to frame
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(statusLabel);
        //Add action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        //Frame setting
        f.setSize(300,300);
        f.setVisible(true);

        //Close  window
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing( WindowEvent e){
                f.dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        String status=e.getActionCommand();
        statusLabel.setText("Clicked: "+status);
    }
    public static void main(String args[]){
        new AWTButton();
    }
}
