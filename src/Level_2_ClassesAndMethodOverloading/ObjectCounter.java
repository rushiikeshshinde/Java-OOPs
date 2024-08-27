package Level_2_ClassesAndMethodOverloading;

public class ObjectCounter {
    private static int counter = 0;
    private final String name;

    // Constructor
    public ObjectCounter(String name) {
        this.name = name;
        counter++; // Increment the counter each time an object is created
    }

    // Method to get the current count
    public static int getCount() {
        return counter;
    }

    // Method to display object info
    public void displayInfo() {
        System.out.println("Object Name: " + name);
        System.out.println("Current Object Count: " + counter);
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter("First");
        obj1.displayInfo();

        ObjectCounter obj2 = new ObjectCounter("Second");
        obj2.displayInfo();

        ObjectCounter obj3 = new ObjectCounter("Third");
        obj3.displayInfo();

        System.out.println("Total objects created: " + ObjectCounter.getCount());
    }
}