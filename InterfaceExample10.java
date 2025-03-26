// Interface with constants
interface MathConstants {
    double PI = 3.14159;  // public static final by default
    int MAX_VALUE = 100;  // public static final by default

    void displayConstants();
}

// Class implementing the interface
class Calculator implements MathConstants {
    public void displayConstants() {
        System.out.println("Value of PI: " + PI);
        System.out.println("Max Value: " + MAX_VALUE);
    }
}

// Driver class
public class InterfaceExample10 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.displayConstants();

        // Accessing interface constants directly
        System.out.println("Direct Access PI: " + MathConstants.PI);
        System.out.println("Direct Access MAX_VALUE: " + MathConstants.MAX_VALUE);
    }
}
