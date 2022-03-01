package notes;
// TODO:////////////////////////////////////LESSON NOTES//////////////////////////////////////

// In contrast to instance fields are static fields, those that belong to a class as a whole. Static fields are accessible through the class itself. In other words, they are accessible without creating an instance of the class.
// Ex: System.out.println(Math.PI); // 3.141592653589793
// Notice that we didn't need to write any code that instantiates the Math class, we simply add a . after the class name and refer to the static field.
// Static fields should contain information that all instances will use, or methods and fields that are meant to be accessed only statically.
// *** Static fields can be referenced by instance methods. But instance fields cannot be referenced in a static context. ***

// Arithmetic class is only meant to be referenced statically, meaning that we never create instances of it; we just refer to the methods and fields through the class name:
//class Arithmetic {
//    // static property
//    public static double pi = 3.14159;
//
//    // static methods
//    public static int add(int x, int y) {
//        return x + y;
//    }
//}
//    class MathTest {
//        public static void main(String[] args) {
//            Arithmetic.pi; // 3.14159
//
//            Arithmetic.add(5, 5);      // 10
//        }
//    }
// TODO: CONSTRUCTORS
// A constructor is a special method that is called when an object is created. A constructor has the same name as the class and does not define a return type. Constructors, like any other method, can accept arguments and be overloaded.
// class Person {
//    public String name;
//
//    // the Person constructor
//    public Person() {
//        System.out.println("A Person is being created!");
//    }
//
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();
//    }
//}
// A common use case for constructors is to set, or provide default values for, an object's fields.
class Student {
    public String name;
    public String cohort;

    // Here we see an example of an overloaded constructor; there are two definitions that differ in parameter count.
    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }

    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }

    public static void main(String[] args) {
        Student s1 = new Student("notes.Student A");
        Student s2 = new Student("notes.Student B", "Voyagers");
        System.out.println(s1.getInfo()); // "name: notes.Student A cohort: Unassigned"
        System.out.println(s2.getInfo()); // "name: notes.Student B cohort: Voyagers"
    }
}

// The this keyword provides us a way to refer to the current instance. You can think of this as saying "this object". You can only use the this keyword inside of an instance method, as it is an error to do so elsewhere.
class PersonLesson {
    private String name;

    // Instance method
    public PersonLesson(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("%s says hello!", this.name);
    }
}

// The this keyword can also be used to call other constructors.
class StudentTwo {
    public String name;
    public String cohort;

    // Now, in the single argument constructor, instead of duplicating the code to assign to the object's fields, we call the constructor that already has this code defined.
    public StudentTwo(String name) {
        this(name, "Unassigned");
    }

    // The constructor that already has name and cohort defined
    public StudentTwo(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }
}

// TODO: You don't have to provide any constructors for your class, but you must be careful when doing this. The compiler automatically provides a no-argument, default constructor for any class without constructors. This default constructor will call the no-argument constructor of the superclass. In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does. If your class has no explicit superclass, then it has an implicit superclass of Object, which does have a no-argument constructor.

// TODO: Visibility

//  Refers to how a class or instance field is allowed to be accessed. It allows us to encapsulate the data in our classes; that is, only expose what is necessary to other classes and objects.
// The public keyword means that the field is accessible from everywhere.
// When a field is defined as private, it is only accessible within the class that defines it.
// A common pattern in Java is to define classes with private fields, and create methods to allow access to those fields.
// Here the grade field is defined as private, but we've also created a method to allow access to (but not re-assigning) the field named shareGrade.
class StudentThree {
    public String name;
    private double grade;

    public StudentThree(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double shareGrade() {
        return grade;
    }
}

// The code below uses the notes.Student class we've just defined:
class StudentTest {
    public static void main(String[] args) {
        StudentThree student = new StudentThree("John Doe", 82.4);

        System.out.println(student.name); // "John Doe"
        // DON'T DO THIS - private properties can't be accessed outside the class
//        System.out.println(student.grade);
        System.out.println(student.shareGrade()); // Do this instead
    }
}
// TODO: All visibility types in Java:
/*
Modifier 	                class 	package 	subclass 	project
public 	                    y 	        y 	        y 	        y
protected 	                y 	        y 	        y 	        n
no modifier (package private)y 	        y 	        n 	        n
private 	                y 	        n 	        n 	        n
*/
