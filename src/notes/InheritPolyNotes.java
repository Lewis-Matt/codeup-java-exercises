package notes;

public class InheritPolyNotes {
// We can define classes that extend, or inherit from another class with the extends keyword in the class definition. We call these subclasses, and the classes that are being inherited from / extended superclasses.
//  A subclass inherits all the fields of it's superclass, and can re-use any of it's functionality.

// TODO:
//    class Employee extends Person {
//        public Employee(String employeeName) {
//            super(employeeName);
//        }
//    }
//  Employee john = new Employee("John");
//  john.sayHello();
//  System.out.println(john.name);

// We never defined a sayHello method or a name property on the Employee class, it is simply using the fields that it inherited from the Person class.

// In addition to using fields from the superclass, a subclass can add new fields
// Inheritance is one-directional; meaning, subclasses gain access to the fields of their superclasses, but not the other way around.
// Subclasses can override methods on the superclass. To do so, the subclass must define a method with the same name, return type, and parameters as in the superclass. This allows the subclass to provide it's own implementation of a method.
// TODO:
//  class Employee extends Person {
//    private double salary;
//    public void doWork() {
//        System.out.println("Work, work...");
//    }
//  // method overriding //
//    public void sayHello() {
//        System.out.println("How can I help you?");
//    }
//  }

// private keyword means that fields marked as private cannot be referenced outside of the class that defines them. This includes subclasses.
//
//Often times it is the case that we want a field to be visible only to superclasses and subclasses, but not to classes that use instances of these classes.
//
//To provide this functionality, we can also designate a field as protected. This means that the field is not visible outside of the class, but is visible to classes that extend the class that the field is defined in.
    // ********* The private modifier specifies that the member can only be accessed in its own class. The protected modifier specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package. ***********

    // Private
    //
    //Like you'd think, only the class in which it is declared can see it.
    //Package Private
    //
    //It can only be seen and used by the package in which it was declared. This is the default in Java (which some see as a mistake).
    //Protected
    //
    //Package Private + can be seen by subclasses or package members.
    //Public
    //
    //Everyone can see it.
// TODO:
//  class Person {
//    protected String name;
//    private int age;
//  }
//  class Employee extends Person {
//    public String getName() {
//        return this.name;
//    }
//    public int getAge() {
//        // ERROR!
//        return this.age;
//    }
//  }
// Any attempts to access the name or age properties outside of the Person or Employee classes will cause the code not to compile

// The super keyword allows us to access a superclasses methods and constructors from within a subclass.
// TODO:
//  class SuperHero extends Person {
//    private String alterEgo;
//    public SuperHero(String name, String alterEgo) {
//        super(name);
//        this.alterEgo = alterEgo;
//    }
//    public String getName() {
//        return alterEgo;
//    }
//    public String getSecretIdentity() {
//        return super.getName();
//    }
//  }
// Used super to reference the single argument constructor defined in the Person class, allowing us to run the code in the superclass constructor, which in this case is necessary, as name is defined as private.
// SuperHero overrides the getName method, but we can still have access to the getName method on the Person class through the super keyword.
// TODO:
//  SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
//  System.out.println(theManOfSteel.getName()); // "Superman"
//  System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"

// Polymorphism is a feature of inheritance that allows us to treat objects of different subclasses that have the same superclass as if they were of the superclass type.
// Methods or variables that are defined with a superclass type can accept objects that are a subclass of that type.
//   TODO:
//    public class Employee {
//        public String work() {
//            return "Filling out TPS reports";
//        }
//    }
//   TODO:
//    public class Manager extends Employee {
//        public String work() {
//            return "Managing employees";
//        }
//    }
//   TODO:
//    class PolymorphismDemo {
//        public void doWork(Employee e) {
//            System.out.println(e.work());
//        }
//   TODO:
//        public static void main(String[] args) {
//            Employee one = new Employee();
//            Employee two = new Manager();
//   TODO:
//            doWork(one); // "Filling out TPS reports"
//            doWork(two); // "Managing employees"
//        }
//    }
// Manager is a subclass of Employee
// Because doWork is defined as accepting an object of type Employee, we can call it with an object of the type Employee, or any class that extends Employee.
// When the work method is called, the implementation that is used depends on the type of the object that was passed in, not the type of the reference. In this example, the reference is of type Employee, but we can pass in objects of type Employee or of type Manager.

    // The methods that are able to be called on an object are defined by the type of the reference; that is to say, the type of the variable or parameter that holds the object. The method implementation that is used is determined by the type of the object itself.

// We've seen the final keyword used to prevent reassignment, but we can also use it to prevent inheritance or overriding. It can also be used with method parameters, like with variables, to prevent reassignment.
    // TODO: Preventing inheritance:
    //  public final class Movie { }

    // TODO: Preventing parameter re-assignment:
    //  public int increment(final int x) {
    //    x += 1; // ERROR!
    //    return x;
    //  }

    // TODO: Preventing method overriding:
    //  public class Employee {
    //    public final String work() {
    //        return "Filling out TPS reports";
    //    }
    //  }
    //  public class Developer extends Employee {
    //    // ERROR!
    //    public String work() {
    //        return "Writing code";
    //    }
    //  }

}
