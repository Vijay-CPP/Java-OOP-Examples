class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Dynamic method dispatch
public class PolymorphismExample3 {
    public static void main(String[] args) {
        Animal obj;

        obj = new Dog();
        obj.sound();

        obj = new Cat();
        obj.sound();
    }
}

/*
Late Binding:
    Method resolution happens at runtime.
    Enables dynamic method dispatch in polymorphism (e.g., overridden methods).
    Provides flexibility but with a slight performance cost.

Early Binding:
    Method resolution happens at compile time.
    Used for static, final, and private methods (non-overridable).
    Offers better performance but lacks runtime flexibility.

Virtual Functions:
    Non-static methods in Java are virtual by default.
    Supports late binding for achieving runtime polymorphism.
    Ensures the overridden method is executed based on the actual object.
 */