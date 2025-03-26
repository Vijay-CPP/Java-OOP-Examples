import java.util.Date;

class Employee{
    int id;
    String name;
    String department;
    double salary;
    Date dateOfJoining;

    // Getter method for id
    int getId(){
        return id;
    }

    // Setter method for id
    void setId(int id){
        this.id = id;
    }

    // Getter method for name
    String getName(){
        return name;
    }

    // Setter method for name
    void setName(String name){
        this.name = name;
    }

    // Getter method for department
    String getDepartment(){
        return department;
    }

    // Setter method for department
    void setDepartment(String department){
        this.department = department;
    }

    // Getter method for salary
    double getSalary(){
        return salary;
    }

    // Setter method for salary
    void setSalary(double salary){
        this.salary = salary;
    }

    // Getter method for dateOfJoining
    Date getDateOfJoining(){
        return dateOfJoining;
    }

    // Setter method for dateOfJoining
    void setDateOfJoining(Date dateOfJoining){
        this.dateOfJoining = dateOfJoining;
    }

    // Method to display the details of the employee
    void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        // Using the setter methods to set the values of the instance variables
        emp1.setId(1);
        emp1.setName("John");
        emp1.setDepartment("HR");
        emp1.setSalary(50000.0);
        emp1.setDateOfJoining(new Date());

        Employee emp2 = new Employee();
        // Using the setter methods to set the values of the instance variables
        emp2.setId(2);
        emp2.setName("Jane");
        emp2.setDepartment("IT");
        emp2.setSalary(60000.0);
        emp2.setDateOfJoining(new Date());

        // Using the getter methods to get the values of the instance variables
        System.out.println("Employee 1 details:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Date of Joining: " + emp1.getDateOfJoining());

        // Display the details of the employees
        System.out.println("\nEmployee 2 details:");
        emp2.displayDetails();
    }
}
