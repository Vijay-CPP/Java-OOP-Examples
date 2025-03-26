// Outer class containing a nested interface
class OuterClass {
    interface InnerInterface {
        void showMessage();
    }
}

// Outer interface containing another nested interface
interface OuterInterface {
    void display();

    interface NestedInterface {
        void nestedMethod();
    }
}

// Class implementing the interface inside a class
class InnerInterfaceImpl implements OuterClass.InnerInterface {
    public void showMessage() {
        System.out.println("Implemented Inner Interface inside a Class!");
    }
}

// Class implementing the nested interface inside another interface
class NestedInterfaceImpl implements OuterInterface.NestedInterface {
    public void nestedMethod() {
        System.out.println("Implemented Nested Interface inside another Interface!");
    }
}

// Driver class
public class InterfaceExample7 {
    public static void main(String[] args) {
        OuterClass.InnerInterface obj1 = new InnerInterfaceImpl();
        obj1.showMessage(); // Output: Implemented Inner Interface inside a Class!

        OuterInterface.NestedInterface obj2 = new NestedInterfaceImpl();
        obj2.nestedMethod(); // Output: Implemented Nested Interface inside another Interface!
    }
}
