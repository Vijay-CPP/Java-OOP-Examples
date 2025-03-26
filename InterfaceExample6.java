// Marker Interface (Empty Interface)
interface AdminAccess {}

// User class implementing the marker interface
class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}

// Admin class implementing the marker interface
class Admin extends User implements AdminAccess {
    public Admin(String name) {
        super(name);
    }
}

// Access control class
class AccessControl {
    public static void grantAdminAccess(User user) {
        if (user instanceof AdminAccess) {
            System.out.println("Access granted to " + user.name);
        } else {
            System.out.println("Access denied for " + user.name);
        }
    }
}

// Driver class
public class InterfaceExample6  {
    public static void main(String[] args) {
        User normalUser = new User("John");
        Admin adminUser = new Admin("Alice");

        AccessControl.grantAdminAccess(normalUser); // Output: Access denied for John
        AccessControl.grantAdminAccess(adminUser);  // Output: Access granted to Alice
    }
}
