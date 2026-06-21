package summer_Assignment_25114FW001.Day_22;

import java.util.*;

// Write a program to Check palindrome string. 

public class Question_85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("String is not palindrome");
                sc.close();
                return;
            }
        }

        System.out.println("String is palindrome");

        sc.close();
    }
}
