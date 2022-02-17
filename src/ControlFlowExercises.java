import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // TODO: Create a while loop that runs so long as i is less than or equal to 15
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        // TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int x = 0;
        do {
            System.out.printf("%s%n", x);
            x += 2;
        } while (x <= 100);

        // TODO: Count backwards by 5's from 100 to -10
        int y = 100;
        do {
            System.out.printf("%s%n", y);
            y -= 5;
        } while (y >= -10);

        // TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000
        int z = 2;
        do {
            System.out.printf("%s%n", z);
            // Math.pow returns a double, cast as int
            z = (int) Math.pow(z, 2);
        } while (z <= 1000000);

        // TODO: Refactor the previous two exercises to use a for loop instead
        // Note the scope of y (line 18)
        for (y = 100; y >= -10; y -= 5) {
            System.out.printf("%s%n", y);
        }

        int n = 10000000;
        // Note we can put the incrementation in the loop (rather than in the condition)
        for (z = 2; z <= n; ) {
            System.out.printf("%s%n", z);
            z = (int) Math.pow(z, 2);
        }

        // TODO: Fizzbuzz
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            }
            System.out.println(a);
        }

        // TODO: Display a table of powers
        // Prompt the user to enter an integer
        System.out.println("Enter an integer");
        // Display a table of squares and cubes from 1 to the value entered

        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = scanner.next();
        // While we use == to compare primitive types, we need to handle strings a little differently. Each String is a different object
        // Use either the .equals or .equalsIgnoreCase method on the String we want to compare
        boolean confirmation = userInput.equals("y");


    }
}
// Two types of control structures
// Conditionals
// Loops