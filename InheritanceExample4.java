// Grandparent class
class Animal {
    void breathe() {
        System.out.println("Animal is breathing.");
    }
}

// Parent class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

// Child class
class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks.");
    }
}

// Example of multilevel inheritance in Java
public class InheritanceExample4 {
    public static void main(String[] args) {
        Human human = new Human();
        human.breathe();
        human.walk();
        human.speak();
    }
}
