package summer_Assignment_25114FW001.Day_21;

import java.util.*;

// Write a program to Count vowels and consonants. 

public class Question_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine().toLowerCase();

        int countV = 0, countC = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' 
                || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    countV++;
                } else {
                    countC++;
                }
            }

        }

        System.out.println("The count of vowels and consonants are " + countV + " and " + countC);

        sc.close();
    }
}
