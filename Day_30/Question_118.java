package summer_Assignment_25114FW001.Day_30;

import java.util.*;

// Write a program to Create mini library system. 

class Library {
    private int capacity;
    private int noOfAvailBook = 0;
    private String[] availBook;
    private int noOfIssueBook = 0;
    private String[] issueBook;

    public Library(int capacity) {
        this.capacity = capacity;
        availBook = new String[capacity];
        issueBook = new String[capacity];
    }

    public boolean addBook(String bookName) {
        if (noOfAvailBook == capacity) {
            System.out.println("Book storing capacity is full");
            return false;
        }
        availBook[noOfAvailBook++] = bookName;
        return true;
    }

    public boolean issueBook(String bookName) {
        if (noOfIssueBook == capacity) {
            System.out.println("Cannot issue: issued book limit reached");
            return false;
        }

        int index = -1;

        // FIX: null-safe search
        for (int i = 0; i < noOfAvailBook; i++) {
            if (availBook[i] != null && availBook[i].equals(bookName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Book is not available");
            return false;
        }

        // add to issued list
        issueBook[noOfIssueBook++] = bookName;

        // remove from available list (shift left)
        for (int i = index; i < noOfAvailBook - 1; i++) {
            availBook[i] = availBook[i + 1];
        }

        availBook[--noOfAvailBook] = null;

        return true;
    }

    public void returnBook(String bookName) {
        int index = -1;

        // FIX: null-safe search in issued books
        for (int i = 0; i < noOfIssueBook; i++) {
            if (issueBook[i] != null && issueBook[i].equals(bookName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Invalid book return");
            return;
        }

        if (noOfAvailBook == capacity) {
            System.out.println("Cannot return: available shelf is full");
            return;
        }

        // add back to available
        availBook[noOfAvailBook++] = bookName;

        // remove from issued list (shift left)
        for (int i = index; i < noOfIssueBook - 1; i++) {
            issueBook[i] = issueBook[i + 1];
        }

        issueBook[--noOfIssueBook] = null;
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        if (noOfAvailBook == 0) {
            System.out.println("No books available");
            return;
        }

        for (int i = 0; i < noOfAvailBook; i++) {
            System.out.println((i + 1) + ". " + availBook[i]);
        }
    }

    public void showIssuedBooks() {
        System.out.println("Issued Books:");
        if (noOfIssueBook == 0) {
            System.out.println("No books issued");
            return;
        }

        for (int i = 0; i < noOfIssueBook; i++) {
            System.out.println((i + 1) + ". " + issueBook[i]);
        }
    }
}

public class Question_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter library capacity:");
        Library l = new Library(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter available books (-1stop to end):");
        while (true) {
            String bookName = sc.nextLine();
            if (bookName.equals("-1stop"))
                break;
            l.addBook(bookName);
        }

        System.out.println("Enter issued books (-1stop to end):");
        while (true) {
            String bookName = sc.nextLine();
            if (bookName.equals("-1stop"))
                break;
            l.issueBook(bookName);
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
