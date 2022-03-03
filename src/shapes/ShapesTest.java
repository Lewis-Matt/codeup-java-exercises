package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // TODO: Interface and Abstract exercise test:
        Measurable testShape1 = new Square(8);
        Measurable testShape2 = new Rectangle(3, 8);
        System.out.printf("testShape1 area: %s, perimeter: %s%n", testShape1.getArea(), testShape1.getPerimeter());
        System.out.printf("testShape2 area: %s, perimeter: %s%n", testShape2.getArea(), testShape2.getPerimeter());
        // If I tried to do testShape1.getLength() it will not work as Measurable does not have that method, EVEN though square extends quadrilateral (which does have that method)

        // TODO: Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5, 4);

        //  TODO: Verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        // TODO: Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        // Changed to Quadrilateral for ABSTRACT exercise
        Quadrilateral box2 = new Square(5);

        //  TODO: Verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

        // TODO: How can you determine which getArea and getPerimeter methods are being called on each object?
        // Command click on the method? Because that shows it is using the Rectangle's methods.
    }
}
