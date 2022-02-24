package shapes;
// TODO: It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//  Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.

public class Rectangle {
    // Access Control (public, private, protected)
    // https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

    protected double length;
    protected double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

}
