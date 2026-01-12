
// Import the class from the package
import MyPackage.Message;

public class AccessPackage {
    public static void main(String[] args) {
        System.out.println("Accessing Package: MyPackage");
        // Create object of class from the package
        Message msg = new Message();
        msg.display();
    }
}
