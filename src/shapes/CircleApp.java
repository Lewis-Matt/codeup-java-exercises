package shapes;
// Accepts int or double inputs

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        // TODO: Prompt the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area.
        Input input = new Input();
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        // %.2f formats doubles to 2 decimals
        System.out.printf("For a circle of radius %s: %nArea: %.2f%nCircumference: %.2f%n", userRadius, circle.getArea(), circle.getCircumference());
    }
}
