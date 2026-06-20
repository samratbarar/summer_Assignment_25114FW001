package summer_Assignment_25114FW001.Day_4;

import java.util.*;

// Write a program to Generate Fibonacci series. 

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms of fibonacci series ");
        int range = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;
        int nextTerm;

        System.out.print(firstTerm + " ");
        if (range > 1) {
            System.out.print(secondTerm + " ");
        }

        for (int i = 3; i <= range; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(nextTerm + " ");
        }

        sc.close();
    }
}
