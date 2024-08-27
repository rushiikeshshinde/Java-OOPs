package Level_3_AdvancedOOPs;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void output(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class SwapObjects {

    static void swap(Employee e1, Employee e2){

        String tempName;
        int tempAge;

        tempAge = e1.age;
        e1.age = e2.age;
        e2.age = tempAge;

        tempName = e1.name;
        e1.name = e2.name;
        e2.name = tempName;

    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("James", 20);
        Employee emp2 = new Employee("Bob", 30);

        System.out.println("Before swapping");
        emp1.output();
        emp2.output();

        swap(emp1,emp2);

        System.out.println("After swapping");
        emp1.output();
        emp2.output();


    }

}
