package shapes;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

}
