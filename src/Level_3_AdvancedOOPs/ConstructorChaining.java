package Level_3_AdvancedOOPs;

class Chaining {

    int x,y;

    public Chaining() {
        System.out.println("Default Constructor Chaining Constructor");
    }
    public Chaining(int x) {
        this.x = x;
        System.out.println(this.x);
    }
    public Chaining(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("Sum: "+(this.x+this.y));
    }

}

public class ConstructorChaining {

    public static void main(String[] args) {

        Chaining chaining = new Chaining(11,12);



    }

}


