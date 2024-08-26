package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Circumference of circle: " + circle.calculateCircumference());

    }

}
