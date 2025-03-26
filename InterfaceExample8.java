// First parent interface
interface Printable {
    void print();
}

// Second parent interface
interface Showable {
    void show();
}

// Child interface extending both Printable and Showable (Multiple Inheritance)
interface Displayable extends Printable, Showable {
    default void displayInfo() {
        System.out.println("This is a default method inside Displayable.");
    }
}

// Class implementing the extended interface
class Document implements Displayable {
    public void print() {
        System.out.println("Printing the document...");
    }

    public void show() {
        System.out.println("Showing the document preview...");
    }
}

// Driver class
public class InterfaceExample8 {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();        // Output: Printing the document...
        doc.show();         // Output: Showing the document preview...
        doc.displayInfo();  // Output: This is a default method inside Displayable.
    }
}
