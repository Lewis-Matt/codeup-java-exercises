package shapes;

// TODO: Make Square extends Rectangle.
//  Changed to extend Quadrilateral for next exercise
public class Square extends Quadrilateral {
    // CONSTRUCTOR
    public Square(double number) {
        super(number, number);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
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
    // Need to init side otherwise getArea/Perimeter overrides won't see it
    double side;

    // TODO: Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    // Constructor
    public Square(double side) {
        // Allows access to a superclasses methods and constructors from within a subclass
        super(side, side);
        // Need to set the side (ln 9) equal to the input side, so it works with the overrides
        this.side = side;
    }

//  TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//      perimeter = 4 x side
//      area = side ^ 2

    // Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Override
    public double getArea() {
        return Math.pow(side, 2);
    }
    */

}

