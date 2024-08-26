package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Shirt {

    String size;
    String color;
    double price;

    public Shirt(String size, String color, double price) {

        this.size = size;
        this.color = color;
        this.price = price;

    }

    int calculateDiscountedPrice() {

        return switch (size.toLowerCase()) {
            case "s" -> (int)(price - (price * 0.025));
            case "m" -> (int)(price - (price * 0.5));
            case "l" -> (int)(price - (price * 0.75));
            default -> 0;
        };

    }

    void displayInfo(){
        System.out.println("Size: " + size + "\nColor: " + color + "\nOriginal Price: " + price + "\nDiscounted Price: " + calculateDiscountedPrice());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the shirt (Small - S, Medium - M, Large - L): ");
        String size = in.nextLine();
        System.out.println("Enter the color of the shirt: ");
        String color = in.nextLine();
        System.out.println("Enter the price of the shirt: ");
        double price = in.nextDouble();

        Shirt shirt = new Shirt(size, color, price);
        shirt.displayInfo();

    }

}
