package summer_Assignment_25114FW001.Day_11;

import java.util.Scanner;

// Write a program to Write function to find factorial

public class Question_44 {
    public static int calcFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }

        return n * calcFact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int fact = calcFact(sc.nextInt());
        if (fact == -1) {
            System.out.println("factorial is not defined for negative numbers");
        } else 
        System.out.println("The factorial of given number is " + fact);
    }
}
