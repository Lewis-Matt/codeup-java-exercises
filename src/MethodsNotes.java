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

    public static void main(String[] args) {
        // Call the methods here in main - arguments passed in must be the same type as the parameters the method is defined with
        System.out.println(sayGreeting("Matt"));
        greet("Howdy", "Matt");
        // When we call sayHello, the code that will be run depends on the arguments we pass to it:
        sayHello(); // V2
        sayHello("Codeup"); // V3
        sayHello("Hey", "You"); // V4
        // Even though both version 1 and 3 are defined with a single parameter, the parameter's type is different for both of them. Because we are now passing a value of type int, version 1 will be invoked:
        sayHello(3); // V1

    }
}