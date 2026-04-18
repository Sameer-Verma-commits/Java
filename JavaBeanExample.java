public class JavaBeanExample {    
    public static void main(String[] args) {

        // Create bean object
        EmployeeBean emp = new EmployeeBean();

        // Set values
        emp.setName("Sameer Verma");
        emp.setSalary(50000);
        emp.setDesignation("Software Developer");
        emp.setCompany("Microsoft");

        // Display values
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Company: " + emp.getCompany());
    }
}
