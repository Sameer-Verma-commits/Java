
class PredefinedException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            // This will throw ArithmeticException (division by zero)
            result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            // Handling predefined exception
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot divide a number by ZERO!");
        }

        System.out.println("Program Continues After Exception Handling...");
    }
}
