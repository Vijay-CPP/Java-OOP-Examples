import java.util.Date;

class Employee{
    int id;
    String name;
    String department;
    double salary;
    Date dateOfJoining;

    // Method to display the details of the employee
    void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "John";
        emp1.department = "HR";
        emp1.salary = 50000.0;
        emp1.dateOfJoining = new Date();

        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.name = "Jane";
        emp2.department = "IT";
        emp2.salary = 60000.0;
        emp2.dateOfJoining = new Date();

        // Display the details of the employees
        System.out.println("Employee 1 details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 details:");
        emp2.displayDetails();
    }
}