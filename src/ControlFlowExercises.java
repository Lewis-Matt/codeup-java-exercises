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
        System.out.println("What number would you like to go up to?");
        // Store user value
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        System.out.println(userInt);
        // Display a table of squares and cubes from 1 to the value entered
        System.out.printf("number | squared | cubed%n");
        System.out.printf("------ | ------- | -----%n");

        for (int q = 1; q <= userInt; q++) {
            int squared = (int) Math.pow(q, 2);
            int cubed = (int) Math.pow(q, 3);
            System.out.printf("%s      | %s      | %s      %n", q, squared, cubed);
        }
        // Loop to continue passed initial user number
        while (true) {
            // Ask if the user wants to continue
            System.out.print("Continue? [y/n] ");
            String userInput = scanner.next();
            // While we use == to compare primitive types, we need to handle strings a little differently. Each String is a different object
            // Use either the .equals or .equalsIgnoreCase method on the String we want to compare
            // boolean confirmation = userInput.equals("y");
            if (!userInput.equalsIgnoreCase("y")) {
                break;
            } else {
                userInt++;
                int squared = (int) Math.pow(userInt, 2);
                int cubed = (int) Math.pow(userInt, 3);
                System.out.printf("%s      | %s      | %s      %n", userInt, squared, cubed);
            }
        }
        // TODO: Convert given number grades into letter grades
        boolean confirm = true;
        do {
            // Prompt user for 0-100 grade
            System.out.println("Enter a numerical grade:");
            int grade = scanner.nextInt();
            String letterGrade;
            // Display letter grade
            // Switch statements can't accept expressions(i.e. <100 $ >90 = A), however grades change at every factor of 10. Since 'grade' is an integer, it will always round to the nearest int. If we wanted A-, B+, etc. it would be best to us 'if' statements.
            switch (grade/10) {
                case 10:
                case 9:
                    letterGrade = "A";
                    break;
                case 8:
                    letterGrade = "B";
                    break;
                case 7:
                    letterGrade = "C";
                    break;
                case 6:
                    letterGrade = "D";
                    break;
                default:
                    letterGrade = "F";
            }
            System.out.println("Grade = " + letterGrade);
            // Prompt user to continue
            System.out.print("Continue? [y/n] ");
            String userConfirm = scanner.next();
            if (userConfirm.equalsIgnoreCase("y")) {
                continue;
            }
            confirm = false;
        } while (confirm);
    }
}
