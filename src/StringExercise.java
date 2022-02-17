public class StringExercise {
    public static void main(String[] args) {
    // TODO: ----------------- THIS SECTION IS MY NOTES FOR THE LESSON -------------------
        System.out.println("------NOTES------");
        // String variables are a reference type (not primitive), hence why == does not work.
        // Using == on objects checks if both sides are the same reference (point to same obj)
        // Strings are immutable

        String message = "Hello";
        System.out.println(message); // prints "Hello"
        message = message + " World!";
        System.out.println(message); // prints "Hello, World!"
        // When we do the string concatenation (message + " World"), we aren't modifying the original string; rather, we are creating a new String object, and updating the message variable to reference the new String object instead of the old one.
        // Compare strings with .equals, .equalsIgnoreCase, .startsWith, .endsWith

        // Strings have indexes for each char
        // char charAt(int index): returns char at index
        // int indexOf(String subString): returns index of first occurrence of subString (else -1)
        // int lastIndexOf
        // int length(): returns length of passed string
        // String replace(String pattern, String replacement): Returns a copy of the string that has pattern replaced with replacement
        // String toLowerCase/Uppercase
        // String trim(): removes lead/trail whitespace

    // TODO: ------------------------------ EXERCISE BELOW --------------------------------
        System.out.println("------EXERCISES------");
        // TODO: For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
        // We don't need no education
        //We don't need no thought control

        String ex1 = "We don't need no education\n" +
                "We don't need no thought control\n";
        System.out.println(ex1);

        // Check "this" out!, "s inside of "s!
        String ex2 = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(ex2);

        // I can do backslashes \, double backslashes \\,
        //and the amazing triple backslash \\\!
        String ex3 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(ex3);
    }

}
