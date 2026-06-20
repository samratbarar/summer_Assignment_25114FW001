package summer_Assignment_25114FW001.Day_21;

import java.util.*;

// Write a program to Find string length without strlen(). 

public class Question_81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.nextLine();
        
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println("The given string length is " + count);

        sc.close();
    }
}
