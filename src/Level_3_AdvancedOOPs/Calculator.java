package Level_3_AdvancedOOPs;

import java.util.Scanner;

abstract class Operations {
    double num1, num2;
    abstract double add(double num1, double num2);
    abstract double subtract(double num1, double num2);
    abstract double multiply(double num1, double num2);
    abstract double divide(double num1, double num2);
    abstract void print();
}

class Calculation {
    String operation = "";
    Operations operations = new Operations() {
        @Override
        double add(double num1, double num2) {
            return num1 + num2;
        }
        @Override
        double subtract(double num1, double num2) {
            return num1 - num2;
        }
        @Override
        double multiply(double num1, double num2) {
            return num1 * num2;
        }
        @Override
        double divide(double num1, double num2) {
            if(num2 == 0){
                System.out.println("Division by zero");
                return Double.NaN;
            }
            return num1 / num2;
        }
        @Override
        void print() {
            switch (operation){
                case "+" -> System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, add(num1, num2));
                case "-" -> System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, subtract(num1, num2));
                case "*" -> System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, multiply(num1, num2));
                case "/" -> System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, divide(num1, num2));
                default -> System.out.println("Invalid operation");
            }
        }
    };
}

public class Calculator {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        calculation.operations.num1 = scanner.nextDouble();
        System.out.println("Enter second Number: ");
        calculation.operations.num2 = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /): ");
        calculation.operation = scanner.next();

        calculation.operations.print();

        scanner.close();
    }
}