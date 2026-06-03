package summer_Assignment_25114FW001.Day_7;

import java.util.*;

// Write a program to Recursive reverse number. 
public class Question_28 {
    public static int revNum(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        return revNum(n / 10, rev * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        System.out.println("The reverse of given number is " + revNum(num, 0));
    }
}