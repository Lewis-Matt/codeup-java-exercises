package movies;

// TODO: It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
public class Movie {
    private String name;
    private String category;

    // CONSTRUCTOR
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    // SETTERS
    public void setName(String newName) {
        this.name = newName;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    ////////////////////////////////////MAIN//////////////////////////////////
    public static void main(String[] args) {

    }
}
