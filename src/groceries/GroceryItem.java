package groceries;
// TODO: THIS WAS A FIRST ATTEMPT TO CREATE ITEMS FOR THE APPLICATION. IT IS NOT BEING USED AS THE GROCERYARRAY ISN'T USED.
public class GroceryItem {
    private String item;
    private String category;

    // Constructor
    public GroceryItem(String item, String category) {
        this.item = item;
        this.category = category;
    }

    // Overload Constructor
    public GroceryItem() {
        this.item = getItem();
        this.category = getCategory();
    }

    // GETTERS
    public String getItem() {
        return item;
    }

    public String getCategory() {
        return category;
    }

    // SETTERS
    public void setName(String addedItem) {
        this.item = addedItem;
    }

    public void setCategory(String addedCategory) {
        this.category = addedCategory;
    }


}
