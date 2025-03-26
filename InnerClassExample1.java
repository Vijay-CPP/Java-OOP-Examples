// Java Program to Demonstrate Nested class 

// Class 1
// Helper classes
class Outer {
    // Outer method
    void outerMethod()
    {
        System.out.println("Inside outerMethod");

        Inner inner = new Inner();
        inner.show();
    }

    // Class 2
    // Simple nested inner class
    class Inner {

        // show() method of inner class
        public void show()
        {

            // Print statement
            System.out.println("In a nested class method");
        }
    }
}

// Class 2
// Main class
class InnerClassExample1{

    // Main driver method
    public static void main(String[] args)
    {

        // Note how inner class object is created inside
        // main()
        Outer.Inner in = new Outer().new Inner();

        // Calling show() method over above object created
        in.show();


        // Creating object of outer class
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
