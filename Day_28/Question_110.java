package summer_Assignment_25114FW001.Day_28;

import java.util.*;

// Write a program to Create bank account system.

class CustomerDetails {
    private String name;
    private String address;
    private char gender;
    private int age;
    private double balance;
    private ArrayList<String> transactions;

    public CustomerDetails(String name, String address, char gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance, char mode) {
        double amount = Math.abs(this.balance - balance);
        this.balance = balance;
        switch (mode) {
            case 'D' -> transactions.add("Deposited: +₹" + amount + " | Balance: ₹" + this.balance);
            case 'W' -> transactions.add("Withdrew: -₹" + amount + " | Balance: ₹" + this.balance);
            case 'T' -> transactions.add("Transferred: -₹" + amount + " | Balance: ₹" + this.balance);
            case 't' -> transactions.add("Transferred: +₹" + amount + " | Balance: ₹" + this.balance);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address + "\nBalance: "
                + balance;
    }
}

class Bank {
    private int accountNumber;
    private HashMap<Integer, CustomerDetails> customer;
    private final byte DEPOSIT_LIMIT = 100;
    private final byte WITHDRAWAL_LIMIT = 100;
    private final byte TRANSFER_LOWER_LIMIT = 100;
    private final int TRANSFER_UPPER_LIMIT = 100000;
    private final String NOT_FOUND = "Account is not found in bank ";

    public Bank() {
        this.customer = new HashMap<>();
        accountNumber++;
    }

    public int createAccount(CustomerDetails details) {
        customer.put(accountNumber, details);
        return accountNumber++;
    }

    public void deposit(int accNum, double amount) {
        if (amount < DEPOSIT_LIMIT) {
            System.out.println("Deposited amount is lesser than depositing limit");
            return;
        }

        if (customer.containsKey(accNum)) {
            CustomerDetails details = customer.get(accNum);
            details.setBalance(details.getBalance() + amount, 'D');
        } else {
            System.out.println(NOT_FOUND);
        }
    }

    public void withdrawal(int accNum, double amount) {
        if (amount < WITHDRAWAL_LIMIT) {
            System.out.println("Amount is lesser than withdrawing limit");
            return;
        }

        if (customer.containsKey(accNum)) {
            CustomerDetails details = customer.get(accNum);

            if (details.getBalance() >= amount) {
                details.setBalance(details.getBalance() - amount, 'W');
                System.out.println("Take your cash...");
            } else {
                System.out.println("Insufficient balance");
                System.out.println(details.getBalance());
            }
        } else {
            System.out.println(NOT_FOUND);
        }
    }

    public void transfer(int senderAccNum, double amount, int receiverAccNum) {
        if (amount < TRANSFER_LOWER_LIMIT) {
            System.out.println("Transfer amount is lesser than transferring lower limit");
            return;
        }

        if (amount > TRANSFER_UPPER_LIMIT) {
            System.out.println("Transfer amount is greater than transferring upper limit");
            return;
        }

        if (customer.containsKey(senderAccNum) && customer.containsKey(receiverAccNum)) {
            CustomerDetails senderDetails = customer.get(senderAccNum);
            CustomerDetails receiverDetails = customer.get(receiverAccNum);

            if (senderDetails.getBalance() >= amount) {
                senderDetails.setBalance(senderDetails.getBalance() - amount, 'T');
                receiverDetails.setBalance(receiverDetails.getBalance() + amount, 't');
                System.out.println("Transfer is completed");
            } else {
                System.out.println("Insufficient balance");
                System.out.println(senderDetails.getBalance());
            }
        } else if (customer.containsKey(senderAccNum)) {
            System.out.println("Receiver's Account is not found in bank ");
        } else if (customer.containsKey(receiverAccNum)) {
            System.out.println("Sender's Account is not found in bank ");
        } else {
            System.out.println("Both Account numbers are not found in bank ");
        }
    }

    public void showAccDetails(int accNum) {
        if (customer.containsKey(accNum)) {
            System.out.println(customer.get(accNum));
        } else {
            System.out.println(NOT_FOUND);
        }
    }

    public void showTransactionsHistory(int accNum) {
        if (customer.containsKey(accNum)) {
            ArrayList<String> history = customer.get(accNum).getTransactions();
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        } else {
            System.out.println(NOT_FOUND);
        }
    }
}

public class Question_110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account = new Bank();

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Show Account Details");
            System.out.println("6. Show Transactions");
            System.out.println("7. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter your name, address, gender(M/F), age");
                    CustomerDetails details = new CustomerDetails(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0),
                            Integer.parseInt(sc.nextLine()));
                    System.out.println("Your account is successfully created and your account number is "
                            + account.createAccount(details));
                }
                case 2 -> {
                    System.out.println("Enter your account number and amount ");
                    account.deposit(Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                }
                case 3 -> {
                    System.out.println("Enter your account number and amount ");
                    account.withdrawal(Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                }
                case 4 -> {
                    System.out.println(
                            "Enter the sender's account number, transfer amount and receiver's account number");
                    account.transfer(Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()),
                            Integer.parseInt(sc.nextLine()));
                }
                case 5 -> {
                    System.out.println("Enter your account number");
                    account.showAccDetails(Integer.parseInt(sc.nextLine()));
                }
                case 6 -> {
                    System.out.println("Enter your account number");
                    account.showTransactionsHistory(Integer.parseInt(sc.nextLine()));
                }
                case 7 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}