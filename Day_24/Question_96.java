package summer_Assignment_25114FW001.Day_24;

import java.util.*;

// Write a program to Remove duplicate characters.

public class Question_96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        StringBuilder str = new StringBuilder(sc.nextLine().trim());

        if (str.isEmpty()) {
            System.out.println("This is a empty string");
            sc.close();
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            } 

            if (found) {
                str.delete(i, i+1);
                i--;
            }
        }

        System.out.println("String after removing duplicates:" + str);

        sc.close();
    }
}
