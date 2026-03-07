import java.io.DataInputStream;

class DataInputStreamExample {
    public static void main(String args[]) {
        DataInputStream input = new DataInputStream(System.in);
        int num;
        try {
            System.out.print("Enter a Number: ");
            num = Integer.parseInt(input.readLine());
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd ");
            }
            input.close();

        } catch (Exception e) {
        }
    }
}