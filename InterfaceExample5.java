// Functional Interface with Single Abstract Method (SAM)
@FunctionalInterface
interface Calculator {
    int operation(int a, int b); // Only one abstract method
}

// Class containing a static method for method reference
class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Driver class
public class InterfaceExample5 {
    public static void main(String[] args) {
        // Using Lambda Expression
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition using Lambda: " + addition.operation(10, 5));

        // Using Method Reference
        Calculator multiply = MathOperations::multiply;
        System.out.println("Multiplication using Method Reference: " + multiply.operation(10, 5));
    }
}
