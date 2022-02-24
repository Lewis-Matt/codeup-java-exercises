package shapes;

public class Rectangle {
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

}
