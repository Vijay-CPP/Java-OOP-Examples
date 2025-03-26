class MathOperations {
    // Method with one parameter
    int add(int a) {
        return a + 10;
    }

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    double add(double a, double b, double c) {
        return a + b + c;
    }
}

// Compile time polymorphism
public class PolymorphismExample1 {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5));
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(2.5, 3.5, 4.5));
    }
}
