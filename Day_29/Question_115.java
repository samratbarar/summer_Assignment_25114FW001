package summer_Assignment_25114FW001.Day_29;

import java.util.*;

// Write a program to Create menu-driven string operations system.

class StringOperations {
    private String str;

    public StringOperations(String str) {
        this.str = str;
    }

    public void setString(String str) {
        this.str = str;
    }

    public void length() {
        System.out.println("Length of string: " + str.length());
    }

    public void reverse() {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reverse string: " + reverse);
    }

    public void palindrome() {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public void upperCase() {
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    public void lowerCase() {
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    public void countVowels() {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }

    public void compare(String secondString) {
        if (str.equals(secondString)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    public void concatenate(String secondString) {
        System.out.println("Concatenated string: " + str + secondString);
    }
}

public class Question_115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        StringOperations so = new StringOperations(input);

        while (true) {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find Length");
            System.out.println("2. Reverse String");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Convert Uppercase");
            System.out.println("5. Convert Lowercase");
            System.out.println("6. Count Vowels");
            System.out.println("7. Compare String");
            System.out.println("8. Concatenate String");
            System.out.println("9. Change String");
            System.out.println("10. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    so.length();
                }

                case 2 -> {
                    so.reverse();
                }

                case 3 -> {
                    so.palindrome();
                }

                case 4 -> {
                    so.upperCase();
                }

                case 5 -> {
                    so.lowerCase();
                }

                case 6 -> {
                    so.countVowels();   
                }

                case 7 -> {
                    System.out.print("Enter second string: ");
                    so.compare(sc.nextLine());
                }

                case 8 -> {
                    System.out.print("Enter second string: ");
                    so.concatenate(sc.nextLine());
                }

                case 9 -> {
                    System.out.print("Enter new string: ");
                    so.setString(sc.nextLine());

                    System.out.println("String updated successfully");
                }

                case 10 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}