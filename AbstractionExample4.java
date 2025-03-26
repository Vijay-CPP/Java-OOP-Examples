// Define an abstract class named Vehicle
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void drive();

    // Concrete method
    public String getBrand() {
        return brand;
    }

    // Final method
    public final void warranty() {
        System.out.println("2-year warranty included.");
    }

    // Static method
    public static void startEngine() {
        System.out.println("Engine started.");
    }
}

// Define an interface named ElectricVehicle
interface ElectricVehicle {
    // Abstract method
    void charge();

    // Default method
    default void batteryStatus() {
        System.out.println("Battery is fully charged.");
    }

    // Static method
    static void resetSettings() {
        System.out.println("Resetting electric settings.");
    }
}

// Concrete class implementing the abstract methods and extending the abstract class
class Car extends Vehicle implements ElectricVehicle {
    private int speed;

    public Car(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    // Implementing the abstract method from the abstract class
    @Override
    public void drive() {
        System.out.println("The car is driving at " + speed + " km/h.");
    }

    // Implementing the abstract method from the interface
    @Override
    public void charge() {
        System.out.println("Charging the car.");
    }

    // Public method
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    // Protected method
    protected void applyBrakes() {
        System.out.println("Brakes applied.");
    }
}

// Main class to test the program
public class AbstractionExample4 {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 120);

        // Accessing public method
        myCar.accelerate();

        // Accessing protected method
        myCar.applyBrakes();

        // Accessing final method
        myCar.warranty();

        // Accessing static method from the abstract class
        Vehicle.startEngine();

        // Accessing default method from the interface
        myCar.batteryStatus();

        // Accessing static method from the interface
        ElectricVehicle.resetSettings();
    }
}