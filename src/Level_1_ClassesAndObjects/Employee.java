package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    int ID;

    public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    double calculateSalary() {
        return salary * 12;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + calculateSalary());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = in.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = in.nextFloat();
        System.out.print("Enter Employee ID: ");
        int ID = in.nextInt();

        Employee emp = new Employee(name,salary,ID);

        emp.display();
    }

}