package summer_Assignment_25114FW001.Day_4;

import java.util.*;

// Write a program to Check Armstrong number.

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int checker = num, noOfDigit = 0, sum = 0;

        while (num > 0) {
            noOfDigit++;
            num /= 10;
        }

        num = checker;

        while (num > 0) {
            sum += Math.pow(num%10 , noOfDigit);
            num /= 10;
        }

        if (checker == sum) {
            System.out.println("Given number is armstrong number ");
        } else {
            System.out.println("Given number is not armstrong number ");
        }

        sc.close();
    }   
}
