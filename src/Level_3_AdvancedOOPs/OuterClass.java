package Level_3_AdvancedOOPs;

class OuterClass {

    static class InnerClass {

        void show(){
            System.out.println("Inside InnerClass");
        }

    }

}

class getOutput {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.show();
    }
}
