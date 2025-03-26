// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Child class 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Child class 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}

// Example of hierarchical inheritance in Java - multiple classes inheriting from a single class
public class InheritanceExample3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();

        Bike bike = new Bike();
        bike.start();
        bike.ride();
    }
}
