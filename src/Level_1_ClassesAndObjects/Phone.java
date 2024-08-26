package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Phone {

    String make;
    String model;
    int storage;

    public Phone(String make, String model, int storage) {

        this.make = make;
        this.model = model;
        this.storage = storage;

    }

    public double calculatePrice() {

        double basePrice = 500.0;

        if (make.equalsIgnoreCase("Apple")) {

            basePrice += 500;

        }

        else if (make.equalsIgnoreCase("Samsung")) {

            if(model.equalsIgnoreCase("Galaxy")){

                basePrice += 300;

            }

            basePrice += 200;

        }

        basePrice += ((double) storage / 32) * 50;

        return basePrice;
    }

    public void printInfo() {

        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Estimated Price: $" + calculatePrice());

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter make: ");
        String make = in.nextLine();
        System.out.println("Enter model: ");
        String model = in.nextLine();
        System.out.println("Enter storage: ");
        int storage = in.nextInt();

        Phone myPhone = new Phone(make, model, storage);
        myPhone.printInfo();

    }
}
