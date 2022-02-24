package shapes;

// TODO: Make Square extends Rectangle.

public class Square extends Rectangle {
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
}

