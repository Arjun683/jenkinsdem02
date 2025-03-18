public class ArithmeticOperations {
    public static void main(String[] args) {
        // Static input values
        double num1 = 10.5;
        double num2 = 5.0;

        // Performing arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN; // Handling division by zero

        // Displaying results
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + (num2 != 0 ? quotient : "Undefined (cannot divide by zero)"));
    }
}

