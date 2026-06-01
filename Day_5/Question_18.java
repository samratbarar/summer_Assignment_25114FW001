package summer_Assignment_25114FW001.Day_5;

import java.util.*;

// Write a program to Check strong number. 

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt(), checker = num, sum = 0;

        if (num > 0) {
            while (num > 0) {
                int fact = 1;

                if (num % 10 != 0) {
                    fact *= num % 10;
                }

                for (int i = fact - 1; i > 1; i--) {
                    fact *= i;
                }

                sum += fact;

                num /= 10;
            }

            if (sum == checker) {
                System.out.println("Given number is strong number ");
            } else {
                System.out.println("Given number is not strong number ");
            }
        } else {
            System.out.println("given number is not strong number");
        }
    }
}
