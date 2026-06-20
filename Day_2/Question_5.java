package summer_Assignment_25114FW001.Day_2;

import java.util.*;

// Write a program to Find sum of digits of a number

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of the digits of given number is " + sum);

        sc.close();
    }
}