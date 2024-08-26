package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class Dog {

    String breed;
    int age;
    int weight;

    public Dog(String breed, int age, int weight) {

        this.breed = breed;
        this.age = age;
        this.weight = weight;

    }

    int dogAge(int age) {

        return 7 * age;

    }

    void display(){

        System.out.println("Dog Breed: " + breed);
        System.out.println("Dog Age: " + dogAge(age));
        System.out.println("Dog Weight: " + weight);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Breed of the dog: ");
        String breed = in.nextLine();
        System.out.println("Enter the age of the dog: ");
        int age = in.nextInt();
        System.out.println("Enter the weight of the dog: ");
        int weight = in.nextInt();

        Dog dog = new Dog(breed, age, weight);

        dog.display();

    }

}
