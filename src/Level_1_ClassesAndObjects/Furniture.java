package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Furniture {

    String type;
    String material;
    double price;

    public Furniture(String type, String material, double price) {

        this.type = type;
        this.material = material;
        this.price = price;

    }

    int calculateDiscount(){

        int percentage;

        switch (material.toLowerCase()) {
            case "hardwood" -> percentage = 10;
            case "plywood" -> percentage = 20;
            case "fiberboard" -> percentage = 30;
            case "plastic" -> percentage = 50;
            default -> percentage = 40;
        }
        return (int) (price - (price * percentage / 100));

    }

    void display(){

        System.out.println("Type: " + type + "\nMaterial: " + material + "\nOriginal Price: " + price + "\nDiscounted Price: " + calculateDiscount());

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the type of furniture: ");
        String type = in.nextLine();
        System.out.println("Enter the material: ");
        String material = in.nextLine();
        System.out.println("Enter the price: ");
        double price = in.nextDouble();

        Furniture f = new Furniture(type, material, price);
        f.display();

    }


}
