package Level_2_ClassesAndMethodOverloading;

public class CalculateAreaUsingOverloading {

    public int area (int a){

        return a * a;
    }

    public int area (double b){

        return (int) (Math.PI * b * b);

    }

    public int area (int a, int b){

        return a*b;

    }

    public static void main(String[] args) {
        CalculateAreaUsingOverloading calc = new CalculateAreaUsingOverloading();
        int sum2 = calc.area(10);
        int sum3 = calc.area(20.0);
        int sum4 = calc.area(10, 20);

        System.out.println("Area: " + sum2);
        System.out.println("Area: " + sum3);
        System.out.println("Area: " + sum4);
    }





}
