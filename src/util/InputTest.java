package util;

public class InputTest {
    public static void main(String[] args) {
        // Construct new object
        Input userInput = new Input();
        // Call getInt method
        System.out.println("Enter an integer: ");
        System.out.println(userInput.getInt());
        System.out.println(userInput.getInt(4, 9));
        // Call getDouble method
        System.out.println("Enter a decimal: ");
        System.out.println(userInput.getDouble());
        System.out.println(userInput.getDouble(5.5, 7.6));
        // Call yesNo method
        System.out.println("Enter the word that means \"an affirmative response\" ");
        System.out.println(userInput.yesNo());
        // Call getBinary
        System.out.println("Enter a binary number: ");
        System.out.println(userInput.getBinary());
        // Call getHex
        System.out.println("Enter a hexadecimal number: ");
        System.out.println(userInput.getHex());
    }
}
