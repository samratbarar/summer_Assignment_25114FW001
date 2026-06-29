package summer_Assignment_25114FW001.Day_28;

import java.util.*;

// Write a program to Create library management system.

class Library {
    private int capacity;
    private int noOfAvailBook;
    private String[] availBook;
    private int noOfIssueBook;
    private String[] issueBook;

    public Library(int capacity) {
        this.capacity = capacity;
        availBook = new String[capacity];
        issueBook = new String[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean addBook(String bookName) {
        if (noOfAvailBook == capacity) {
            System.out.println("Book storing capacity is full");
            return false;
        }
        availBook[noOfAvailBook] = bookName;
        noOfAvailBook++;
        return true;
    }

    public boolean issueBook(String bookName) {
        if (capacity == noOfIssueBook) {
            System.out.println("Cannot issue: issued book limit reached");
            return false;
        }
        
        boolean isBookAvail = false;
        for (int k = 0; k < noOfAvailBook; k++) {
            if (availBook[k].equals(bookName)) {
                isBookAvail = true;
                break;
            }
        }

        if (isBookAvail) {
            issueBook[noOfIssueBook] = bookName;
            for (int i = 0; i < noOfAvailBook; i++) {
                if (availBook[i].equals(bookName)) {
                    for (int j = i; j < noOfAvailBook - 1; j++) {
                        availBook[j] = availBook[j + 1];
                    }
                    break;
                }
            }
            availBook[noOfAvailBook - 1] = null;
            noOfAvailBook--;
            noOfIssueBook++;
            return true;
        } else {
            System.out.println("book is not available");
            return false;
        }
    }

    public void showAvailableBooks() {
        System.out.println("List of available books are as follows ");
        for (int i = 0; i < noOfAvailBook; i++) {
            System.out.println((i+1) + ". " + availBook[i]);
        }
        System.out.println("--------Ended-------");
    }

    public void returnBook(String bookName) {
        boolean isIssuedBook = false;
        for (int k = 0; k < noOfIssueBook; k++) {
            if (issueBook[k].equals(bookName)) {
                isIssuedBook = true;
                break;
            }
        }
        if (isIssuedBook) {
            if (capacity == noOfAvailBook) {
                System.out.println("Cannot return: available shelf is full");
                return;
            }
            availBook[noOfAvailBook] = bookName;
            for (int i = 0; i < noOfIssueBook; i++) {
                if (issueBook[i].equals(bookName)) {
                    for (int j = i; j < noOfIssueBook - 1; j++) {
                        issueBook[j] = issueBook[j + 1];
                    }
                    break;
                }
            }
            issueBook[noOfIssueBook - 1] = null;
            noOfAvailBook++;
            noOfIssueBook--;
        } else {
            System.out.println("Invalid book return");
        }
    }

    public void showIssuedBooks() {
        System.out.println("The list of Issued books are as follows ");
        for (int i = 0; i < noOfIssueBook; i++) {
            System.out.println((i+1) + ". " + issueBook[i]);
        }
        System.out.println("-----Ended-----");
    }
}

public class Question_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of library of storing books");
        Library l = new Library(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter the available books and Writing -1stop to end the inputting");
        while (true) {
            String bookName = sc.nextLine();
            if (bookName.equals("-1stop")) {
                break;
            }
            if (!l.addBook(bookName)) {
                break;
            }
        }

        System.out.println("Enter the issued books and Writing -1stop to end the inputting");
        while (true) {
            String bookName = sc.nextLine();
            if (bookName.equals("-1stop")) {
                break;
            }
            if (!l.issueBook(bookName)) {
                System.out.println("Skipping as it cannot be issued: " + bookName);
            }
        }

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Show Available Books");
            System.out.println("4. Show Issued Books");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book name: ");
                    l.issueBook(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter book name: ");
                    l.returnBook(sc.nextLine());
                }
                case 3 -> l.showAvailableBooks();
                case 4 -> l.showIssuedBooks();
                case 5 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}