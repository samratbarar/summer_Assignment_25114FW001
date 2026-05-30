package summer_Assignment_25114FW001.Day_3;

import java.util.Scanner;

// Write a program to Find GCD of two numbers

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = 1;
        int min = num1;

        if (num1 > num2) {
            min = num2;
        } else if (num1 < num2) {
            min = num1;
        }

        // gcd is greatest number which can divide both numbers

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD of given numbers is " + gcd);
    }
}
