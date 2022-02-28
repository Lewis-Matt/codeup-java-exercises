package groceries;

// (item, category)
// categories: fruit, vegetable, protein, dairy, grain, fats/sugars
public class GroceryArray {
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
