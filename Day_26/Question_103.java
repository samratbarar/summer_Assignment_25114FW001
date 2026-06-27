package summer_Assignment_25114FW001.Day_26;

import java.util.*;

// Write a program to Create ATM simulation. 

class ATM {
    private Scanner sc;
    private int atmCash = 100000;
    private int userBalance = 2000000;
    private int userPin = 1234;
    private final int otp = 23214;

    public ATM(Scanner sc) {
        this.sc = sc;
    }

    public void greet() {
        System.out.println("Welcome to our ATM");
    }

    public void menu() {
        System.out.println("Please Enter the option number to select it");
        System.out.println("1 -> Cash Withdrawal\n2 -> Check balance\n3 -> Change pin\n4 -> Green pin");
    }

    public boolean isCorrectPin(int pin) {
        return pin == userPin;
    }

    public void cashWithdrawal(int userAmt) {
        System.out.println("Enter your pin");
        if (!isCorrectPin(sc.nextInt())) {
            System.out.println("Entered pin is incorrect, Please enter correct pin");
            return;
        }

        if (userAmt > atmCash || userAmt > 20000) {
            System.out.println("Sorry, Entered amount exceed limit\nPlease try again");
            return;
        }

        System.out.println("Processing...");

        if (userAmt <= this.userBalance) {
            System.out.println("Please take your money");
            this.userBalance -= userAmt;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Enter your pin");
        if (isCorrectPin(sc.nextInt())) {
            System.out.println("Balance : " + this.userBalance);
        } else {
            System.out.println("Entered pin is incorrect, Please enter correct pin");
        }
    }

    public void changePin() {
        System.out.println("Enter your current pin");
        if (isCorrectPin(sc.nextInt())) {
            int oldUserPin = this.userPin;

            System.out.println("Enter new pin");
            this.userPin = sc.nextInt();

            System.out.println("Confirm your new pin");
            if (userPin == sc.nextInt()) {
                System.out.println("Your pin updated succesfully");
            } else {
                this.userPin = oldUserPin;
                System.out.println("You enter different pins\nPlease try again");
            }
        } else {
            System.out.println("Entered pin is incorrect, Please enter correct pin");
        }
    }

    public void greenPin() {
        System.out.println("Enter the otp sended on your registered mobile number");
        if (this.otp == sc.nextInt()) {
            changePin();
        } else {
            System.out.println("Enter otp is incorrect \nPlease try again");
        }
    }

    public void functioning(int option) {
        while (option < 1 || option > 4) {
            System.out.println("Enter valid option");
            option = sc.nextInt();
        }

        switch (option) {

            case 1 -> {
                System.out.println("Enter the amount");
                cashWithdrawal(sc.nextInt());
            }

            case 2 -> checkBalance();

            case 3 -> changePin();

            case 4 -> greenPin();
        }
    }
}

public class Question_103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM machine = new ATM(sc);
        machine.greet();

        do {
            machine.menu();
            machine.functioning(sc.nextInt());
            System.out.println("If you want to do another action\nEnter 1 otherwise Enter any number");
        } while (sc.nextInt() == 1);
        
        System.out.println("Thank you for using our ATM");

        sc.close();
    }
}