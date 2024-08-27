package Level_2_ClassesAndMethodOverloading;

class Bytes{
    byte num1,num2;

    public Bytes(byte num1,byte num2){
        this.num1=num1;
        this.num2=num2;
    }

    byte getNum1(){
        return num1;
    }
    byte getNum2(){
        return num2;
    }

}

class Int {

    int num1,num2;

    public Int(int num1,int num2){
        this.num1=num1;
        this.num2=num2;

    }

    int add(){
        return num1+num2;
    }

}

public class SumOfTwoBytes {

    public static void main(String[] args) {

        byte num1 = 127;
        byte num2 = 127;

        Bytes bytes = new Bytes(num1,num2);


        int newNum1 = bytes.getNum1();
        int newNum2 = bytes.getNum2();

        Int int1 = new Int(newNum1,newNum2);

        System.out.println(int1.add());





    }

}
