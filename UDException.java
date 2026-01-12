
class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message); // Call the superclass constructor (Exception)
    }
}

public class UDException {
    // Step 2: Method that throws the custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw user-defined exception
            throw new InvalidAgeException("Age is below 18 — Not eligible to vote!");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    // Step 3: Handle the exception using try-catch
    public static void main(String[] args) {
        try {
            System.out.println("Checking age...");
            checkAge(15); // Example input that causes exception
        } catch (InvalidAgeException e) {
            // Catch and handle custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
