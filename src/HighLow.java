import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HighLow {
    // TODO:
    //    Game picks a random number between 1 and 100.
    //    Prompts user to guess the number.
    //    All user inputs are validated.
    //    If user's guess is less than the number, it outputs "HIGHER".
    //    If user's guess is more than the number, it outputs "LOWER".
    //    If a user guesses the number, the game should declare "GOOD GUESS!"
    //    Keep track of how many guesses a user makes.
    //    Set an upper limit on the number of guesses.

    // Random number generator for 1-100
    public static int randomNumberGenerator() {
        Random randomNumber = new Random();
        // rand.nextInt((max - min) + 1) + min;
        return randomNumber.nextInt((100 - 1) + 1) + 1;
    }

    // Guess method
    public static void guess() {
        int attempts = 5;
        System.out.println("Guess a number between 1 - 100: ");
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        int numberToGuess = randomNumberGenerator();
        // TEST
//        System.out.println(numberToGuess);
        // If I did while(scanner.hasNextInt) {}, it would only check on the intial input, and not the inputs within the loop. Used try/catch.
        try {
            while (attempts > 0) {
                userGuess = scanner.nextInt();
                if (userGuess < numberToGuess) {
                    System.out.println("HIGHER");
                    attempts -= 1;
                    System.out.printf("%s attempts left%n", attempts);
                } else if (userGuess > numberToGuess) {
                    System.out.println("LOWER");
                    attempts -= 1;
                    System.out.printf("%s attempts left%n", attempts);
                } else {
                    System.out.println("GOOD GUESS!");
                    return;
                }
            }
            System.out.println("No more attempts!");
            // Whenever you take inputs from the user using a Scanner class, ff the inputs passed doesn’t match the method an InputMisMatchException is thrown.
            // Note: When a scanner throws an InputMismatchException, the scanner will not pass the token that caused the exception.
            // Note: The 'e' is just a variable name that is an object instance of an Exception of some type - convention for error handling is to just use 'e'.
        } catch (InputMismatchException e) {
            System.out.println("That was not a valid integer.");
        }
    }


    /////////////////////////////////////////MAIN - METHOD CALLS/////////////////////////////////////////////////////
    public static void main(String[] args) {
//        System.out.println(randomNumberGenerator());
        guess();
    }

}
