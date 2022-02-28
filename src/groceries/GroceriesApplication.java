package groceries;

import util.Input;

public class GroceriesApplication {


    public static void main(String[] args) {
        // TODO: A user should be prompted if they would like to create a grocery list.
        // Input Class - methods for validating user input
        Input input = new Input();
        System.out.println("Would you like to create a shopping list? [y/n]");
        boolean choice = input.yesNo();

        // TODO: If the users picks yes, they should be given the following three prompts:
        //    Given an ordered list of grocery categories to choose from, select the category.
        //    Enter the name of the item.
        //    Enter how many of the item.

        if (choice) {
            System.out.println("Would you like to enter a new item?");
            boolean keepShopping = input.yesNo();
            while (keepShopping) {
                // display arrayList of grocery items
                // if itemName is in the array

                System.out.println("Would you like to enter another item?");
                keepShopping = input.yesNo();
            }
            System.out.println("Your finalized grocery list:");

        } else {
            System.out.println("Thank you, see you next time!");
        }
    }
}