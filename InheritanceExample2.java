// Multiple inheritance in Java using interfaces
// Example of multiple inheritance in Java
// By default, Java does not support multiple inheritance. However, it can be achieved using interfaces.

// First interface
interface Engine {
    void start();
    default void stop() {
        System.out.println("Engine stopped.");}
}

// Second interface
interface Wheels {
    void rotate();
    default void stop() {
        System.out.println("Wheels stopped.");
    }
}

// Class implementing multiple interfaces - Multiple inheritance
class Car implements Engine, Wheels {
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        Engine.super.stop();
        Wheels.super.stop();
    }

    public void rotate() {
        System.out.println("Car wheels are rotating.");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.rotate();
    }
}
