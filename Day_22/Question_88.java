package summer_Assignment_25114FW001.Day_22;

import java.util.*;

// Write a program to Remove spaces from string. 

public class Question_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        StringBuilder strTrim = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strTrim.append(str.charAt(i));
            }
        }
 
       //  System.out.println("The trim version is " + str.replace(" ", ""));
        System.out.println("The trim version is " + strTrim);

        sc.close();
    }
}
