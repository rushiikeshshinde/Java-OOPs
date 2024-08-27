package Level_3_AdvancedOOPs;

import java.util.Scanner;

public class CalculateArea {

    double length,breadth;

    void input(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Length: ");
        length = in.nextInt();
        System.out.println("Enter Breadth: ");
        breadth = in.nextInt();


    }

    void calculateArea(double length, double breadth){
        double area = length * breadth;
        System.out.println("The area of the rectangle is " + area);

    }

    public static void main(String[] args) {

        CalculateArea calc = new CalculateArea();
        calc.input();
        calc.calculateArea(calc.length,calc.breadth);

    }

}
