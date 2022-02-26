package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    // CONSTRUCTOR
    public Rectangle(double length, double width) {
        // From the superclasses (Quadrilateral) protected fields
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double number) {
        this.length = number;
    }

    @Override
    public void setWidth(double number) {
        this.width = number;
    }






    /* INHERITANCE AND POLYMORPHISM EXERCISE
    // Access Control (public, private, protected)
    // https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    // TODO: It should have protected properties for both length and width.
    protected double length;
    protected double width;

    // TODO: Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }
*/
}
