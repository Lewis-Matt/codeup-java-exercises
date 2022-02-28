package util;

import java.util.Scanner;

// A package is a namespace that organizes a set of related classes and interfaces. Basically a directory of all the classes for an application.
// The Java platform provides an enormous class library (a set of packages) suitable for use in your own applications. This library is known as the "Application Programming Interface", or "API" for short.
public class Input {
    private Scanner scanner;

    // Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Call in other methods that need to look for a string
    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    // Uses this overload if a min and max int is specified
    public int getInt(int min, int max) {
        int input;
        do {
//            System.out.printf("Enter an integer between %s and %s: %n", min, max);
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }

    // Uses this overload for any int
    public int getInt() {
        try {
            String inputAsString = getString();
            // Params:
            //s – a String containing the int representation to be parsed
            //Returns:
            //the integer value represented by the argument in decimal.
            //Throws:
            //NumberFormatException – if the string does not contain a parsable integer.
            return Integer.parseInt(inputAsString);
        } catch (NumberFormatException e) {
            // The throw keyword indicates what exception type may be thrown by a method.
            // throw is followed by an object (new type)
            // Note: There is a diff between throw and throws
            throw new NumberFormatException("Not a number.");
        }
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.printf("Enter a decimal number between %s and %s: %n", min, max);
            input = scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        try {
            String inputAsString = getString();
            return Double.parseDouble(inputAsString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a decimal.");
        }
    }
}
