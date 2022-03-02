package notes;

public class ExceptionsErrorsNotes {
// Exceptions are an instance of one of several different Exception classes, or a class that extends one of the built-in exception classes. Java will throw most exceptions automatically, but we can also throw our own:
// TODO: throw new Exception("Something bad happened!");
// This code block will cause an exception. It is important to note that exceptions effect the control flow of your application. Once an exception is thrown, no code after the thrown exception will be executed until the exception is handled.
// TODO: Try-Catch
// Instead of crashing our application, we can handle exceptions by catching them.
// When we create a try-catch block, we must define the type of exception we are looking for. This is similar to defining a method parameter, in that we must specify a type, in this case a type of exception, and an identifier. By convention, this will almost always be e, but you can use any valid Java identifier here.

// TODO: Example
//  try {
//    System.out.println("Let's see...");
//    int result = 1 / 0;
//    System.out.println("I can divide by zero!");
//  } catch (ArithmeticException e) {
//    System.out.println("Math still works!");
//  }
// Because we have a catch block that specifies that it is looking for an ArithmeticException, our application does not crash and print out a stack trace; instead, control is transferred to the body of the catch block.
// We can specify multiple catch blocks as part of a try-catch, but only the most specific of them will ever run. We can also specify a finally block that will always run, regardless of if an exception is thrown or not.

// A try-catch block is a code block just like a body of an if statement, or the body of a while loop is. Because of the way block scope works in Java,variables declared inside a try or catch block only exist in that block.

// If you need to do assignment inside of a try-catch, declare the variables outside of the block, and assign to them inside the block.

// 'e' represents the error that occurred. This object does have a handful of useful methods on it, most notably:
// TODO
//    .getMessage: returns the exception message as a string
//    .printStackTrace: prints the full details of the exception (where it occurred) to the console

// TODO: Checked/Unchecked/Error
// Exceptions are divided into two main categories: checked and unchecked. Thus far we have only been working with unchecked exceptions. These are mostly exceptions that are built into the Java language, and do not need to be explicitly dealt with.
// Checked exceptions must be handled in our code, either with a try-catch, or by declaring them in the method signature with the throws keyword.
    // Checked exceptions are enforced by the compiler, meaning that if a checked exception is not handled, the code will not compile.
// There exists a third category as well, Error. We won't go into too much detail here, but suffice it to say that errors represent something going very wrong, usually this is not something that we can anticipate or handle in our code.

// TODO: Exception
    // Errors our code should prepare for.
    // Generally, any custom exceptions we create will subclass Exception.
// TODO: RuntimeException
    // Things that can go wrong, but that we can usually prevent programmatically.
    // ArrayIndexOutOfBoundsException, NullPointerException, and IllegalArgumentException are all examples of runtime exceptions.
// TODO: Error
    // Usually occurs at the OS or JVM level.
    // OutOfMemoryError, or StackOverflowError.

// If a method contains a line of code that can cause an exception to be thrown (including an explicit throw statement), the line must either be inside of a try-catch, or the exception must be added to the method's signature using throws.
    // TODO:
    //  public static String getIndentationPreference() throws Exception {
    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("What type of indentation do you prefer?");
    //    String indentationPreference = sc.nextLine();
    //    if (indentationPreference.equals("tabs")) {
    //        throw new Exception("Spaces are superior!");
    //    }
    //    return indentationPreference;
    //  }

    // two examples of using the method above that illustrate each case:

    // TODO: Using a try-catch
    //  public static void main(String[] args) {
    //    String indentationPreference;
    //    try {
    //        indentationPreference = getIndentationPreference();
    //        System.out.println("Okay, " + indentationPreference + " is a great choice.");
    //    } catch (Exception e) {
    //        System.out.println("Uh oh, something went wrong: " + e.getMessage());
    //        System.out.println("Here is some more detail:");
    //        e.printStackTrace();
    //    }
    //  }

    // TODO: Adding the exception to the method signature
    //  public static void main(String[] args) throws Exception {
    //    String indentationPreference = getIndentationPreference();
    //    System.out.println("Okay, " + indentationPreference + " is a great choice.");
    //  }

    // Notice that using an explicit try-catch allows us more control over how the error is handled. Using throws indicates that the error handling is the responsibility of the code calling the method.

// TODO: Custom exceptions
// create our own application-specific exceptions by extending the Exception class. By convention, these classes are suffixed with Exception. To illustrate, we can define a custom exception type for our previous example:
    // TODO:
    //  class WrongIndentationTypeException extends Exception {}
    //  Scanner sc = new Scanner(System.in);
    //  System.out.print("What type of indentation do you prefer?");
    //  String indentationPreference = sc.nextLine();
    //  if (indentationPreference.equals("tabs")) {
    //    WrongIndentationTypeException e;
    //    e = new WrongIndentationTypeException("Error when getting user indentation preference.
    //  Input was "tabs", was expecting "spaces".");
    //    throw e;
    //  }

// Because exceptions are just objects, we can store them in a variable, declare, and initialize them just like any other object.
// It is very common to see custom exception classes that extend from Exception, but don't provide any additional functionality over the base Exception class. This is done simply as a tool to express in code that there are errors specific to our application that we wish to treat differently than other, more general exceptions.





}
