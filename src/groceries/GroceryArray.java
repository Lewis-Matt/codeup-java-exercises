package groceries;
// TODO: THIS WAS A FIRST ATTEMPT TO CREATE ITEMS FOR THE APPLICATION. IT IS NOT BEING USED AS THE EXERCISE REQUIREMENTS STATE THAT THE USER CAN JUST ADD ITEMS TO THE LIST, THE ITEMS DO NOT HAVE TO BE FROM A CERTAIN INVENTORY (I.E. THIS ARRAY WOULD REPRESENT THE ITEMS AVAILABLE AT THE STORE).
// (item, category)
// categories: fruit, vegetable, protein, dairy, grain, fats/sugars
public class GroceryArray {
    // findAll() method - allows iterating through based on category, or displaying all
    public static GroceryItem[] findAll() {
        return new GroceryItem[]{
                new GroceryItem("apple", "fruit"),
                new GroceryItem("banana", "fruit"),
                new GroceryItem("pear", "fruit"),
                new GroceryItem("lettuce", "vegetable"),
                new GroceryItem("carrot", "vegetable"),
                new GroceryItem("peas", "vegetable"),
                new GroceryItem("chicken", "protein"),
                new GroceryItem("duck", "protein"),
                new GroceryItem("ham", "protein"),
                new GroceryItem("steak", "protein"),
                new GroceryItem("bacon", "protein"),
                new GroceryItem("milk", "dairy"),
                new GroceryItem("cheese", "dairy"),
                new GroceryItem("cereal", "grain"),
                new GroceryItem("rice", "grain"),
                new GroceryItem("ice cream", "fats/sugars"),
                new GroceryItem("chocolate", "fats/sugars"),
                new GroceryItem("chips", "fats/sugars"),
                new GroceryItem("eggs", "protein")
        };
    }

}
