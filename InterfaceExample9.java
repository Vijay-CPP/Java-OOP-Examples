// First interface
interface Drivable {
    void drive();
}

// Second interface
interface Fuelable {
    void refuel();
}

// Abstract class implementing Drivable
abstract class Vehicle implements Drivable {
    public void drive() {
        System.out.println("Vehicle is driving...");
    }

    // Abstract method to be implemented by subclasses
    abstract void maintenance();
}

// Concrete class implementing multiple interfaces
class Car extends Vehicle implements Fuelable {
    public void refuel() {
        System.out.println("Car is refueling...");
    }

    public void maintenance() {
        System.out.println("Car needs maintenance.");
    }
}

// Driver class
public class InterfaceExample9 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();       // Output: Vehicle is driving...
        myCar.refuel();      // Output: Car is refueling...
        myCar.maintenance(); // Output: Car needs maintenance.
    }
}
