package groceries;

import util.Input;

import java.util.HashMap;
import java.util.TreeMap;

public class GroceriesApplication {
    // Input Class - methods for validating user input
    static Input input = new Input();

    // Add to TreeMap containing items of a particular category and the quantity of each item added
    public static void addToBasket(TreeMap<String, Integer> categoryBasket, String category, int quantity) {
        categoryBasket.put(category, quantity);
    }

    // DRY: Switch statement case dialogue
    public static void caseDialogue(TreeMap<String, Integer> category) {
//        System.out.printf("Enter a name of a %s%n", category);   // Can't get this to print object name (e.g. fruit)
        String itemName = input.getString();
        System.out.println("Enter the quantity: ");
        int itemQuantity = input.getInt();
        addToBasket(category, itemName, itemQuantity);
    }

    public static void groceryApp() {
        // TreeMap and HashMap implement the Map interface. TreeMap sorts by keys automatically
        // Each TreeMap contains the items that match the category (the name of the treemap)
        TreeMap<String, Integer> fruit = new TreeMap<>();
        TreeMap<String, Integer> vegetable = new TreeMap<>();
        TreeMap<String, Integer> protein = new TreeMap<>();
        TreeMap<String, Integer> dairy = new TreeMap<>();
        TreeMap<String, Integer> grain = new TreeMap<>();
        TreeMap<String, Integer> fats = new TreeMap<>();

        System.out.println("Would you like to create a shopping list? [y/n]");
        boolean choice = input.yesNo();
        if (choice) {
            System.out.println("Would you like to enter a new item?");
            boolean keepShopping = input.yesNo();
            while (keepShopping) {
                // Display a list of grocery categories
                System.out.println("Categories:\n" +
                        "0 --- exit\n" +
                        "1 --- fruit\n" +
                        "2 --- vegetable\n" +
                        "3 --- protein\n" +
                        "4 --- dairy\n" +
                        "5 --- grain\n" +
                        "6 --- fats");
                System.out.println("Select a category to add items to: [0 - 6]");
                int selectedCategory = input.getInt(0, 6);

                // Adds item to category
                switch (selectedCategory) {
                    case 0:
                        return;
                    case 1:
                        System.out.println("Enter the name of a fruit to add: ");
                        caseDialogue(fruit);
                        break;
                    case 2:
                        System.out.println("Enter the name of a vegetable to add: ");
                        caseDialogue(vegetable);
                        break;
                    case 3:
                        System.out.println("Enter the name of a protein to add: ");
                        caseDialogue(protein);
                        break;
                    case 4:
                        System.out.println("Enter the name of a dairy product to add: ");
                        caseDialogue(dairy);
                        break;
                    case 5:
                        System.out.println("Enter the name of a grain to add: ");
                        caseDialogue(grain);
                        break;
                    case 6:
                        System.out.println("Enter the name of a fat to add: ");
                        caseDialogue(fats);
                        break;
                }

                // Prompt to continue adding to list
                System.out.println("Would you like to enter another item? [y/n]");
                keepShopping = input.yesNo();
            }
            System.out.println("Your finalized grocery list:");
            System.out.printf("Fruits: %s%n", fruit);
            System.out.printf("Vegetables: %s%n", vegetable);
            System.out.printf("Proteins: %s%n", protein);
            System.out.printf("Dairy: %s%n", dairy);
            System.out.printf("Grains: %s%n", grain);
            System.out.printf("Fats: %s%n", fats);
        } else {
            System.out.println("Thank you, see you next time!");
        }
    }

    //////////////////////////////////////////// MAIN ////////////////////////////////////////////
    public static void main(String[] args) {
        groceryApp();
    }
}


// Inits an array of GroceryItem type (separate class file) using findAll method from GroceryArray
//    public static GroceryItem[] groceries = GroceryArray.findAll();


// Reusable basket prompt
//    public static void basketPrompt() {
//        System.out.println("Enter an item name from the list: ");
//        String selectedItem = input.getString();
//        GroceryItem itemToAdd = new GroceryItem();
//        if (!selectedItem.equalsIgnoreCase(itemToAdd.getItem())) {
//            System.out.printf("How much %s would you like to add? [1-10]", selectedItem);
//            int quantity = input.getInt(1, 10);
//            System.out.printf("You added %s %s to your basket.", quantity, selectedItem);
//            addToBasket(basket, itemToAdd, quantity);
//            System.out.println(basket);
//        }
//    }
