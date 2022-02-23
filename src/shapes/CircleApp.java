package shapes;
// Accepts int or double inputs

import util.Input;

public class CircleApp {
    // Init at 1 since the method runs at least once
    private static int circleCount = 1;

    // Updates the number of times the main method was ran (total num circles created)
    public static int setCounter() {
        return circleCount++;
    }

    public static void main(String[] args) {
        // TODO: Prompt the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area.
        boolean confirmation;
        int totalCircles;
        do {
            System.out.println("Enter a radius: ");
            Input input = new Input();
            double userRadius = input.getDouble();
            Circle circle = new Circle(userRadius);
            // %.2f formats doubles to 2 decimals
            System.out.printf("For a circle of radius %s: %nArea: %.2f%nCircumference: %.2f%n", userRadius, circle.getArea(), circle.getCircumference());
            System.out.println("Would you like to add another circle? [y/n]");
            confirmation = input.yesNo();
            totalCircles = setCounter();
        } while (confirmation);
        // Print number of circles that were created
        System.out.printf("You created a total of %s circles.%n", totalCircles);
    }
}
