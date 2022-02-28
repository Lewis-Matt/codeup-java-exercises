package groceries;

import movies.Movie;
import movies.MoviesArray;
import util.Input;

public class GroceriesApplication {
    // Inits an array of GroceryItem type (separate class file) using findAll method from GroceryArray
    public static GroceryItem[] groceries = GroceryArray.findAll();

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
                // Display a list of grocery categories
                System.out.println("Categories:\n" +
                        "0 --- all\n" +
                        "1 --- fruit\n" +
                        "2 --- vegetable\n" +
                        "3 --- protein\n" +
                        "4 --- dairy\n" +
                        "5 --- grain\n" +
                        "6 --- fats/sugars");
                System.out.println("Select a category to view items: [0 - 6]");
                int selectedCategory = input.getInt(0, 6);
                for (GroceryItem category : groceries) {
                    System.out.printf("Categories: %s%n", category.getCategory());
                }


                System.out.println("Would you like to enter another item?");
                keepShopping = input.yesNo();
            }
            System.out.println("Your finalized grocery list:");

        } else {
            System.out.println("Thank you, see you next time!");
        }
    }
}