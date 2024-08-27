package Level_2_ClassesAndMethodOverloading;

import java.util.Scanner;

public class Calculator {

    int num1,num2;

    public Calculator(int num1,int num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

    void getInput(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println("Sum: "+add(num1,num2));

    }

    int add(int num1,int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(5,6);
        calc.getInput();
    }

}
