// Outer class
class OuterClass {
    static String message = "Hello from OuterClass";

    // Static inner class
    static class StaticInner {
        void display() {
            System.out.println("Message: " + message);
        }
    }
}

// Driver class
public class InnerClassExample2{
    public static void main(String[] args) {
        // Instantiating static inner class
        OuterClass.StaticInner inner = new OuterClass.StaticInner();
        inner.display();  // Output: Message: Hello from OuterClass
    }
}
