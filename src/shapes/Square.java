package shapes;

// TODO: Make Square extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//  In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//  perimeter = 4 x side
//  area = side ^ 2
public class Square extends Rectangle {
    // Constructor
    public Square(double side) {
        // allows access to a superclasses methods and constructors from within a subclass
        super(side, side);
    }

}
