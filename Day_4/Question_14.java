package summer_Assignment_25114FW001.Day_4;

import java.util.Scanner;

// Write a program to Find nth Fibonacci term.

public class Question_14 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n of nth term");
        int n = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;
        int nextTerm = 0;

        for (int i = 3; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("The nth term of the fibonacci is " + nextTerm);
    }
}
