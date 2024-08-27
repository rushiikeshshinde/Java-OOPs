package Level_2_ClassesAndMethodOverloading;

import java.util.Scanner;

class Rectangle {

    int length,breadth;

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea(){
        return length*breadth;
    }

}

class Triangle {
    int base,height;

    public Triangle(int base,int height) {
        this.base = base;
        this.height = height;
    }

    int calculateArea(){
        return (base*height)/2;
    }
}

public class CalculateArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        Rectangle rectangle = new Rectangle(length,breadth);
        Triangle triangle = new Triangle(length,breadth);
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());

    }


}
