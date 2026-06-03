package summer_Assignment_25114FW001.Day_7;

import java.util.*;

// Write a program to Recursive factorial. 

public class Question_25 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("The factorial is not defined for negative numbers ");
            return;
        }

        System.out.println("The factorial of given number is " + factorial(num));
    }
}
