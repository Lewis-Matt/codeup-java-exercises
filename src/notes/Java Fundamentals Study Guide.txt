# Java Fundamentals

## Main Concepts to be Assessed

- Object Oriented Programming
- Method Overriding and Method Overloading
- Arrays
- Inheritance and Polymorphism
- Interfaces
- Collections
- Exceptions and Error Handling

## Currently not being assessed:

- Annotations like @SuppressWarnings or @Deprecated
- Files I/O
- Abstract Classes
- Deployment and Dependencies
- Testing Code with JUnit

## Java Fundamentals Checklist

The following are several points of competency and skill that are intended to help identify areas of additional practice and study. Not all answers are found in the Codeup curriculum.

## Knowledge

### Java I

- [x] I can explain how Java code runs: from being written to executing on an operation system.
	Source -> javac -> bytecode -> JVM runs bytecode

- [x] I can explain the difference between a primitive type and a reference type in Java.
	Primitives hold a fundamental value (simple bit patterns).
	References hold a reference (e.g. the address to) an object.

- [x] I can name several primitive types in Java.
	boolean t/f
	char 	16-bit
	byte 	8-bit
	short 	16-bit
	int 	32-bit
	long 	64-bit
	float 	32-bit
	double 	64-bit

- [x] I can explain why multiple number primitive types are used.
	memory - a long uses double the amount of memory that an int does. Use whatever primitive meets your use-case (you can put a short in an int, but not an int in a short)

- [x] I can give an example of implicit and explicit casting.
	implicit - putting something small into a larger container (e.g. a short in an int will implicity cast to an int) - called 'widening'
	short i = 10;
	int j = i;
	
	explicit - putting something that is in a large container into a smaller one. If we had a number that was 12-bits, but we had it in an int (32 bits), it would fit
	into a short (16 bits) - called 'narrowing'
	int i = 50;
	short j = (short) i;

