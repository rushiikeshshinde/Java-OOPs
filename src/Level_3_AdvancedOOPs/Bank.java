package Level_3_AdvancedOOPs;


class BankAcct{

    static int roi = 40;
    static class Interest {
        void show() {
            System.out.println(roi);
        }
    }

}

public class Bank {

    public static void main(String[] args) {

        BankAcct.Interest interest = new BankAcct.Interest();
        interest.show();

    }

}
