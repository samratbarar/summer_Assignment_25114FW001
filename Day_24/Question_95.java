package summer_Assignment_25114FW001.Day_24;

import java.util.*;

// Write a program to Find longest word. 

public class Question_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("This is a empty string");
            sc.close();
            return;
        }

        StringBuilder word = new StringBuilder();
        StringBuilder longest = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word.append(str.charAt(i));
            } else {
                if (word.length() > longest.length()) {
                    longest = new StringBuilder(word);
                } 
                    
                word.delete(0, word.length());
            
            }
        }

        if (word.length() > longest.length()) {
            longest = new StringBuilder(word);
        }

        System.out.println("The longest word in the string is " + longest);

        sc.close();
    }
}
