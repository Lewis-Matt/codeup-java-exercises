import java.util.Random;
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
    public static int randomNumberGenerator(){
        Random randomNumber = new Random();
        // rand.nextInt((max - min) + 1) + min;
        return randomNumber.nextInt((100 - 1) + 1)+1;
    }

    public static void main(String[] args) {
        System.out.println(randomNumberGenerator());
    }


}
