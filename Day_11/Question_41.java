package summer_Assignment_25114FW001.Day_11;

import java.util.Scanner;

// Write a program to Write function to find sum of two numbers.

public class Question_41 {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        System.out.println("The sum of two numbers is " + sum(sc.nextInt(), sc.nextInt()));

        sc.close();
    }
}
