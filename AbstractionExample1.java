// Demonstrating Abstraction in Java
abstract class Device {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Device {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}


public class AbstractionExample1 {
    public static void main(String[] args) {
        Device remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}
