package summer_Assignment_25114FW001.Day_23;

import java.util.*;

// Write a program to Find first repeating character.

public class Question_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("This is empty string");
            sc.close();
            return;            
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;                
            }

            boolean found = false;
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    continue;
                }
                
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            } 

            if (found) {
                System.out.println("The first repeating character is " + str.charAt(i));
                sc.close();
                return;
            }
        }

        System.out.println("There is no repeating character");

        sc.close();
    }
}
