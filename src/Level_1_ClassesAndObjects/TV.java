package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class TV {

    String brand;
    int size;
    double price;

    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    int calculatedDiscount(){

        int percentage = 0;

        if(size > 10 && size < 20){
            percentage = 10;
        }
        else if(size > 20 && size < 50){
            percentage = 20;
        }
        else if(size > 50 && size < 75){
            percentage = 40;
        }

        return (int) (price - (price * percentage / 100));

    }

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + calculatedDiscount());

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the brand: ");
        String brand = in.nextLine();
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        System.out.println("Enter the price: ");
        double price = in.nextDouble();

        TV tv = new TV(brand, size, price);
        tv.displayInfo();

    }



}
