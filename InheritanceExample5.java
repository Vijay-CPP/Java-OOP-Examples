// Base interface
interface Animal {
    void eat();
}

// Intermediate class implementing Animal
class Mammal implements Animal {
    @Override
    public void eat() {
        System.out.println("Mammal eats.");
    }
}

// Another interface
interface Aquatic {
    void swim();
}

// Child class inheriting Mammal and implementing Aquatic
class Whale extends Mammal implements Aquatic {
    public void swim() {
        System.out.println("Whale swims.");
    }
}

// Example of inheritance and interface in Java
public class InheritanceExample5 {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.eat();  // From Mammal (which extends Animal)
        whale.swim(); // From Aquatic interface
    }
}
