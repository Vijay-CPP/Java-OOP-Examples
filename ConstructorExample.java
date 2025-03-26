import java.util.Date;

class Employee {
    int id;
    String name;
    String department;
    double salary;
    Date dateOfJoining;

    // 1. Default Constructor (No-argument constructor)
    public Employee() {
        System.out.println("Default Constructor Called!");
        this.id = 0;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
        this.dateOfJoining = new Date();
    }

    // 2. Parameterized Constructor
    public Employee(int id, String name, String department, double salary, Date dateOfJoining) {
        System.out.println("Parameterized Constructor Called!");
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    // 3. Copy Constructor
    public Employee(Employee other) {
        System.out.println("Copy Constructor Called!");
        this.id = other.id;
        this.name = other.name;
        this.department = other.department;
        this.salary = other.salary;
        this.dateOfJoining = new Date(other.dateOfJoining.getTime()); // Deep copy
    }

    // 4. Static Constructor (Handled using a Static Block in Java)
    static {
        System.out.println("Static Constructor (Static Block) Called!");
    }

    // 5. Constructor Overloading (Multiple Constructors)
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.department = "Not Assigned";  // Default value
        this.salary = 0.0;
        this.dateOfJoining = new Date();
        System.out.println("Overloaded Constructor (id, name) Called!");
    }

    // 6. Constructor Chaining
    public Employee(int id, String name, String department) {
        this(id, name); // Calls the constructor with (id, name)
        this.department = department;
        System.out.println("Constructor Chaining Called!");
    }

    // 7. Private Constructor (Singleton Pattern Example)
    private static Employee singletonInstance;

    private Employee(String singleton) {
        this.id = -1;
        this.name = "Singleton Instance";
        System.out.println("Private Constructor Called!");
    }

    public static Employee getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Employee("singleton");
        }
        return singletonInstance;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Default Constructor
        Employee emp1 = new Employee();
        emp1.displayDetails();
        System.out.println();

        // Parameterized Constructor
        Employee emp2 = new Employee(1, "John", "HR", 50000.0, new Date());
        emp2.displayDetails();
        System.out.println();

        // Copy Constructor
        Employee emp3 = new Employee(emp2);
        emp3.displayDetails();
        System.out.println();

        // Overloaded Constructor
        Employee emp4 = new Employee(2, "Alice");
        emp4.displayDetails();
        System.out.println();

        // Constructor Chaining
        Employee emp5 = new Employee(3, "Bob", "Finance");
        emp5.displayDetails();
        System.out.println();

        // Private Constructor - Singleton Example
        Employee singleton1 = Employee.getSingletonInstance();
        Employee singleton2 = Employee.getSingletonInstance();
        System.out.println("Are both singleton instances the same? " + (singleton1 == singleton2));
    }
}
