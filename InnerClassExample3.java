// Interface
interface Greeting {
    void sayHello();
}

// Driver class
public class InnerClassExample3 {
    public static void main(String[] args) {
        // Creating an anonymous inner class that implements Greeting interface
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        
        greeting.sayHello();  // Output: Hello from Anonymous Inner Class!
    }
}
