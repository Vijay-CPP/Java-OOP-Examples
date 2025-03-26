class Employee implements Cloneable {  
    int id;  
    String name;  

    // Constructor
    Employee(int id, String name) {  
        this.id = id;  
        this.name = name;  
    }  

    // Overriding toString() method
    @Override
    public String toString() {  
        return "Employee{id=" + id + ", name='" + name + "'}";  
    }  

    // Overriding hashCode() method
    @Override
    public int hashCode() {  
        return id * 31;  // Simple hash function
    }  

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {  
        if (this == obj) return true;  // Check if both references point to the same object  
        if (obj == null || getClass() != obj.getClass()) return false;  
        Employee emp = (Employee) obj;  
        return id == emp.id && name.equals(emp.name);  
    }  

    // Overriding finalize() method - called when the object is garbage collected
    // why protected? because it is a method of the Object class and we are overriding it
    @Override
    protected void finalize() throws Throwable {  
        System.out.println("Finalize method called for Employee: " + name);  
    }  

    // Implementing clone() method - creates a new object as a shallow copy of the current object
    // why protected? because it is a method of the Object class and we are overriding it
    @Override
    protected Object clone() throws CloneNotSupportedException {  
        return super.clone();  
    }  
}

class SharedResource {
    private boolean dataAvailable = false;

    synchronized void produce() {
        try {
            System.out.println("Producer: Producing data...");
            Thread.sleep(2000); // Simulate time-consuming task
            dataAvailable = true;
            System.out.println("Producer: Data is ready! Notifying consumer...");
            notify(); // Notify the waiting thread (consumer)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!dataAvailable) {  // Check if data is available
                System.out.println("Consumer: Waiting for data...");
                wait();  // Wait until notified
            }
            System.out.println("Consumer: Data received! Processing...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ObjectMethodsExample {  
    public static void main(String[] args) throws CloneNotSupportedException {  
        // Demonstrating toString(), hashCode(), equals()
        Employee emp1 = new Employee(1, "John");  
        Employee emp2 = new Employee(1, "John");  
        Employee emp3 = new Employee(2, "Jane");  

        System.out.println("emp1.toString(): " + emp1.toString());  
        System.out.println("emp2.toString(): " + emp2.toString());  

        System.out.println("emp1.hashCode(): " + emp1.hashCode());  
        System.out.println("emp2.hashCode(): " + emp2.hashCode());  

        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true  
        System.out.println("emp1.equals(emp3): " + emp1.equals(emp3)); // false  

        // Demonstrating getClass() method
        System.out.println("emp1 class: " + emp1.getClass().getName());  

        // Demonstrating clone() method
        Employee empClone = (Employee) emp1.clone();  
        System.out.println("Cloned Employee: " + empClone.toString());

        // Demonstrating finalize() method (not guaranteed to execute immediately)
        emp1 = null;  
        emp2 = null;  
        System.gc(); // Requesting garbage collection (May or may not invoke finalize)

        // Demonstrating wait(), notify()
        SharedResource resource = new SharedResource();

        Thread consumerThread = new Thread(resource::consume, "Consumer");
        Thread producerThread = new Thread(resource::produce, "Producer");

        consumerThread.start(); // Start consumer first (it will wait)
        producerThread.start(); // Start producer after
    }  
}

