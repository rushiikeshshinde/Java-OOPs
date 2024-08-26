package Level_1_ClassesAndObjects;

import java.util.Scanner;

public class BankAccount {

    double balance;
    int accountNumber;
    int option;

    public BankAccount(int accountNumber, double balance,int option) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.option = option;

    }

    void deposit(double amount) {

        this.balance += amount;
        System.out.println("Deposited " + amount + " to the account " + this.accountNumber);

    }

    void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdrawn " + amount + " from the account " + this.accountNumber);
    }

    void display() {

        System.out.println("Account number " + this.accountNumber);
        System.out.println("Balance " + this.balance);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option=0;
        System.out.println("Enter account number: ");
        int accountNumber = in.nextInt();
        System.out.println("Enter balance: ");
        double balance = in.nextDouble();


        BankAccount account = new BankAccount(accountNumber, balance,option);

        while (true) {

            System.out.println("Enter 1 to deposit or Enter 2 to withdraw or Enter 3 to exit: ");
            option = in.nextInt();

            if (option == 1) {

                System.out.println("Enter amount to deposit: ");
                double amount = in.nextDouble();

                account.deposit(amount);
                account.display();

            }
            else if (option == 2) {

                System.out.println("Enter amount to withdraw: ");
                double amount = in.nextDouble();

                account.withdraw(amount);
                account.display();

            }
            else if(option == 3) {

                System.out.println("Thank you, Please Visit Again.");
                break;

            }
            else {

                System.out.println("Invalid option");

            }
        }


    }


}
