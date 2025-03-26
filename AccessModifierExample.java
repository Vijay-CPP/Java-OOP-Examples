import java.util.Date;

class Employee {
    private int id;  // Private: Accessible only within this class
    protected String name;  // Protected: Accessible within the same package and by subclasses
    String department;  // Default (No modifier): Accessible within the same package
    public double salary;  // Public: Accessible from anywhere
    private Date dateOfJoining;  // Private: Not accessible outside this class

    // Constructor to initialize Employee details
    public Employee(int id, String name, String department, double salary, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    // Public getter method to access the private ID
    public int getId() {
        return id;
    }

    // Public setter method to modify the private ID
    public void setId(int id) {
        this.id = id;
    }

    // Public getter method to access private Date of Joining
    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    // Method to display the details of the employee
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
    }
}

public class AccessModifierExample {
    public static void main(String[] args) {
        // Creating Employee objects using the constructor
        Employee emp1 = new Employee(1, "John", "HR", 50000.0, new Date());
        Employee emp2 = new Employee(2, "Jane", "IT", 60000.0, new Date());

        // Displaying Employee details
        System.out.println("Employee 1 details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 details:");
        emp2.displayDetails();

        // Accessing and modifying private variables using public methods
        emp1.setId(101);  // Updating ID using setter
        System.out.println("\nUpdated Employee 1 ID: " + emp1.getId()); // Getting updated ID
    }
}
