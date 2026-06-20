package summer_Assignment_25114FW001.Day_2;

import java.util.*;

// Write a program to Check whether a number is palindrome.

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int revNum = 0;
        int checker = num;

        while (num > 0) {
            revNum = revNum*10 + num%10;
            num /= 10;
        }

        if (checker == revNum) {
            System.out.println("Given number is palindrome number ");
        } else {
            System.out.println("Given number is not palindrome number ");
        }

        sc.close();
    }
}
