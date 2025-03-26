// Interface with static methods
interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

// Implementing class
class Calculator {
    void performOperations() {
        System.out.println("Addition: " + MathOperations.add(10, 5));
        System.out.println("Multiplication: " + MathOperations.multiply(10, 5));
    }
}

// Driver class
public class InterfaceExample3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.performOperations();
    }
}
