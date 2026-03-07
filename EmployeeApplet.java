import java.applet.Applet;
import java.awt.Graphics;

public class EmployeeApplet extends Applet {
    String name, designation;
    int salary;
    double tax;

    public void init() {
        name = getParameter("pname");
        designation = getParameter("pdesignation");
        salary = Integer.parseInt(getParameter("psalary"));

        // Tax calculation (example 18%)
        tax = salary * 0.18;
    }

    public void paint(Graphics g) {
        g.drawString("Employee Information", 50, 50);
        g.drawString("Name: " + name, 50, 80);
        g.drawString("Designation: " + designation, 50, 110);
        g.drawString("Salary: " + salary, 50, 140);
        g.drawString("Tax: " + tax, 50, 170);
    }
}
