public class AbstractInterfaceNotes {

    // ************* ABSTRACT CLASS ***********************
    // An abstract class is a class that can serve as a superclass, but cannot be directly instantiated.
    // Abstract methods are methods with no body, they only provide information about the method name, return type, and parameters.
    // Any class that inherits from an abstract class must define all abstract methods, or itself be abstract. Another way to say this is that to instantiate a class, it must not be abstract, and have no abstract methods.
    // We would use an abstract class when we want to force subclasses to provide a unique implementation for a method.
    // TODO:
    //  abstract class Employee {
    //    public abstract String work();
    //  }
    //  class Accountant extends Employee {
    //    public String work() {
    //        return "crunching numbers";
    //    }
    //  }
    // Above, the Accountant class must define a work method because it inherits from Employee and is not defined as abstract.
    // TODO:
    //  // ERROR!
    //  Employee tim = new Employee();
    //  // okay
    //  Employee bob = new Accountant();
    // An abstract class is used to represent something that needs to be extended.
    // Let's say that we want to model employees and their different job positions in an application. We know that every employee will have a name, and belong to a department, but the work that each employee does is dependent on their position.
    // TODO:
    //  abstract class Employee {
    //    protected String name;
    //    protected String department;
    //    public Employee(String name, String department) {
    //        this.name = name;
    //        this.department = department;
    //    }
    //    public String getName() {
    //        return name;
    //    }
    //    public String getDepartment() {
    //        return department;
    //    }
    //    public abstract String work();
    //  }
    //
    // TODO:
    //  class Developer extends Employee {
    //    public String work() {
    //        return "writing code";
    //    }
    //  }
    //  class Manager extends Employee {
    //    public String work() {
    //        return "holding meetings";
    //    }
    //  }
    // Each subclass has a unique implementation of work, and we prevent duplicating code that deals with handling employee names or departments.

    // ************* INTERFACES ***********************
    // Methods form the object's interface with the outside world.
    // In its most common form, an interface is a group of related methods with empty bodies.
    // An interface is an abstract class that follows these rules:
    //    all methods are public and abstract.
    //    all properties are public static and final.
    //    no static methods.
    // Interfaces are used to define the behaviour of our objects, and thus are typically only used to define methods, and occasionally class constants (public static properties). Interfaces allow us to define the way that our objects interact with the rest of our application.
    // TODO:
    //  public interface WritesCode {
    //    Bug[] writeCode(int numberOfLines);
    //    boolean debug(Bug bug);
    //    void drinkCoffee();
    //    // could return null!
    //    StackOverflowLink searchForAnswer(Bug bug);
    //    BrokenKeyboard smashKeyboard(Keyboard k);
    //  }
    //  class Developer implements WritesCode {
    //    /* implementations go here */
    //  }
    // The name of the interface describes what the object does
    // The methods and parameter types convey what the object does, but not how (the implementation)
    // Interfaces are implemented by classes with the implements keyword. Like with abstract classes, a class that implements an interface must provide an implementation for each method defined on the interface.
    // Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.
    // TODO: The Developer class above must provide implementations for all of the methods in WritesCode because it implements the WritesCode interface. If it does not, the code will not compile.
    // While interfaces cannot be directly instantiated, they can be used in most places a class is expected
    // This allows our application to be less tightly coupled; that is, we define the implementation of the code independent of where it is used. This allows us to easily swap out implementations for an interface as the business requirements of our application change.
    // TODO:
    //  interface Formatter {
    //    String display(User user);
    //  }
    //
    // TODO:
    //  class ConsoleFormatter implements Formatter {
    //    public String display(User user) {
    //        return "--------------------" +
    //            "\n  name:  " + user.getName() +
    //            "\n  email: " + user.getEmail();
    //    }
    //  }
    // Somewhere in our application is a main method, and we might have code that looks like the following in it:
    // TODO:
    //  Formatter fmt = new ConsoleFormatter();
    //  fmt.display(loggedInUser);
    //  for (User user : searchResults) {
    //    fmt.display(user);
    //  }
    // We might have many uses of the fmt object throughout the code, but only 1 reference to the ConsoleFormatter class. Instead, all of our code is tied to the interface, not the implementation.
    // If we needed to change the application to instead output HTML for a web view, we would write another implementation for Formatter that instead outputs HTML.
    // TODO:
    //  class HTMLFormatter implements Formatter {
    //    public String display(User user) {
    //        return String.format(
    //            "<div class=\"user\"><h2>%s(%s)</h2></div>",
    //            user.getName(), user.getEmail()
    //        );
    //    }
    //  }
    // And then change the single line of code that references ConsoleFormatter to instead reference HTMLFormatter. If we wrote our code to depend on the interface and not the implementation, that should be the only change we need to make, the rest of our application can remain the same.
    // TODO:: More generally speaking, if we write our code such that it relies on interfaces instead of implementations, it allows us to easily switch out the implementation, and for our code base to be better structured and more flexible.

// Abstract Classes
//
//    Can use instance as well as static variables and constants.
//    Can define regular methods that contain code and abstract methods that don’t contain code.
//    Can define static methods.
//    Make use of the abstract and extends keywords.
//    Contain
//        instance and static variables.
//        instance and static constants.
//        instance and static methods.
//
// Interfaces
//
//    A class can directly implement multiple interfaces.
//    Any object created from a class that implements an interface can be used wherever the interface is accepted.
//    Can be used in place of classes to decouple parts of our code from implementation details.
//    Make use of the implements and interface keywords.
//    Contain1
//        abstract methods.
//        static constants.
//
// In Java, any class can both extend abstract classes and implement interfaces.
}