- [x] I can explain the difference between a runtime and compile-time error.
	compile-time: won't compile, usually due to semantics or syntax
	runtime: crashes/stops program while running, usually exceptions of some sort (e.g. writing to a file that doesn't exist).

- [x] I can identify the major editions of Java.
	1.5 = Java5, Java8, Java11

- [x] I can define what a Java wrapper class is.
	Wrapper classes are objects encapsulating primitive types. Most Java classes only work with objects.
	For example, ArrayList can only hold objects (not primitives). So you cannot: ArrayList<int> myNumber = new ArrayList<int>();
		But you can: ArrayList<Integer> myNumber = new ArrayList<Integer>();
	Integer myInt = 5;

### Java II

- [x] I can articulate what OOP is.
	Everything is designed around objects rather than functions/logic. Focus on reusability.

- [x] I can identify the four levels of visibility for a class/field/method and the identifiers used.
	Public 
		Anything, anywhere has access
	Private
		Just the class has access
	Protected
		Everything in its package(directory) has access, as well as subclasses in other packages
	default
		Essentially package-private: Class and package has access

	Modifier 	Class 	Package 	Subclass 	World
	public 			Y 		Y 			Y 		Y
	protected 		Y 		Y 			Y 		N
	no modifier 	    Y 		Y 			N 		N
	private 		Y 		N 			N 		N

- [x] I know what class of static methods is often used when working with arrays.
	java.util.Arrays

- [x] I can explain the difference between static (class) fields/methods and instance fields/methods.
    static fields can only be altered by instances via public methods that are part of the class

- [x] I can explain the difference between method overloading and method overriding.
    Overload: methods that have the same name and return type, but may have different parameters
    Override: method in the class/superclass that does something but is overridden by an instance of that class

- [x] I can identify the four pillars of object-oriented programming and give examples of each one.
	Abstraction Encapsulation Inheritance Polymorphism

- [x] I can describe the differences between interfaces and abstract classes and their use cases.
    Abstract classes should be used primarily for objects that are closely related, whereas interfaces are best suited for providing a common functionality to unrelated classes.
    Both are for Abstraction and Inheritance, interface sole purpose is polymorphism (abstract classes also use polymorphism)
    Interface - multiple inheritance - only abstract methods/fields - not a class so no state, no constructor
    Abstract Class - subclass to an abstract class must implement the abstract class methods, or be abstract itself - public/abstract methods

- [x] I can generally describe what the Java Collections Framework is and specifically talk about the differences between a list, set, and map.
    https://www.javatpoint.com/collections-in-java
    Interfaces:
    iterable->collections->
        list - ArrayList Class, LinkedList Class, etc. - ordered collections/sequences: can have duplicates
        queue - used for holding elements prior to processing
        set - HashSet: cannot contain duplicate values
    map - does not implement collection as it deals with key/values, where collections are just values. no duplicates
        hashMap - no order
        treeMap - sorted

- [x] I can explain the difference between a checked and unchecked exception.
    Checked exceptions must be handled in our code, either with a try-catch, or by declaring them in the method signature with the throws keyword.
    Java verifies checked exceptions at compile-time.
    If a program throws an unchecked exception, it reflects some error inside the program logic. We don't have to declare unchecked exceptions in a method with the throws keyword.
    “If a client can reasonably be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception, make it an unchecked exception.”

- [x] I can explain what a Java annotation is, why they are used, and give examples.
    A form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate
    https://docs.oracle.com/javase/tutorial/java/annotations/basics.html

- [x] I can explain the difference between the throws and throw keywords with regard to exceptions.
    Throws clause is used to declare an exception, which means it works similar to the try-catch block.
    On the other hand throw keyword is used to throw an exception explicitly.
    Throw is followed by an instance of Exception class and throws is followed by exception class names:
    throw new ArithmeticException("Arithmetic Exception");      // used in method body
    throws ArithmeticException;       // used in method signature

## Skills

### Java I

- [x] I can write a hello world Java program from scratch.
    public static void main(String [] args) {
        sout("Hello World")
    }

- [x] I can write Java control statements (if, if/else, switch, ternary) and loops (while, do-while, for, for-each) from memory.
- [x] I can write examples of the 8 Java primitive types.
- [x] I can write examples of explicit casting and implicit casting.
- [x] I can convert a numeric string to a number and a number to a numeric string.
    Integer.valueOf() to Convert a String to an Integer (returns an integer object which is equivalent to a new Integer(Integer.parseInt(s))
        try/catch NumberFormatException
    String.valueOf(), Integer.toString(), String.format()

- [x] I can define a constant.
    final

- [x] I can write a program that takes in user input and returns an output to the user.
    Scanner sc = new Scanner(System.in)
    String input = sc.next();

- [x] I can compare two string values.
    .equals

- [x] I can write out a program comprised of multiple methods.
- [x] I can get the length of string, trim it, get a portion of the string, create a new string replacing some portion of it.
    String trim(): removes lead/trail whitespace
    int length(): returns length of passed string
    String replace(String pattern, String replacement)
    String substring(int startIndex, int endIndex)

### Java II

- [x] I can write a class that contains both static and instance fields and methods, constructors, setters and getters.
- [x] I can write a program composed of multiple classes requiring instantiation (not just using classes as groups of static methods).
- [x] I can write my own reference type and fill instances of it in an ArrayList and HashMap and use it as a return and input type of a method.
    see groceries and grades

- [x] I can write an abstract class and a subclass that extends from the abstract class.
    see shapes and quadrilateral

- [x] I can write multiple interfaces and implement their methods in another class.
    see shapes and Measurable

- [x] I can create arrays of various data types and sizes with and without using an array initializer.
    Array initializer syntax:
        String[] beatles = {"John", "Paul", "Ringo"}
    w/o
        Person[] personArr = new Person[3];
            personArr[0] = new Person("Amy");

- [x] I can get the length of an array, get a specific element or range of elements, create a new array replacing some portion of it, and iterate over an array of elements.
    for (Person people : personArr) {}
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

- [x] I can do the above with an ArrayList.
    https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

- [x] I can comfortably use the helper methods of both Arrays and Collections classes.
- [x] I can write a program that throws a runtime (UNCHECKED) exception.
    try{  
          //code that may raise exception  
          int data=100/0;  
       }catch(ArithmeticException e){System.out.println(e);}  
       //rest code of the program   
       
- [x] I can write an example of method overloading and method overriding.
- [x] I can write a program that reads and writes to a file.
- [x] I can write methods and collections that work with a parent class or interface type but use instances of objects that extend from these parent classes or implement these interfaces (Polymorphism).

## Example Problems

Below are examples of the type of problem you will encounter on the assessment. These problems are not an exhaustive example of all the topics that will be covered on the assessment, rather, are meant to familiarize you with the kind of problem and format to expect.

1. Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.
1. Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
1. Create an `Animal` class. It should have private instance properties for strings `name` and `species`, and public getters and setters for both.
1. Within your `Animal` class, define an instance method named `roar`. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where `$NAME` is replaced with the value of the name property for that object.
1. Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.

Note that the assessment spec only requires you to have methods and classes defined, there is not any requirement for a `main` method. However, creating additional methods will **not** be counted against you, so you are **_highly encouraged_** to create a `main` method and write some code that tests out the code you are writing for the assessment specification. For example, if you were working on the `half` function, you should call that function within the main method and make sure that it returns the correct values for several test cases.
