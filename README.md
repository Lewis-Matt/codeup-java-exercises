# codeup-java-exercises

## HelloWorld
- basic syntax
- Object generic type
- pre/post increment

## ConsoleExercises
- printf() and format() - how to format text
- notes on public, static, void, main, String() args
- importing classes
- Scanner class: next(), nextInt(), etc.
- Arrays class, toString() to print elements of an array
- loop through array, get each user input with scanner.next() and put in array
- delimiter("\n")
- Integer.parseInt()
- Float.parseFloat()
- .equals(), .equalsIgnoreCase() for comparing strings
- switch

## StringExercises
- immutable
- concatenation
- charAt, indexOf, indexAt, replace, trim
- ==, .equals, .startsWith, .endsWith

## Bob
- using .endsWith, .equals

## HighLow
-try/catch (InputMismatchException e)
- scanner.hasNextInt() can be used as a check for the correct input as well
- rand.nextInt((max - min) + 1) + min; is inclusive min to max

## Student
- static
- private
- constructors
- default constructor, default superclass (Object class)
- this (use only inside an instance method)
- a static class (all fields static) - means we never create instances of it (just reference it - like Math)
- overloading constructors

## Person
- using constructors and private(class) fields
- examples of reference variables being passed by value, and how they can be changed

## util/Input
- method overloading
- try, catch, throw exception
- Integer.parseInt()
- Double.parseDouble()

## Circle, CircleApp
- private variables, accessed via public methods
- constructor with parameter, parameter passed from Input class
- %.2f in printf
- static, private fields accessed via public static methods (method called in instance to update private field)

## ArraysExercises
- everything in src will compile when I run any class
- every class in src has access to anyother public class in src
- loop through arrays
- Arrays.toString() - otherwise we may just be printing/accessing the memory location of the object
- array methods (copyOf, fill, equals, sort)
- two-dimensional arrays

## ServerNameGenerator
- cannot call a non-static method (class) within static main method
- need to create an instance and have the main method in that instance
- if 'static' isn't present, then it is an instance variable/method; so an object must be instantiated in order to use it

## movies pckg
- great example of classes interacting with other classes via methods.
- looping through array with for, forEach

## Rectangle, Square, ShapesTest
- protected fields, get/set
- overriding methods
- super - access superclass (square extends rectangle)
- 