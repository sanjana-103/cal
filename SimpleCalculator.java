public class SimpleCalculator {
    public static void main(String[] args) {
        // Check if there are 3 arguments (first number, operator, second number)
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator1 <num1> <operator> <num2>");
            return;
        }

        // Parse the arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        char op = args[1].charAt(0);

        int result = 0;

        // Performing the operation based on the operator
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return;
            }
        } else {
            System.out.println("Invalid operation");
            return;
        }

        // Output the result
        System.out.println("Result: " + result);
    }
}
