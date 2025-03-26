// Defining an abstract interface (all methods are abstract by default)
interface Vehicle {
    void start();
    void stop();
}

// Concrete interface (default method provides a concrete implementation)
interface ElectricVehicle {
    void chargeBattery();

    default void ecoMode() {
        System.out.println("Eco mode enabled for energy efficiency.");
    }
}

// Concrete class implementing both interfaces
class Tesla implements Vehicle, ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla is starting silently...");
    }

    @Override
    public void stop() {
        System.out.println("Tesla is stopping with regenerative braking...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Tesla battery is charging...");
    }
}

// Driver class
public class InterfaceExample2 {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start();
        myTesla.chargeBattery();
        myTesla.ecoMode(); // Using default method from interface
        myTesla.stop();
    }
}
