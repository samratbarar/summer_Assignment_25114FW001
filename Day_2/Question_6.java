package summer_Assignment_25114FW001.Day_2;

import java.util.*;

// Write a program to Reverse a number.

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int revNum = 0;

        while (num > 0) {
            revNum = revNum*10 + num%10;
            num /= 10;
        }

        System.out.println("The reverse of given number is " + revNum); 
        
        sc.close();
    }
}
