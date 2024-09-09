//
//package javauni;
//
//public class Bank {
//    String name,type;
//    double amount;
//    
//    Bank(){
//        name = "Zisan";
//        type = "student";
//        amount = 0.0;
//    }
//    double balance(){
//        return amount;
//    }
//    void deposit(double a){
//        amount = amount+a;
//        System.out.println(a+ "taka has been deposited");
//    }
//    void withdrew(double a){
//        if(amount<a){
//            System.out.println("Balance nai bey");
//        }
//        else{
//            amount = amount - a;
//            System.out.println("Amount uthsee ja sor");
//        }
//    }
//    public static void main(String ar[]){
//        Bank b = new Bank();
//        
//        System.out.println("Current amount is "+b.balance());
//        b.withdrew(400);
//        b.deposit(500000);
//        System.out.println("Current balance is "+b.balance());
//        b.withdrew(8990);
//        
//    }
//    
//}


package UML1_Bank;

import java.util.Scanner;

public class Bank {
    String name, type;
    double amount;

    // Constructor to initialize Bank object with user input
    Bank(String name, String type, double amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
    }

    double balance() {
        return amount;
    }

    void deposit(double a) {
        amount = amount + a;
        System.out.println(a + " taka has been deposited.");
    }

    void withdraw(double a) {
        if (amount < a) {
            System.out.println("Insufficient balance.");
        } else {
            amount = amount - a;
            System.out.println(a + " taka has been withdrawn.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for name, type, and initial amount
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account type (e.g., student, savings): ");
        String type = scanner.nextLine();

        System.out.print("Enter initial amount: ");
        double initialAmount = scanner.nextDouble();

        // Create Bank object with user inputs
        Bank b = new Bank(name, type, initialAmount);

        // Display current balance
        System.out.println("Current amount is " + b.balance());

        // Deposit and withdraw actions with user input
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        b.withdraw(withdrawAmount);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        b.deposit(depositAmount);

        System.out.println("Current balance is " + b.balance());

        System.out.print("Enter amount to withdraw: ");
        withdrawAmount = scanner.nextDouble();
        b.withdraw(withdrawAmount);

        scanner.close();
    }
}
