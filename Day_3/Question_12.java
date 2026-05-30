package summer_Assignment_25114FW001.Day_3;

import java.util.Scanner;

// Write a program to Find LCM of two numbers. 

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // LCM is the minimum number is divided by both the numbers

        int lcm = 1;

        for (int i = 2; num1 != 1 || num2 != 1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                lcm *= i;
                num1 /= i;
                num2 /= i;
                i--;
            } else if (num1 % i == 0) {
                lcm *= i;
                num1 /= i;
                i--;
            } else if (num2 % i == 0) {
                lcm *= i;
                num2 /= i;
                i--;
            }
        }

        System.out.println("The LCM of given numbers is " + lcm);

        // second way is usd formula after calculating gcd 
        /*
        LCM(a,b) = a*b / GCD(a,b)
        */
    }   
}
