package groceries;

public class GroceryItem {
    private String item;
    private String category;

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

    // Constructor
    public GroceryItem(String item, String category) {
        this.item = item;
        this.category = category;
    }
}
