import java.util.Arrays;
import java.util.Scanner;
// Java organizes code through packages; you can think of a package as a namespace for a group of related code. Later on, we'll define classes in their own packages, but for now, we'll be using code from the java.util package, which is a package that comes with the Java language.
// ***** In IntelliJ, you can press (option + enter) after typing the Scanner class name to have IntelliJ automatically add the correct import for you.


public class ConsoleExercises {
    // The point from where the program starts its execution or simply the entry point of Java programs is the main() method.

    // Public - Access modifier, which specifies from where and who can access the method. Making the main() method public makes it globally available. It is made public so that JVM can invoke it from outside the class as it is not present in the current class.

    // Static - It is a keyword that is when associated with a method, making it a class-related method. The main() method is static so that JVM can invoke it without instantiating the class. This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.
    // The role of adding static before any entity is to make that entity a class entity. It means that adding static before methods and variables make them class methods and class variables respectively, instead of instance methods and instance variables.
    //Hence, static methods and variables can be directly accessed with the help of Class, which means that there is no need to create objects in order to access static methods or variables.

    // Void - It is a keyword and is used to specify that a method doesn’t return anything. As the main() method doesn’t return anything, its return type is void. As soon as the main() method terminates, the java program terminates too. Hence, it doesn’t make any sense to return from the main() method as JVM can’t do anything with the return value of it.

    // String[] args - It stores Java command-line arguments and is an array of type java.lang.String class. Here, the name of the String array is args but it is not fixed and the user can use any name in place of it.

    // There is no direct interaction between the Java program and Operating System. There is no direct allocation of resources to the Java program directly, or the Java program does not occupy any place in the process table. Whom should it return an exit status to, then? This is why the main method of Java is designed not to return an int or exit status.

    // But JVM is a process of an operating system, and JVM can be terminated with a certain exit status. With help of java.lang.Runtime.exit(int status) or System.exit(int status).

    public static void main(String[] args) {
        double pi = 3.14159;
        // System.out.printf. This allows us to define a string with placeholders and then pass values for those placeholders.
        // % [flags] [width] [.precision] conversion-character ( square brackets denote optional parameters )
        // There is also System.out.format() -> An invocation of this method of the form out.printf(l, format, args) behaves in exactly the same way as the invocation out.format(l, format, args)
        // %n is newline
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        // The Scanner class allows us to get data input that the user enters into the console.
        // System.in refers to information a user types in the console.
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter an integer, my dude: ");
        // .next() method defaults to string, have to use .nextInt(), nextFloat() etc.
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);
        // Enter 2 integers - Every individual entry to the scanner is called a token, and, by default, tokens are separated by any whitespace (for example, the space character, or the newline character). When we called scanner.nextInt(), we just get the next token.

        // If we want to get a whole line that was entered, we can use the nextLine method. It will return any remaining input on the current line as a String, and advance the scanner to the next line. STRINGS only.
// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.print("Enter 3 words, my dude: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("%s%n %s%n %s%n", word1, word2, word3);

        System.out.print("Enter 3 words, I will put them in an array, my dude: ");
        String[] threeWords = new String[3];
        int i = 0;
        while (i < threeWords.length) {
            threeWords[i] = scanner.next();
            i++;
        }
        // Arrays had to be imported. It is the easiest way to print the contents of an array to console.
        // toString() Returns a string representation of the contents of the specified array. The string representation consists of a list of the array's elements, enclosed in square brackets ("[]").
        System.out.println(Arrays.toString(threeWords));

// TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the nextLine method. Then, display that sentence back to the user.
        System.out.print("Enter a sentence, my dude: ");
        // Scanner.nextLine() scans the rest of the current line, excluding any line separator at the end. The nextLine reads from wherever the cursors last position is in the console. So, the cursors current position is at the end of "...my dude: ", so nextLine would return the remaining whitespace.
        scanner.nextLine();
        // And we have to call it again to get the entire user input
        String sentence = scanner.nextLine();
        System.out.println(sentence);

// TODO: Prompt the user to enter values of length and width of a classroom at Codeup. Display the area and perimeter of that classroom.
        System.out.println("Enter Length and Width of room:");
        float length = Float.parseFloat(scanner.nextLine());
        float width = Float.parseFloat(scanner.nextLine());
        float area = length * width;
        float perimeter = (2 * length) + (2 * width);
        System.out.printf("The area of the room is %s and the perimeter is %s%n", area, perimeter);
// By default, Java uses double to represent its floating-point numerals (so a literal 3.14 is typed double). It's also the data type that will give you a much larger number range, so I would strongly encourage its use over float.


// The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method.
        scanner.useDelimiter("\n");
// TODO: Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
        System.out.println("Enter Length and Width of room:");
        float length1 = (scanner.nextFloat());
        float width1 = (scanner.nextFloat());
        float area1 = length1 * width1;
        float perimeter1 = (2 * length1) + (2 * width1);
        System.out.printf("The area of the room is %s and the perimeter is %s", area1, perimeter1);
    }
}

