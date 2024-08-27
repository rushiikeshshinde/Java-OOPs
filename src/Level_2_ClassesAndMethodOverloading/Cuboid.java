package Level_2_ClassesAndMethodOverloading;

import java.util.Scanner;

public class Cuboid {
    private double length;
    private double breadth;
    private double height;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        scanner.close();

        double volume = volume();
        System.out.println("Volume of the cuboid: " + volume);
    }

    public double volume() {
        double area = area();
        return area * height;
    }

    public double area() {
        double perimeter = perimeter();
        return length * breadth + 2 * height * (length + breadth);
    }

    public double perimeter() {
        double result = 4 * (length + breadth + height);
        System.out.println("Perimeter of the cuboid: " + result);
        return result;
    }

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.input();
    }
}