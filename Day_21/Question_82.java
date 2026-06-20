package summer_Assignment_25114FW001.Day_21;

import java.util.*;

// Write a program to Reverse a string. 

public class Question_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.nextLine();

        char[] arrStr = new char[str.length()];
        
        for (int i = 0; i < str.length()/2; i++) {
            arrStr[i] = str.charAt(str.length()-1-i);
            arrStr[arrStr.length-1-i] = str.charAt(i);
        }

        str = new String(arrStr);

        System.out.println("The reversed string is " + str);

        sc.close();
    }
}