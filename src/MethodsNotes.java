public class MethodsNotes {
    // The most basic syntax for a method definition looks like this:
    // public static returnType methodName([param1[, param2[, ...]]) {
    //    // the statements of the method
    //    // a return statement, if a return type is declared
    //}
    // public - other classes can see this method
    // static - the method belongs to the class (rather than instances of it)
    // If nothing is returned, use void. Otherwise, put a return type.
    public static String sayGreeting(String name) {
        // If a return type is specified, must have a return statement (or you get a compile-time error)
        // Void methods can still use return to exit early
        return String.format("Hello, %s!", name);
    }

    // Another example
    public static void greet(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    ////////////////////////////////////////HELLO VERSIONS////////////////////////////////////////////////////////
    // Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
    //Overloaded methods can call other versions of themselves, and are commonly used to provide default values for arguments.
    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }

    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }

    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }

    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }
    // Notice that versions 2 and 3 are calling version 4. This is an example of using method overloading to provide default values for methods.

    //////////////////////////////////////////CHANGE ME//////////////////////////////////////////////////////
    // In Java, parameters are passed by value. This means that a copy of the value passed is created inside of a method, and that reassigning a value inside of a method will not change it outside of the method.
    public static String changeString(String s) {
        // Changes passed in string to:
        s = "Wub a lub a dub dub";
        return s;
    }

    //////////////////////////////////////RECURSION//////////////////////////////////////////////////////////
    // The core idea of recursion is creating a method that calls itself, but with different parameters than were originally passed.
    // Counting from 5 to 1 using recursion
    public static void count(int n) {
        if (n <= 0) { // Base case
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        // Calls itself = recursion
        count(n - 1);
    }

    // Method that calculates raising a given number to a given power using a loop
    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    // Using recursion
    public static long getRecursivePower(int base, int exponent) {
        if (exponent == 0) { // Base case 1
            return 1;
        } else if (exponent == 1) { // Base case 2
            return base;
        } else if (exponent == 2) { // Base case 3
            return (long) base * base;
        }
        return base * getRecursivePower(base, exponent - 1);
    }

    /////////////////////////////////////////MAIN METHOD///////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Call the methods here in main - arguments passed in must be the same type as the parameters the method is defined with
        System.out.println(sayGreeting("Matt"));
        greet("Howdy", "Matt");

////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------HELLO VERSIONS------------");
        // When we call sayHello, the code that will be run depends on the arguments we pass to it:
        sayHello(); // V2
        sayHello("Codeup"); // V3
        sayHello("Hey", "You"); // V4
        // Even though both version 1 and 3 are defined with a single parameter, the parameter's type is different for both of them. Because we are now passing a value of type int, version 1 will be invoked:
        sayHello(3); // V1

////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------CHANGE ME------------");
        String changeMe = "hello codeup!";
        changeString(changeMe);
        // Even though the String variable inside of changeString is re-assigned, the changeMe variable will still have the same value after the method call. This is because pass-by-value means it is just passing a copy of the value in changeMe, w/o changing the original value in changeMe.
        System.out.println(changeMe);
        System.out.println(changeString(changeMe));

////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------RECURSION------------");
        count(5);
        System.out.println(getPower(3, 4));
        System.out.println(getRecursivePower(3, 4));
    }
}