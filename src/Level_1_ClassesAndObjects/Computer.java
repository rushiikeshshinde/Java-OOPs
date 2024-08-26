package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Computer {

    String processor;
    int ram;
    int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    int calculatePrice(){

        int amount = 0;

        if(processor.equals("Intel")){

            if(ram > 8) {

                if(storage > 64) {

                    amount = 80000;

                }

                else {
                    amount = 50000;
                }

            }
            else {

                amount = 25000;

            }


        }

        if(processor.equals("AMD")){

            if(ram > 8) {

                if(storage > 64) {

                    amount = 65000;

                }

                else {
                    amount = 35000;
                }

            }
            else {

                amount = 20000;

            }


        }

        return amount;

    }

    void displayInfo(){

        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + calculatePrice());

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Processor: ");
        String processor = in.nextLine();
        System.out.println("Enter RAM: ");
        int ram = in.nextInt();
        System.out.println("Enter Storage: ");
        int storage = in.nextInt();

        Computer computer = new Computer(processor, ram, storage);
        computer.displayInfo();


    }

}
