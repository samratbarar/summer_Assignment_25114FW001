package summer_Assignment_25114FW001.Day_22;

import java.util.*;

// Write a program to Character frequency.

public class Question_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("It has 0 characters");
            sc.close();
            return;
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                continue;
            }

            boolean isFound = false;
            for (int k = 0; k < i; k++) {
                if (sentence.charAt(i) == sentence.charAt(k)) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                continue;
            }

            int freq = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == sentence.charAt(i)) {
                    freq++;
                }
            } 
            
            System.out.println("The Character " + sentence.charAt(i) + " frequency is " + freq);
        }

        sc.close();
    }
}