package Level_3_AdvancedOOPs;

import java.util.Scanner;

interface Shape {

    double input();
    void area();

}

class Circle implements Shape {

    @Override
    public double input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius: ");
        return in.nextDouble();
    }

    @Override
    public void area() {
        double radius = input();
        double area = radius * radius * Math.PI;
        System.out.println("Area: " + area);
    }
}

class Rectangle implements Shape {

    @Override
    public double input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Length: ");
        double length = in.nextDouble();
        System.out.print("Width: ");
        double width = in.nextDouble();
        return length * width;
    }
    @Override
    public void area() {
        double area = input();
        System.out.println("Area: " + area);
    }
}

public class GetShape {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.area();
        Rectangle rectangle = new Rectangle();
        rectangle.area();

    }

}
