import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "anxious"};
    public static String[] nouns = {"dog", "cat", "Nebraska", "cup", "pc", "stapler", "french toast", "bus", "Paris", "duck"};

    // TODO: Create a method that will return a random element from an array of strings.
    public static String getRandomElement(String[] arr) {
        Random random = new Random();
        int randomIndex = random.nextInt(10);
        return arr[randomIndex];
    }

    //////////////////////////////////////MAIN//////////////////////////////////////
    public static void main(String[] args) {
        // TODO: Select a random noun and adjective and hyphenate the combination and display the generated name to the user.
        // Static fields (nouns, adj) are accessible without creating an instance of the class.
        System.out.printf("Here is your server name:%n%S-%S", getRandomElement(adjectives), getRandomElement(nouns));
    }
}
