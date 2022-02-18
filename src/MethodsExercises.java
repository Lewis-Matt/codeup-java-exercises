import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    // TODO: Create four separate methods. Each will perform an arithmetic operation (+, -, *, /)
    // Add
    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        return (add(a, b - 1) + 1);
    }

    // Sub
    public static int sub(int a, int b) {
        if (b == 0) {
            return a;
        }
        return (sub(a, b - 1) - 1);
    }

    // Multiply
    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        // Need to swap so the recursive call (b-1) is in the right order
        if (a < b) {
            return multiply(b, a);
        } else {
            return (a + multiply(a, b - 1));
        }
    }

    // Divide
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return b;
        }
        return (double) a / b;
    }

    // TODO: Modulus method
    public static int modulo(int a, int b) {
        return a % b;
    }

    // TODO: Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        System.out.printf("Enter an integer between %s and %s: ", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        while (userNumber > max || userNumber < min) {
            System.out.printf("Number must be between %s and %s: ", min, max);
            return getInteger(min, max);
        }
        System.out.printf("Success! %s is between %s and %s!%n", userNumber, min, max);
        return userNumber;
    }

    // TODO: Factorial!
    public static long callFactorial() {
        // Not needed, I already wrote getInteger():
//        System.out.println("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        while (userInput > 10 || userInput < 1) {
//            System.out.println("Number must be between 1 and 10: ");
//            return callFactorial();
//        }
        int userInput = getInteger(1, 10);
        System.out.printf("The factorial of %s is: %s.%n", userInput, factorial(userInput));
        System.out.println("Would you like to continue? [y/n] ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            callFactorial();
        }
        return factorial(userInput);
    }

    // Factorial calculation
    public static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    // TODO: Create an application that simulates dice rolling
    // Ask for number of sides
    // Prompt to roll
    // Roll two dice, display both results
    // Ask if they want to re-roll
    // Use Math.random

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides or on the dice? Choose an even number between 4 and 20(nerd)");
        int numberSides = scanner.nextInt();
        if (numberSides > 20 || numberSides < 4 || numberSides % 2 != 0) {
            rollDice();
        }
        System.out.println("Ready to roll? [y/n]");
        boolean response = scanner.next().equalsIgnoreCase("y");
        while (response) {
            // Dice rolls
            // To use random class, need to create an instance of it for each die
            Random dice1 = new Random();
            Random dice2 = new Random();
            // To generate a random integer - nextInt(max): 0 (inclusive) to max (exclusive). Add 1 to make max inclusive.
            int rollDice1 = dice1.nextInt(numberSides - 1) + 1;
            int rollDice2 = dice2.nextInt(numberSides - 1) + 1;
            int sum = rollDice1 + rollDice2;
            System.out.printf("Dice one: %s, Dice two: %s, for a total of %s.%n", rollDice1, rollDice2, sum);
            System.out.println("Re-roll? [y/n]");
            response = scanner.next().equalsIgnoreCase("y");
        }
        System.out.println("Okay, bye!");
    }


    /////////////////////////////////////////MAIN - METHOD CALLS/////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Add
        System.out.println(add(3, 7));
        // Sub
        System.out.println(sub(10, 7));
        // Multiply
        System.out.println(multiply(7, 3));
        // Divide
        System.out.println(divide(3, 0));
        // Modulus
        System.out.println(modulo(30, 9));
        // Factorial
        callFactorial();
        // Dice
        rollDice();

    }
}
